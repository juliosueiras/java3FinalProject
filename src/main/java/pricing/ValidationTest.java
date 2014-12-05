package pricing;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import dataaccess.CarTypeNotFoundException;
import dataaccess.DataAccess;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author junghun lee and julio tain sueiras
 */
@WebServlet(name = "ValidationTest")
public class ValidationTest extends HttpServlet {
    private RentalBean custBean = new RentalBean();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RentalFormValidator formValidator = new RentalFormValidator(request);
        boolean validation = formValidator.isValid();
        if(validation){
            DataAccess db = new DataAccess();
            db.connection();
            boolean custNumberExist = db.doesCustNumberExist(Integer.parseInt(request.getParameter("customerNo")));

            if(custNumberExist){
                custBean = formValidator.getBean();
		custBean.setRentalType(request.getParameter("cartype"));
		custBean.setCardType(request.getParameter("creditCardType"));

                try {
                    custBean.setPriceSchedule(db.getCarTypePriceSchedule(custBean.getRentalType()));
                } catch (CarTypeNotFoundException e) {
                    e.printStackTrace();
                }
                System.out.println(custBean.getPrice());
                db.disconnect();
                request.setAttribute("bean", custBean);
                getServletContext().getRequestDispatcher("/rentals.jsp").forward(request,response);

            }else{
                db.disconnect();
                getServletContext().getRequestDispatcher("/invalidCustomer.jsp").forward(request, response);
            }

        } else{
            ArrayList<Integer> errorList = formValidator.getErrorCodes();
            request.setAttribute("errorCodes", errorList);
            getServletContext().getRequestDispatcher("/errors.jsp").forward(request, response);
        }

    }


    public static void setUpBean(HttpServletRequest request, RentalBean bean){
        bean.setCustomerNumber(Integer.parseInt(request.getParameter("customerNo")));
        bean.setPickupHour(Integer.parseInt(request.getParameter("pickupHour")));
        bean.setPickupDay(Integer.parseInt(request.getParameter("pickupDay")));
        bean.setPickupMon(Integer.parseInt(request.getParameter("pickupMonth")));
        bean.setPickupYear(Integer.parseInt(request.getParameter("pickupYear")));
        bean.setDropoffHour(Integer.parseInt(request.getParameter("dropoffHour")));
        bean.setDropoffDay(Integer.parseInt(request.getParameter("dropoffDay")));
        bean.setDropoffMon(Integer.parseInt(request.getParameter("dropoffMonth")));
        bean.setDropoffYear(Integer.parseInt(request.getParameter("dropoffYear")));
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
        processRequest(request, response);
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
