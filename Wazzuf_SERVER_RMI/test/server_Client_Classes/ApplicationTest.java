/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server_Client_Classes;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ahmed
 */
public class ApplicationTest {
    
    public ApplicationTest() {
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
     * Test of cloneApplication method, of class Application.
     */
    @Test
    public void testCloneApplication() {
        System.out.println("cloneApplication");
        Application instance = null;
        Application expResult = null;
        Application result = instance.cloneApplication();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJobs method, of class Application.
     */
    @Test
    public void testGetJobs() {
        System.out.println("getJobs");
        Application instance = null;
        ArrayList<Job> expResult = null;
        ArrayList<Job> result = instance.getJobs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJobs method, of class Application.
     */
    @Test
    public void testSetJobs() {
        System.out.println("setJobs");
        ArrayList<Job> jobs = null;
        Application instance = null;
        instance.setJobs(jobs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getID method, of class Application.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Application instance = null;
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setID method, of class Application.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        int ID = 0;
        Application instance = null;
        instance.setID(ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuestionList method, of class Application.
     */
    @Test
    public void testGetQuestionList() {
        System.out.println("getQuestionList");
        Application instance = null;
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getQuestionList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuestionList method, of class Application.
     */
    @Test
    public void testSetQuestionList() {
        System.out.println("setQuestionList");
        ArrayList<String> questionList = null;
        Application instance = null;
        instance.setQuestionList(questionList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApplicant method, of class Application.
     */
    @Test
    public void testGetApplicant() {
        System.out.println("getApplicant");
        Application instance = null;
        JobSeeker expResult = null;
        JobSeeker result = instance.getApplicant();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setApplicant method, of class Application.
     */
    @Test
    public void testSetApplicant() {
        System.out.println("setApplicant");
        JobSeeker applicant = null;
        Application instance = null;
        instance.setApplicant(applicant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompany method, of class Application.
     */
    @Test
    public void testGetCompany() {
        System.out.println("getCompany");
        Application instance = null;
        Company expResult = null;
        Company result = instance.getCompany();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCompany method, of class Application.
     */
    @Test
    public void testSetCompany() {
        System.out.println("setCompany");
        Company company = null;
        Application instance = null;
        instance.setCompany(company);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApplicationStatus method, of class Application.
     */
    @Test
    public void testGetApplicationStatus() {
        System.out.println("getApplicationStatus");
        Application instance = null;
        AppStatus expResult = null;
        AppStatus result = instance.getApplicationStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setApplicationStatus method, of class Application.
     */
    @Test
    public void testSetApplicationStatus() {
        System.out.println("setApplicationStatus");
        AppStatus ApplicationStatus = null;
        Application instance = null;
        instance.setApplicationStatus(ApplicationStatus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
