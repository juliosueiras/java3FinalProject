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
        boolean valid = true;
        
        if (isCustomerNull()) {
            valid = false;
        }
        if (!isCustomerNumeric()) {
            valid = false;
        }
        if (isPickupDayNull()) {
            valid = false;
        } 
        if (!isPickupDayInRange()) {
            valid = false;
        }
        if (isPickupMonthNull()) {
            valid = false;
        }
        if (!isPickupMonthInRange()) {
            valid = false;
        }
        if (isPickupYearNull()) {
            valid = false;
        }
        if (!isPickupYearInRange()) {
            valid = false;
        }
        if (isPickupHourNull()) {
            valid = false;
        }
        if (!isPickupHourInRange()) {
            valid = false;
        }
        
        if (isDropoffDayNull()) {
            valid = false;
        }
        if (!isDropoffDayInRange()) {
            valid = false;
        }
        if (isDropoffMonthNull()) {
            valid = false;
        }
        if (!isDropoffMonthInRange()) {
            valid = false;
        }
        if (isDropoffYearNull()) {
            valid = false;
        }
        if (!isDropoffYearInRange()) {
            valid = false;
        }
        if (isDropoffHourNull()) {
            valid = false;
        }
        if (!isDropoffHourInRange()) {
            valid = false;
        }
        if (isCreditCardTypeNull()) {
            valid = false;
        }
        if (!isCreditCardTypeInRange()) {
            valid = false;
        }
        if (isCreditCardNoNull()) {
            valid = false;
        }
        if (!isCreditCardNoInRange()) {
            valid = false;
        }
        
        return valid;
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
            return true;
        }
        return false;
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
            return true;
        }
        return false;
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
            return true;
        }
        return false;
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
            return true;
        }
        return false;
    }
    
    public boolean isPickupYearInRange(){
        if (Integer.parseInt(formRequest.getParameter("pickupYear")) != 2014 || Integer.parseInt(formRequest.getParameter("pickupYear")) != 2015) {
            errorCodes.add(1042);
            return false;
        }
        bean.setPickupYear(Integer.parseInt(formRequest.getParameter("pickupYear")));
        return true;
    }
    
    public boolean isPickupHourNull(){
        if(formRequest.getParameter("pickupHour").isEmpty()){
            errorCodes.add(1051);
            return true;
        }
        return false;
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
            return true;
        }
        return false;
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
            return true;
        }
        return false;
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
            return true;
        }
        return false;
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
            return true;
        }
        return false;
    }
    
    public boolean isDropoffHourInRange(){
        if (Integer.parseInt(formRequest.getParameter("dropoffHour")) < 0 || Integer.parseInt(formRequest.getParameter("dropoffHour")) > 23) {
            errorCodes.add(1092);
            return false;
        }
        bean.setDropoffHour(Integer.parseInt(formRequest.getParameter("dropoffHour")));
        return true;
    }
    
    public boolean isCarTypeNull(){
        if(formRequest.getParameter("cartype").isEmpty()){
            errorCodes.add(1101);
            return true;
        }
        return false;
    }
    
    public boolean isCarTypeInRange(){
        if (!formRequest.getParameter("cartype").equalsIgnoreCase("economy") 
                || !formRequest.getParameter("cartype").equalsIgnoreCase("standard")
                || !formRequest.getParameter("cartype").equalsIgnoreCase("luxury")
                || !formRequest.getParameter("cartype").equalsIgnoreCase("minivan")) {
            errorCodes.add(1102);
            return false;
        }
        bean.setDropoffHour(Integer.parseInt(formRequest.getParameter("dropoffHour")));
        return true;
    }
    
    public boolean isCreditCardTypeNull(){
        if(formRequest.getParameter("creditCardType").isEmpty()){
            errorCodes.add(1111);
            return true;
        }
        return false;
    }
    
    public boolean isCreditCardTypeInRange(){
        if( !formRequest.getParameter("cerditCardType").equalsIgnoreCase("visa") 
                || !formRequest.getParameter("cerditCardType").equalsIgnoreCase("mastercard")) {
            errorCodes.add(1112);
            return false;
        }
        bean.setCardType(formRequest.getParameter("cerditCardType"));
        return true;
    }
    
    public boolean isCreditCardNoNull(){
        if(formRequest.getParameter("creditCardNo").isEmpty()){
            errorCodes.add(1121);
            return true;
        }
        return false;
    }
    
    public boolean isCreditCardNoInRange(){
        String cardType = formRequest.getParameter("creditCardType");
        String cardNo = formRequest.getParameter("creditCardNo").trim();
        
        if (cardType.equalsIgnoreCase("visa")) {
            if (cardNo.indexOf(0) != '4' && (cardNo.length() != 13 || cardNo.length() != 16)) {
                errorCodes.add(1122);
                return false;
            }
        } else if (cardType.equalsIgnoreCase("mastercard")) {
            if ( (!cardNo.startsWith("51") || !cardNo.startsWith("52") || !cardNo.startsWith("53") || !cardNo.startsWith("54") || !cardNo.startsWith("55"))
                    && cardNo.length() != 16) {
                errorCodes.add(1122);
                return false;
            }
        }
        bean.setCardNumber(formRequest.getParameter(cardNo));
        return true;
    }
}
