/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server_Client_Classes;

import Database.WazzufDB;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lenovo
 */
public class ReportTest {
    
    public ReportTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         Report r = new Report(5, "Very bad argument", "Cannot tolerate this company.", 5, false);
         
    }
    //THE TEST CASE.
        @Test
    public void ReportTest(){
       
       //Check by id
      Report instance = new Report(5223, "Very bad argument", "Cannot tolerate this company.", 5, false);
       WazzufDB insert = new WazzufDB();
       WazzufDB result = new WazzufDB();
       insert.insertReport(instance);
       Report r = result.getReportbyID(5223);
        int id = r.getID();
       assertEquals(5223,id);
    }
            @Test
    public void ReportTest2(){
       
       //Check if report was inserted or not. 
      Report instance = new Report(5223, "Very bad argument", "Cannot tolerate this company.", 5, false);
       WazzufDB insert = new WazzufDB();
       WazzufDB result = new WazzufDB();
       insert.insertReport(instance);
       Report r = result.getReportbyID(5223);

       assertEquals(instance,r);
    }
    @After
    public void tearDown() {
    }

    /**
     * Test of getID method, of class Report.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Report instance = null;
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setID method, of class Report.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        int ID = 0;
        Report instance = null;
        instance.setID(ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReason method, of class Report.
     */
    @Test
    public void testGetReason() {
        System.out.println("getReason");
        Report instance = null;
        String expResult = "";
        String result = instance.getReason();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReason method, of class Report.
     */
    @Test
    public void testSetReason() {
        System.out.println("setReason");
        String reason = "";
        Report instance = null;
        instance.setReason(reason);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReportedUserID method, of class Report.
     */
    @Test
    public void testGetReportedUserID() {
        System.out.println("getReportedUserID");
        Report instance = null;
        int expResult = 0;
        int result = instance.getReportedUserID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReportedUserID method, of class Report.
     */
    @Test
    public void testSetReportedUserID() {
        System.out.println("setReportedUserID");
        int reportedUserID = 0;
        Report instance = null;
        instance.setReportedUserID(reportedUserID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isHandled method, of class Report.
     */
    @Test
    public void testIsHandled() {
        System.out.println("isHandled");
        Report instance = null;
        boolean expResult = false;
        boolean result = instance.isHandled();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHandled method, of class Report.
     */
    @Test
    public void testSetHandled() {
        System.out.println("setHandled");
        boolean handled = false;
        Report instance = null;
        instance.setHandled(handled);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
