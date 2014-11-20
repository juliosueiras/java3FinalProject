/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pricing;

import java.math.BigDecimal;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author jhlee
 */
public class RentalFormValidator{
    private HttpServletRequest formRequest;
    private ArrayList<Integer> errorCodes;
    RentalBean bean = new RentalBean();
    

    public RentalFormValidator(HttpServletRequest formRequest) {
        this.formRequest = formRequest;
        this.errorCodes = new ArrayList<Integer>();
    }
    
    public boolean isValid(){
        
        return false;
    }

    public void setErrorCodes(ArrayList<Integer> errorCodes) {
        this.errorCodes = errorCodes;
    }
    
    public ArrayList<Integer> getErrors(){
        return errorCodes;
    }
    
    public boolean isCustomerNull(){
        if(formRequest.getParameter("customerNo").isEmpty()){
            errorCodes.add(1011);
            return false;
        }
        return true;
    }
    
    public boolean isCustomerNumeric(){
        try {
            Integer.valueOf(formRequest.getParameter("customerNo"));
        } catch (NumberFormatException e) {
            errorCodes.add(1012);
            return false;
        }
        bean.setCustomerNumber(formRequest.getParameter("customerNo"));
        return true;
    }
    
    public boolean isPickupDayNull(){
        if(formRequest.getParameter("pickupDay").isEmpty()){
            errorCodes.add(1021);
            return false;
        }
        return true;
    }
    
    public boolean isPickupDayInRange(){
        if (Integer.parseInt(formRequest.getParameter("pickupDay")) < 1 || Integer.parseInt(formRequest.getParameter("pickupDay")) > 31) {
            errorCodes.add(1022);
            return false;
        }
        bean.setPickupDay(Integer.parseInt(formRequest.getParameter("pickupDay")));
        return true;
    }
    
    public boolean isPickupMonthNull(){
        if(formRequest.getParameter("pickupMonth").isEmpty()){
            errorCodes.add(1031);
            return false;
        }
        return true;
    }
    
    public boolean isPickupMonthInRange(){
        if (Integer.parseInt(formRequest.getParameter("pickupMonth")) < 1 || Integer.parseInt(formRequest.getParameter("pickupMonth")) > 12) {
            errorCodes.add(1032);
            return false;
        }
        bean.setPickupMon(Integer.parseInt(formRequest.getParameter("pickupMonth")));
        return true;
    }
    
    public boolean isPickupYearNull(){
        if(formRequest.getParameter("pickupYear").isEmpty()){
            errorCodes.add(1041);
            return false;
        }
        return true;
    }
    
    public boolean isPickupYearInRange(){
        if (Integer.parseInt(formRequest.getParameter("pickupYear")) == 2014 || Integer.parseInt(formRequest.getParameter("pickupYear")) == 2015) {
            errorCodes.add(1042);
            return false;
        }
        bean.setPickupYear(Integer.parseInt(formRequest.getParameter("pickupYear")));
        return true;
    }
    
    public boolean isPickupHourNull(){
        if(formRequest.getParameter("pickupHour").isEmpty()){
            errorCodes.add(1051);
            return false;
        }
        return true;
    }
    
    public boolean isPickupHourInRange(){
        if (Integer.parseInt(formRequest.getParameter("pickupHour")) < 0 || Integer.parseInt(formRequest.getParameter("pickupHour")) > 23) {
            errorCodes.add(1052);
            return false;
        }
        bean.setPickupHour(Integer.parseInt(formRequest.getParameter("pickupHour")));
        return true;
    }
    
    public boolean isDropoffDayNull(){
        if(formRequest.getParameter("dropoffDay").isEmpty()){
            errorCodes.add(1061);
            return false;
        }
        return true;
    }
    
    public boolean isDropoffDayInRange(){
        if (Integer.parseInt(formRequest.getParameter("dropoffDay")) < 1 || Integer.parseInt(formRequest.getParameter("dropoffDay")) > 31) {
            errorCodes.add(1062);
            return false;
        }
        bean.setDropoffDay(Integer.parseInt(formRequest.getParameter("dropoffDay")));
        return true;
    }
    
    public boolean isDropoffMonthNull(){
        if(formRequest.getParameter("dropoffMonth").isEmpty()){
            errorCodes.add(1071);
            return false;
        }
        return true;
    }
    
    public boolean isDropoffMonthInRange(){
        if (Integer.parseInt(formRequest.getParameter("dropoffMonth")) < 1 || Integer.parseInt(formRequest.getParameter("dropoffMonth")) > 12) {
            errorCodes.add(1072);
            return false;
        }
        bean.setDropoffMon(Integer.parseInt(formRequest.getParameter("dropoffMonth")));
        return true;
    }
    
    public boolean isDropoffYearNull(){
        if(formRequest.getParameter("dropoffYear").isEmpty()){
            errorCodes.add(1081);
            return false;
        }
        return true;
    }
    
    public boolean isDropoffYearInRange(){
        if (Integer.parseInt(formRequest.getParameter("dropoffDay")) == 2014 || Integer.parseInt(formRequest.getParameter("dropoffDay")) == 2015) {
            errorCodes.add(1082);
            return false;
        }
        bean.setDropoffYear(Integer.parseInt(formRequest.getParameter("dropoffYear")));
        return true;
    }
    
    public boolean isDropoffHourNull(){
        if(formRequest.getParameter("dropoffHour").isEmpty()){
            errorCodes.add(1091);
            return false;
        }
        return true;
    }
    
    public boolean isDropoffHourInRange(){
        if (Integer.parseInt(formRequest.getParameter("dropoffHour")) < 0 || Integer.parseInt(formRequest.getParameter("dropoffHour")) > 23) {
            errorCodes.add(1092);
            return false;
        }
        bean.setDropoffHour(Integer.parseInt(formRequest.getParameter("dropoffHour")));
        return true;
    }
}
