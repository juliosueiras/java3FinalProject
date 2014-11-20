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
  static {
    CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.ping();
  }

    private HttpServletRequest formRequest;
    private ArrayList<Integer> errorCodes;
    RentalBean bean = new RentalBean();
  {
    CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[1]++;
  }
    

    public RentalFormValidator(HttpServletRequest formRequest) {
        this.formRequest = formRequest;
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[2]++;
        this.errorCodes = new ArrayList<Integer>();
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[3]++;
    }
    
    public boolean isValid(){
        
        return false;
    }

    public void setErrorCodes(ArrayList<Integer> errorCodes) {
        this.errorCodes = errorCodes;
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[4]++;
    }
    
    public ArrayList<Integer> getErrors(){
        return errorCodes;
    }
    
    public boolean isCustomerNull(){
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[5]++;
int CodeCoverConditionCoverageHelper_C1;
        if((((((CodeCoverConditionCoverageHelper_C1 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C1 |= (2)) == 0 || true) &&
 ((formRequest.getParameter("customerNo").isEmpty()) && 
  ((CodeCoverConditionCoverageHelper_C1 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.conditionCounters[1].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C1, 1) || true)) || (CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.conditionCounters[1].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C1, 1) && false)){
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.branches[1]++;
            errorCodes.add(1011);
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[6]++;
            return false;

        } else {
  CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.branches[2]++;}
        return true;
    }
    
    public boolean isCustomerNumeric(){
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[7]++;
boolean CodeCoverTryBranchHelper_Try1 = false;
        try {
CodeCoverTryBranchHelper_Try1 = true;
            Integer.valueOf(formRequest.getParameter("customerNo"));
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[8]++;
        } catch (NumberFormatException e) {
CodeCoverTryBranchHelper_Try1 = false;
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.branches[4]++;
            errorCodes.add(1012);
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[9]++;
            return false;
        } finally {
    if ( CodeCoverTryBranchHelper_Try1 ) {
  CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.branches[3]++;
}
  }
        bean.setCustomerNumber(formRequest.getParameter("customerNo"));
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[10]++;
        return true;
    }
    
    public boolean isPickupDayNull(){
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[11]++;
int CodeCoverConditionCoverageHelper_C2;
        if((((((CodeCoverConditionCoverageHelper_C2 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C2 |= (2)) == 0 || true) &&
 ((formRequest.getParameter("pickupDay").isEmpty()) && 
  ((CodeCoverConditionCoverageHelper_C2 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.conditionCounters[2].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C2, 1) || true)) || (CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.conditionCounters[2].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C2, 1) && false)){
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.branches[5]++;
            errorCodes.add(1021);
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[12]++;
            return false;

        } else {
  CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.branches[6]++;}
        return true;
    }
    
    public boolean isPickupDayInRange(){
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[13]++;
int CodeCoverConditionCoverageHelper_C3;
        if ((((((CodeCoverConditionCoverageHelper_C3 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C3 |= (8)) == 0 || true) &&
 ((Integer.parseInt(formRequest.getParameter("pickupDay")) < 1) && 
  ((CodeCoverConditionCoverageHelper_C3 |= (4)) == 0 || true)))
 || 
(((CodeCoverConditionCoverageHelper_C3 |= (2)) == 0 || true) &&
 ((Integer.parseInt(formRequest.getParameter("pickupDay")) > 31) && 
  ((CodeCoverConditionCoverageHelper_C3 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.conditionCounters[3].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C3, 2) || true)) || (CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.conditionCounters[3].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C3, 2) && false)) {
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.branches[7]++;
            errorCodes.add(1022);
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[14]++;
            return false;

        } else {
  CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.branches[8]++;}
        bean.setPickupDay(Integer.parseInt(formRequest.getParameter("pickupDay")));
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[15]++;
        return true;
    }
    
    public boolean isPickupMonthNull(){
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[16]++;
int CodeCoverConditionCoverageHelper_C4;
        if((((((CodeCoverConditionCoverageHelper_C4 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C4 |= (2)) == 0 || true) &&
 ((formRequest.getParameter("pickupMonth").isEmpty()) && 
  ((CodeCoverConditionCoverageHelper_C4 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.conditionCounters[4].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C4, 1) || true)) || (CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.conditionCounters[4].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C4, 1) && false)){
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.branches[9]++;
            errorCodes.add(1031);
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[17]++;
            return false;

        } else {
  CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.branches[10]++;}
        return true;
    }
    
    public boolean isPickupMonthInRange(){
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[18]++;
int CodeCoverConditionCoverageHelper_C5;
        if ((((((CodeCoverConditionCoverageHelper_C5 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C5 |= (8)) == 0 || true) &&
 ((Integer.parseInt(formRequest.getParameter("pickupMonth")) < 1) && 
  ((CodeCoverConditionCoverageHelper_C5 |= (4)) == 0 || true)))
 || 
(((CodeCoverConditionCoverageHelper_C5 |= (2)) == 0 || true) &&
 ((Integer.parseInt(formRequest.getParameter("pickupMonth")) > 12) && 
  ((CodeCoverConditionCoverageHelper_C5 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.conditionCounters[5].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C5, 2) || true)) || (CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.conditionCounters[5].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C5, 2) && false)) {
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.branches[11]++;
            errorCodes.add(1032);
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[19]++;
            return false;

        } else {
  CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.branches[12]++;}
        bean.setPickupMon(Integer.parseInt(formRequest.getParameter("pickupMonth")));
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[20]++;
        return true;
    }
    
    public boolean isPickupYearNull(){
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[21]++;
int CodeCoverConditionCoverageHelper_C6;
        if((((((CodeCoverConditionCoverageHelper_C6 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C6 |= (2)) == 0 || true) &&
 ((formRequest.getParameter("pickupYear").isEmpty()) && 
  ((CodeCoverConditionCoverageHelper_C6 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.conditionCounters[6].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C6, 1) || true)) || (CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.conditionCounters[6].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C6, 1) && false)){
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.branches[13]++;
            errorCodes.add(1041);
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[22]++;
            return false;

        } else {
  CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.branches[14]++;}
        return true;
    }
    
    public boolean isPickupYearInRange(){
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[23]++;
int CodeCoverConditionCoverageHelper_C7;
        if ((((((CodeCoverConditionCoverageHelper_C7 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C7 |= (8)) == 0 || true) &&
 ((Integer.parseInt(formRequest.getParameter("pickupYear")) == 2014) && 
  ((CodeCoverConditionCoverageHelper_C7 |= (4)) == 0 || true)))
 || 
(((CodeCoverConditionCoverageHelper_C7 |= (2)) == 0 || true) &&
 ((Integer.parseInt(formRequest.getParameter("pickupYear")) == 2015) && 
  ((CodeCoverConditionCoverageHelper_C7 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.conditionCounters[7].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C7, 2) || true)) || (CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.conditionCounters[7].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C7, 2) && false)) {
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.branches[15]++;
            errorCodes.add(1042);
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[24]++;
            return false;

        } else {
  CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.branches[16]++;}
        bean.setPickupYear(Integer.parseInt(formRequest.getParameter("pickupYear")));
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[25]++;
        return true;
    }
    
    public boolean isPickupHourNull(){
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[26]++;
int CodeCoverConditionCoverageHelper_C8;
        if((((((CodeCoverConditionCoverageHelper_C8 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C8 |= (2)) == 0 || true) &&
 ((formRequest.getParameter("pickupHour").isEmpty()) && 
  ((CodeCoverConditionCoverageHelper_C8 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.conditionCounters[8].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C8, 1) || true)) || (CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.conditionCounters[8].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C8, 1) && false)){
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.branches[17]++;
            errorCodes.add(1051);
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[27]++;
            return false;

        } else {
  CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.branches[18]++;}
        return true;
    }
    
    public boolean isPickupHourInRange(){
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[28]++;
int CodeCoverConditionCoverageHelper_C9;
        if ((((((CodeCoverConditionCoverageHelper_C9 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C9 |= (8)) == 0 || true) &&
 ((Integer.parseInt(formRequest.getParameter("pickupHour")) < 0) && 
  ((CodeCoverConditionCoverageHelper_C9 |= (4)) == 0 || true)))
 || 
(((CodeCoverConditionCoverageHelper_C9 |= (2)) == 0 || true) &&
 ((Integer.parseInt(formRequest.getParameter("pickupHour")) > 23) && 
  ((CodeCoverConditionCoverageHelper_C9 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.conditionCounters[9].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C9, 2) || true)) || (CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.conditionCounters[9].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C9, 2) && false)) {
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.branches[19]++;
            errorCodes.add(1052);
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[29]++;
            return false;

        } else {
  CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.branches[20]++;}
        bean.setPickupHour(Integer.parseInt(formRequest.getParameter("pickupHour")));
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[30]++;
        return true;
    }
    
    public boolean isDropoffDayNull(){
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[31]++;
int CodeCoverConditionCoverageHelper_C10;
        if((((((CodeCoverConditionCoverageHelper_C10 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C10 |= (2)) == 0 || true) &&
 ((formRequest.getParameter("dropoffDay").isEmpty()) && 
  ((CodeCoverConditionCoverageHelper_C10 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.conditionCounters[10].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C10, 1) || true)) || (CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.conditionCounters[10].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C10, 1) && false)){
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.branches[21]++;
            errorCodes.add(1061);
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[32]++;
            return false;

        } else {
  CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.branches[22]++;}
        return true;
    }
    
    public boolean isDropoffDayInRange(){
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[33]++;
int CodeCoverConditionCoverageHelper_C11;
        if ((((((CodeCoverConditionCoverageHelper_C11 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C11 |= (8)) == 0 || true) &&
 ((Integer.parseInt(formRequest.getParameter("dropoffDay")) < 1) && 
  ((CodeCoverConditionCoverageHelper_C11 |= (4)) == 0 || true)))
 || 
(((CodeCoverConditionCoverageHelper_C11 |= (2)) == 0 || true) &&
 ((Integer.parseInt(formRequest.getParameter("dropoffDay")) > 31) && 
  ((CodeCoverConditionCoverageHelper_C11 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.conditionCounters[11].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C11, 2) || true)) || (CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.conditionCounters[11].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C11, 2) && false)) {
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.branches[23]++;
            errorCodes.add(1062);
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[34]++;
            return false;

        } else {
  CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.branches[24]++;}
        bean.setDropoffDay(Integer.parseInt(formRequest.getParameter("dropoffDay")));
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[35]++;
        return true;
    }
    
    public boolean isDropoffMonthNull(){
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[36]++;
int CodeCoverConditionCoverageHelper_C12;
        if((((((CodeCoverConditionCoverageHelper_C12 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C12 |= (2)) == 0 || true) &&
 ((formRequest.getParameter("dropoffMonth").isEmpty()) && 
  ((CodeCoverConditionCoverageHelper_C12 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.conditionCounters[12].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C12, 1) || true)) || (CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.conditionCounters[12].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C12, 1) && false)){
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.branches[25]++;
            errorCodes.add(1071);
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[37]++;
            return false;

        } else {
  CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.branches[26]++;}
        return true;
    }
    
    public boolean isDropoffMonthInRange(){
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[38]++;
int CodeCoverConditionCoverageHelper_C13;
        if ((((((CodeCoverConditionCoverageHelper_C13 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C13 |= (8)) == 0 || true) &&
 ((Integer.parseInt(formRequest.getParameter("dropoffMonth")) < 1) && 
  ((CodeCoverConditionCoverageHelper_C13 |= (4)) == 0 || true)))
 || 
(((CodeCoverConditionCoverageHelper_C13 |= (2)) == 0 || true) &&
 ((Integer.parseInt(formRequest.getParameter("dropoffMonth")) > 12) && 
  ((CodeCoverConditionCoverageHelper_C13 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.conditionCounters[13].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C13, 2) || true)) || (CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.conditionCounters[13].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C13, 2) && false)) {
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.branches[27]++;
            errorCodes.add(1072);
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[39]++;
            return false;

        } else {
  CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.branches[28]++;}
        bean.setDropoffMon(Integer.parseInt(formRequest.getParameter("dropoffMonth")));
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[40]++;
        return true;
    }
    
    public boolean isDropoffYearNull(){
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[41]++;
int CodeCoverConditionCoverageHelper_C14;
        if((((((CodeCoverConditionCoverageHelper_C14 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C14 |= (2)) == 0 || true) &&
 ((formRequest.getParameter("dropoffYear").isEmpty()) && 
  ((CodeCoverConditionCoverageHelper_C14 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.conditionCounters[14].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C14, 1) || true)) || (CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.conditionCounters[14].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C14, 1) && false)){
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.branches[29]++;
            errorCodes.add(1081);
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[42]++;
            return false;

        } else {
  CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.branches[30]++;}
        return true;
    }
    
    public boolean isDropoffYearInRange(){
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[43]++;
int CodeCoverConditionCoverageHelper_C15;
        if ((((((CodeCoverConditionCoverageHelper_C15 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C15 |= (8)) == 0 || true) &&
 ((Integer.parseInt(formRequest.getParameter("dropoffDay")) == 2014) && 
  ((CodeCoverConditionCoverageHelper_C15 |= (4)) == 0 || true)))
 || 
(((CodeCoverConditionCoverageHelper_C15 |= (2)) == 0 || true) &&
 ((Integer.parseInt(formRequest.getParameter("dropoffDay")) == 2015) && 
  ((CodeCoverConditionCoverageHelper_C15 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.conditionCounters[15].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C15, 2) || true)) || (CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.conditionCounters[15].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C15, 2) && false)) {
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.branches[31]++;
            errorCodes.add(1082);
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[44]++;
            return false;

        } else {
  CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.branches[32]++;}
        bean.setDropoffYear(Integer.parseInt(formRequest.getParameter("dropoffYear")));
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[45]++;
        return true;
    }
    
    public boolean isDropoffHourNull(){
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[46]++;
int CodeCoverConditionCoverageHelper_C16;
        if((((((CodeCoverConditionCoverageHelper_C16 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C16 |= (2)) == 0 || true) &&
 ((formRequest.getParameter("dropoffHour").isEmpty()) && 
  ((CodeCoverConditionCoverageHelper_C16 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.conditionCounters[16].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C16, 1) || true)) || (CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.conditionCounters[16].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C16, 1) && false)){
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.branches[33]++;
            errorCodes.add(1091);
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[47]++;
            return false;

        } else {
  CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.branches[34]++;}
        return true;
    }
    
    public boolean isDropoffHourInRange(){
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[48]++;
int CodeCoverConditionCoverageHelper_C17;
        if ((((((CodeCoverConditionCoverageHelper_C17 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C17 |= (8)) == 0 || true) &&
 ((Integer.parseInt(formRequest.getParameter("dropoffHour")) < 0) && 
  ((CodeCoverConditionCoverageHelper_C17 |= (4)) == 0 || true)))
 || 
(((CodeCoverConditionCoverageHelper_C17 |= (2)) == 0 || true) &&
 ((Integer.parseInt(formRequest.getParameter("dropoffHour")) > 23) && 
  ((CodeCoverConditionCoverageHelper_C17 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.conditionCounters[17].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C17, 2) || true)) || (CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.conditionCounters[17].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C17, 2) && false)) {
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.branches[35]++;
            errorCodes.add(1092);
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[49]++;
            return false;

        } else {
  CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.branches[36]++;}
        bean.setDropoffHour(Integer.parseInt(formRequest.getParameter("dropoffHour")));
CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81.statements[50]++;
        return true;
    }
}

class CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81 extends org.codecover.instrumentation.java.measurement.CounterContainer {

  static {
    org.codecover.instrumentation.java.measurement.ProtocolImpl.getInstance(org.codecover.instrumentation.java.measurement.CoverageResultLogFile.getInstance(null), "da3cff5f-c93a-4d7d-9772-522c05ef95ac").addObservedContainer(new CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81 ());
  }
    public static long[] statements = new long[51];
    public static long[] branches = new long[37];

  public static final org.codecover.instrumentation.java.measurement.ConditionCounter[] conditionCounters = new org.codecover.instrumentation.java.measurement.ConditionCounter[18];
  static {
    final String SECTION_NAME = "pricing.RentalFormValidator.java";
    final byte[] CONDITION_COUNTER_TYPES = {0,1,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2};
    for (int i = 1; i <= 17; i++) {
      switch (CONDITION_COUNTER_TYPES[i]) {
        case 0 : break;
        case 1 : conditionCounters[i] = new org.codecover.instrumentation.java.measurement.SmallOneConditionCounter(SECTION_NAME, "C" + i); break;
        case 2 : conditionCounters[i] = new org.codecover.instrumentation.java.measurement.SmallTwoConditionCounter(SECTION_NAME, "C" + i); break;
        case 3 : conditionCounters[i] = new org.codecover.instrumentation.java.measurement.MediumConditionCounter(SECTION_NAME, "C" + i); break;
        case 4 : conditionCounters[i] = new org.codecover.instrumentation.java.measurement.LargeConditionCounter(SECTION_NAME, "C" + i); break;
      }
    }
  }
    public static long[] loops = new long[1];

  public CodeCoverCoverageCounter$iznov0zjaff63k5tc1kakgj3zuzqtamzeac81 () {
    super("pricing.RentalFormValidator.java");
  }

  public static void ping() {/* nothing to do*/}

  public void reset() {
      for (int i = 1; i <= 50; i++) {
        statements[i] = 0L;
      }
      for (int i = 1; i <= 36; i++) {
        branches[i] = 0L;
      }
    for (int i = 1; i <= 17; i++) {
      if (conditionCounters[i] != null) {
        conditionCounters[i].reset();
      }
    }
      for (int i = 1; i <= 0; i++) {
        loops[i] = 0L;
      }
  }

  public void serializeAndReset(org.codecover.instrumentation.measurement.CoverageCounterLog log) {
    log.startNamedSection("pricing.RentalFormValidator.java");
      for (int i = 1; i <= 50; i++) {
        if (statements[i] != 0L) {
          log.passCounter("S" + i, statements[i]);
          statements[i] = 0L;
        }
      }
      for (int i = 1; i <= 36; i++) {
        if (branches[i] != 0L) {
          log.passCounter("B"+ i, branches[i]);
          branches[i] = 0L;
        }
      }
    for (int i = 1; i <= 17; i++) {
      if (conditionCounters[i] != null) {
        conditionCounters[i].serializeAndReset(log);
      }
    }
      for (int i = 1; i <= 0; i++) {
        if (loops[i * 3 - 2] != 0L) {
          log.passCounter("L" + i + "-0", loops[i * 3 - 2]);
          loops[i * 3 - 2] = 0L;
        }
        if ( loops[i * 3 - 1] != 0L) {
          log.passCounter("L" + i + "-1", loops[i * 3 - 1]);
          loops[i * 3 - 1] = 0L;
        }
        if ( loops[i * 3] != 0L) {
          log.passCounter("L" + i + "-2", loops[i * 3]);
          loops[i * 3] = 0L;
        }
      }
  }
}

