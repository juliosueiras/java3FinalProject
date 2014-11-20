/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pricing;

import java.beans.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;
/**
 *
 * @author jhlee
 */
public class RentalBean implements Serializable{
  static {
    CodeCoverCoverageCounter$op0x6ls82nebib6isoe49cx.ping();
  }

    private int pickupYear;
    private int pickupMon;
    private int pickupDay;
    private int pickupHour;
    private int pickupMin;
    private int dropoffYear;
    private int dropoffMon;
    private int dropoffDay;
    private int dropoffHour;
    private int dropoffMin;
    private String rentalType;
    private String cardType;
    private String cardNumber;
    private String customerNumber;
    private BigDecimal taxRate;
    private BigDecimal price;
    private PriceSchedule priceSchedule;
      
    public RentalBean() {
       
    }
    
    /**
     * method for price estimation based on business rules
     * @return 
     */

    public PriceSchedule getPriceSchedule() {
        return priceSchedule;
    }
    
    /**
     * @return the pickupYear
     */
    public int getPickupYear() {
        return pickupYear;
    }

    /**
     * @param pickupYear the pickupYear to set
     */
    public void setPickupYear(int pickupYear) {
        this.pickupYear = pickupYear;
CodeCoverCoverageCounter$op0x6ls82nebib6isoe49cx.statements[1]++;
    }

    /**
     * @return the pickupMon
     */
    public int getPickupMon() {
        return pickupMon;
    }

    /**
     * @param pickupMon the pickupMon to set
     */
    public void setPickupMon(int pickupMon) {
        this.pickupMon = pickupMon;
CodeCoverCoverageCounter$op0x6ls82nebib6isoe49cx.statements[2]++;
    }

    /**
     * @return the pickupDay
     */
    public int getPickupDay() {
        return pickupDay;
    }

    /**
     * @param pickupDay the pickupDay to set
     */
    public void setPickupDay(int pickupDay) {
            this.pickupDay = pickupDay;
CodeCoverCoverageCounter$op0x6ls82nebib6isoe49cx.statements[3]++;
    }

    /**
     * @return the pickupHour
     */
    public int getPickupHour() {
        return pickupHour;
    }

    /**
     * @param pickupHour the pickupHour to set
     */
    public void setPickupHour(int pickupHour) {
        this.pickupHour = pickupHour;
CodeCoverCoverageCounter$op0x6ls82nebib6isoe49cx.statements[4]++;
    }

    /**
     * @return the pickupMin
     */
    public int getPickupMin() {
        return pickupMin;
    }

    /**
     * @param pickupMin the pickupMin to set
     */
    public void setPickupMin(int pickupMin) {
        this.pickupMin = pickupMin;
CodeCoverCoverageCounter$op0x6ls82nebib6isoe49cx.statements[5]++;
    }

    /**
     * @return the dropoffYear
     */
    public int getDropoffYear() {
        return dropoffYear;
    }

    /**
     * @param dropoffYear the dropoffYear to set
     */
    public void setDropoffYear(int dropoffYear) {
        this.dropoffYear = dropoffYear;
CodeCoverCoverageCounter$op0x6ls82nebib6isoe49cx.statements[6]++;
    }

    /**
     * @return the dropoffMon
     */
    public int getDropoffMon() {
        return dropoffMon;
    }

    /**
     * @param dropoffMon the dropoffMon to set
     */
    public void setDropoffMon(int dropoffMon) {
        this.dropoffMon = dropoffMon;
CodeCoverCoverageCounter$op0x6ls82nebib6isoe49cx.statements[7]++;
    }

    /**
     * @return the dropoffDay
     */
    public int getDropoffDay() {
        return dropoffDay;
    }

    /**
     * @param dropoffDay the dropoffDay to set
     */
    public void setDropoffDay(int dropoffDay) {
        this.dropoffDay = dropoffDay;
CodeCoverCoverageCounter$op0x6ls82nebib6isoe49cx.statements[8]++;
    }

