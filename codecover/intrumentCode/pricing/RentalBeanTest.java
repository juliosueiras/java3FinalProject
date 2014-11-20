/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pricing;

import pricing.PriceSchedule;
import pricing.RentalBean;
import java.math.BigDecimal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jhlee
 */
public class RentalBeanTest {
    
    public RentalBeanTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPickupYear method, of class RentalBean.
     */
    @Test
    public void testGetPickupYear() {
        System.out.println("getPickupYear");
        RentalBean instance = new RentalBean();
        int expResult = 2014;
        instance.setPickupYear(expResult);
        
        int result = instance.getPickupYear();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPickupYear method, of class RentalBean.
     */
    @Test
    public void testSetPickupYear() {
        System.out.println("setPickupYear");
        int pickupYear = 2014;
        RentalBean instance = new RentalBean();
        instance.setPickupYear(pickupYear);
        
        int actual = instance.getPickupYear();
        assertEquals(pickupYear, actual);
    }

    /**
     * Test of getPickupMon method, of class RentalBean.
     */
    @Test
    public void testGetPickupMon() {
        System.out.println("getPickupMon");
        RentalBean instance = new RentalBean();
        int expResult = 1;
        instance.setPickupMon(expResult);
        
        int result = instance.getPickupMon();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPickupMon method, of class RentalBean.
     */
    @Test
    public void testSetPickupMon() {
        System.out.println("setPickupMon");
        int pickupMon = 0;
        RentalBean instance = new RentalBean();
        instance.setPickupMon(pickupMon);
        
        int actual = instance.getPickupMon();
        assertEquals(pickupMon, actual);
    }

    /**
     * Test of getPickupDay method, of class RentalBean.
     */
    @Test
    public void testGetPickupDay() {
        System.out.println("getPickupDay");
        RentalBean instance = new RentalBean();
        int expResult = 1;
        instance.setPickupDay(expResult);
        
        int result = instance.getPickupDay();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPickupDay method, of class RentalBean.
     */
    @Test
    public void testSetPickupDay() {
        System.out.println("setPickupDay");
        int pickupDay = 0;
        RentalBean instance = new RentalBean();
        instance.setPickupDay(pickupDay);
        
        int actual = instance.getPickupDay();
        assertEquals(pickupDay, actual);
    }

    /**
     * Test of getPickupHour method, of class RentalBean.
     */
    @Test
    public void testGetPickupHour() {
        System.out.println("getPickupHour");
        RentalBean instance = new RentalBean();
        int expResult = 0;
        instance.setPickupHour(expResult);
        
        int result = instance.getPickupHour();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPickupHour method, of class RentalBean.
     */
    @Test
    public void testSetPickupHour() {
        System.out.println("setPickupHour");
        int pickupHour = 0;
        RentalBean instance = new RentalBean();
        instance.setPickupHour(pickupHour);
        
        int actual = instance.getPickupHour();
        assertEquals(pickupHour, actual);
    }

    /**
     * Test of getPickupMin method, of class RentalBean.
     */
    @Test
    public void testGetPickupMin() {
        System.out.println("getPickupMin");
        RentalBean instance = new RentalBean();
        int expResult = 1;
        instance.setPickupMin(expResult);
        
        int result = instance.getPickupMin();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPickupMin method, of class RentalBean.
     */
    @Test
    public void testSetPickupMin() {
        System.out.println("setPickupMin");
        int pickupMin = 1;
        RentalBean instance = new RentalBean();
        instance.setPickupMin(pickupMin);
        
        int actual = instance.getPickupMin();
        assertEquals(pickupMin, actual);
    }

    /**
     * Test of getDropoffYear method, of class RentalBean.
     */
    @Test
    public void testGetDropoffYear() {
        System.out.println("getDropoffYear");
        RentalBean instance = new RentalBean();
        int expResult = 1;
        instance.setDropoffYear(expResult);
        
        int result = instance.getDropoffYear();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDropoffYear method, of class RentalBean.
     */
    @Test
    public void testSetDropoffYear() {
        System.out.println("setDropoffYear");
        int dropoffYear = 1;
        RentalBean instance = new RentalBean();
        instance.setDropoffYear(dropoffYear);
        
        int actual = instance.getDropoffYear();
        assertEquals(dropoffYear, actual);
    }

    /**
     * Test of getDropoffMon method, of class RentalBean.
     */
    @Test
    public void testGetDropoffMon() {
        System.out.println("getDropoffMon");
        RentalBean instance = new RentalBean();
        int expResult = 1;
        instance.setDropoffMon(expResult);
        int result = instance.getDropoffMon();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDropoffMon method, of class RentalBean.
     */
    @Test
    public void testSetDropoffMon() {
        System.out.println("setDropoffMon");
        int dropoffMon = 0;
        RentalBean instance = new RentalBean();
        instance.setDropoffMon(dropoffMon);
        
        int actual = instance.getDropoffMon();
        assertEquals(dropoffMon, actual);
    }

    /**
     * Test of getDropoffDay method, of class RentalBean.
     */
    @Test
    public void testGetDropoffDay() {
        System.out.println("getDropoffDay");
        RentalBean instance = new RentalBean();
        int expResult = 1;
        instance.setDropoffDay(expResult);
        int result = instance.getDropoffDay();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDropoffDay method, of class RentalBean.
     */
    @Test
    public void testSetDropoffDay() {
        System.out.println("setDropoffDay");
        int dropoffDay = 0;
        RentalBean instance = new RentalBean();
        instance.setDropoffDay(dropoffDay);
        
        int actual = instance.getDropoffDay();
        assertEquals(dropoffDay, actual);
    }

    /**
     * Test of getDropoffHour method, of class RentalBean.
     */
    @Test
    public void testGetDropoffHour() {
        System.out.println("getDropoffHour");
        RentalBean instance = new RentalBean();
        int expResult = 1;
        instance.setDropoffHour(expResult);
        
        int result = instance.getDropoffHour();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDropoffHour method, of class RentalBean.
     */
    @Test
    public void testSetDropoffHour() {
        System.out.println("setDropoffHour");
        int dropoffHour = 1;
        RentalBean instance = new RentalBean();
        instance.setDropoffHour(dropoffHour);
        
        int actual = instance.getDropoffHour();
        assertEquals(dropoffHour, actual);
    }

    /**
     * Test of getDropoffMin method, of class RentalBean.
     */
    @Test
    public void testGetDropoffMin() {
        System.out.println("getDropoffMin");
        RentalBean instance = new RentalBean();
        int expResult = 1;
        instance.setDropoffMin(expResult);
        int result = instance.getDropoffMin();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDropoffMin method, of class RentalBean.
     */
    @Test
    public void testSetDropoffMin() {
        System.out.println("setDropoffMin");
        int dropoffMin = 1;
        RentalBean instance = new RentalBean();
        instance.setDropoffMin(dropoffMin);
        int actual = instance.getDropoffMin();
        assertEquals(dropoffMin, actual);
    }

    /**
     * Test of getRentalType method, of class RentalBean.
     */
    @Test
    public void testGetRentalType() {
        System.out.println("getRentalType");
        RentalBean instance = new RentalBean();
        String expResult = "weekday";
        instance.setRentalType(expResult);
        String result = instance.getRentalType();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRentalType method, of class RentalBean.
     */
    @Test
    public void testSetRentalType() {
        System.out.println("setRentalType");
        String rentalType = "weekday";
        RentalBean instance = new RentalBean();
        instance.setRentalType(rentalType);
        String actual = instance.getRentalType();
        assertEquals(rentalType, actual);
    }

    /**
     * Test of getCardType method, of class RentalBean.
     */
    @Test
    public void testGetCardType() {
        System.out.println("getCardType");
        RentalBean instance = new RentalBean();
        String expResult = "visa";
        instance.setCardType(expResult);
        String result = instance.getCardType();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCardType method, of class RentalBean.
     */
    @Test
    public void testSetCardType() {
        System.out.println("setCardType");
        String cardType = "visa";
        RentalBean instance = new RentalBean();
        instance.setCardType(cardType);
        String actual = instance.getCardType();
        assertEquals(cardType, actual);
    }

    /**
     * Test of getCardNumber method, of class RentalBean.
     */
    @Test
    public void testGetCardNumber() {
        System.out.println("getCardNumber");
        RentalBean instance = new RentalBean();
        String expResult = "111";
        instance.setCardNumber(expResult);
        String result = instance.getCardNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCardNumber method, of class RentalBean.
     */
    @Test
    public void testSetCardNumber() {
        System.out.println("setCardNumber");
        String cardNumber = "111";
        RentalBean instance = new RentalBean();
        instance.setCardNumber(cardNumber);
        String actual = instance.getCardNumber();
        assertEquals(cardNumber, actual);
    }

    /**
     * Test of getTaxRate method, of class RentalBean.
     */
    @Test
    public void testGetTaxRate() {
        System.out.println("getTaxRate");
        RentalBean instance = new RentalBean();
        BigDecimal expResult = new BigDecimal(0.13);
        instance.setTaxRate(expResult);
        BigDecimal result = instance.getTaxRate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTaxRate method, of class RentalBean.
     */
    @Test
    public void testSetTaxRate() {
        System.out.println("setTaxRate");
        BigDecimal taxRate = new BigDecimal(0.13);
        RentalBean instance = new RentalBean();
        instance.setTaxRate(taxRate);
        BigDecimal actual = instance.getTaxRate();
        assertEquals(taxRate, actual);
    }

    /**
     * Test of getPrice method, of class RentalBean.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        RentalBean instance = new RentalBean();
        BigDecimal expResult = new BigDecimal(1);
        instance.setPrice(expResult);
        BigDecimal result = instance.getPrice();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPrice method, of class RentalBean.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        BigDecimal price = new BigDecimal(1);
        RentalBean instance = new RentalBean();
        instance.setPrice(price);
        BigDecimal actual = instance.getPrice();
        assertEquals(price, actual);
    }

    /**
     * Test of setPriceSchedule method, of class RentalBean.
     */
    @Test
    public void testSetPriceSchedule() {
        System.out.println("setPriceSchedule");
        PriceSchedule priceSchedule = new PriceSchedule("weekday", BigDecimal.ONE, BigDecimal.ONE, BigDecimal.ONE);
        RentalBean instance = new RentalBean();
        instance.setPriceSchedule(priceSchedule);
        PriceSchedule actual = instance.getPriceSchedule();
        assertEquals(priceSchedule, actual);
    }
    
    /**
     * Test of getPriceSchedule method, of class RentalBean.
     */
    @Test
    public void testGetPriceSchedule() {
        System.out.println("getPriceSchedule");
        RentalBean instance = new RentalBean();
        PriceSchedule expResult = new PriceSchedule("weekday", BigDecimal.ONE, BigDecimal.ONE, BigDecimal.ONE);
        instance.setPriceSchedule(expResult);
        PriceSchedule result = instance.getPriceSchedule();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCustNumber method, of class RentalBean.
     */
    @Test
    public void testGetCustNumber() {
        System.out.println("getCustNumber");
        RentalBean instance = new RentalBean();
        String expResult = "111";
        instance.setCustomerNumber(expResult);
        String result = instance.getCustomerNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCustNumber method, of class RentalBean.
     */
    @Test
    public void testSetCustNumber() {
        System.out.println("setCustNumber");
        String custNumber = "111";
        RentalBean instance = new RentalBean();
        instance.setCustomerNumber(custNumber);
        String actual = instance.getCustomerNumber();
        assertEquals(custNumber, actual);
    }

    
}
