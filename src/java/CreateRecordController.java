/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Model.HotelDAO;
import Model.HotelService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alex
 */
@WebServlet(urlPatterns = {"/createRec"})
public class CreateRecordController extends HttpServlet {

    private static final String RESULT_PAGE = "editRec.jsp";

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

                HotelService hs = new HotelService( new HotelDAO() );
        
        List list;
        try {
            list = hs.findAllHotels();
            request.setAttribute("list", list);
        } catch (Exception ex) {
            ex.getLocalizedMessage();
        }
        
        
        
        RequestDispatcher view = request.getRequestDispatcher(RESULT_PAGE);
        view.forward(request, response);
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String hotelName = request.getParameter("hotel_name");
        String street = request.getParameter("street");
        String city = request.getParameter("city");
        String state = request.getParameter("state");

        HotelService hotelService = new HotelService(new HotelDAO());

        hotelService.createRecord(hotelName, street, city, state);

        try {

            List list = hotelService.findAllHotels();
            request.setAttribute("list", list);
        } catch (Exception ex) {
            ex.getLocalizedMessage();
        }

        processRequest(request, response);
        
        RequestDispatcher view
                = request.getRequestDispatcher(RESULT_PAGE);
        view.forward(request, response);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