    /**
     * @return the dropoffHour
     */
    public int getDropoffHour() {
        return dropoffHour;
    }

    /**
     * @param dropoffHour the dropoffHour to set
     */
    public void setDropoffHour(int dropoffHour) {
        this.dropoffHour = dropoffHour;
CodeCoverCoverageCounter$op0x6ls82nebib6isoe49cx.statements[9]++;
    }

    /**
     * @return the dropoffMin
     */
    public int getDropoffMin() {
        return dropoffMin;
    }

    /**
     * @param dropoffMin the dropoffMin to set
     */
    public void setDropoffMin(int dropoffMin) {
        this.dropoffMin = dropoffMin;
CodeCoverCoverageCounter$op0x6ls82nebib6isoe49cx.statements[10]++;
    }

    /**
     * @return the rentalType
     */
    public String getRentalType() {
        return rentalType;
    }

    /**
     * @param rentalType the rentalType to set
     */
    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
CodeCoverCoverageCounter$op0x6ls82nebib6isoe49cx.statements[11]++;
    }

    /**
     * @return the cardType
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * @param cardType the cardType to set
     */
    public void setCardType(String cardType) {
        this.cardType = cardType;
CodeCoverCoverageCounter$op0x6ls82nebib6isoe49cx.statements[12]++;
    }

    /**
     * @return the cardNumber
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * @param cardNumber the cardNumber to set
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
CodeCoverCoverageCounter$op0x6ls82nebib6isoe49cx.statements[13]++;
    }

    /**
     * @return the taxRate
     */
    public BigDecimal getTaxRate() {
        return taxRate;
    }

    /**
     * @param taxRate the taxRate to set
     */
    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
CodeCoverCoverageCounter$op0x6ls82nebib6isoe49cx.statements[14]++;
    }

    /**
     * @return the price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
CodeCoverCoverageCounter$op0x6ls82nebib6isoe49cx.statements[15]++;
    }

    /**
     * @param priceSchedule the priceSchedule to set
     */
    public void setPriceSchedule(PriceSchedule priceSchedule) {
        this.priceSchedule = priceSchedule;
CodeCoverCoverageCounter$op0x6ls82nebib6isoe49cx.statements[16]++;
    }   

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
CodeCoverCoverageCounter$op0x6ls82nebib6isoe49cx.statements[17]++;
    }
}

class CodeCoverCoverageCounter$op0x6ls82nebib6isoe49cx extends org.codecover.instrumentation.java.measurement.CounterContainer {

  static {
    org.codecover.instrumentation.java.measurement.ProtocolImpl.getInstance(org.codecover.instrumentation.java.measurement.CoverageResultLogFile.getInstance(null), "da3cff5f-c93a-4d7d-9772-522c05ef95ac").addObservedContainer(new CodeCoverCoverageCounter$op0x6ls82nebib6isoe49cx ());
  }
    public static long[] statements = new long[18];
    public static long[] branches = new long[0];
    public static long[] loops = new long[1];

  public CodeCoverCoverageCounter$op0x6ls82nebib6isoe49cx () {
    super("pricing.RentalBean.java");
  }

  public static void ping() {/* nothing to do*/}

  public void reset() {
      for (int i = 1; i <= 17; i++) {
        statements[i] = 0L;
      }
      for (int i = 1; i <= -1; i++) {
        branches[i] = 0L;
      }
      for (int i = 1; i <= 0; i++) {
        loops[i] = 0L;
      }
  }

  public void serializeAndReset(org.codecover.instrumentation.measurement.CoverageCounterLog log) {
    log.startNamedSection("pricing.RentalBean.java");
      for (int i = 1; i <= 17; i++) {
        if (statements[i] != 0L) {
          log.passCounter("S" + i, statements[i]);
          statements[i] = 0L;
        }
      }
      for (int i = 1; i <= -1; i++) {
        if (branches[i] != 0L) {
          log.passCounter("B"+ i, branches[i]);
          branches[i] = 0L;
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

