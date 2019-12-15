/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server_Client_Classes;

import Database.WazzufDB;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.Observable;
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
public class CompanyTest {
    
    public CompanyTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Company instance;
        instance = new Company(null,null,0,null,0,null,null);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void TestCompany(){
       Company instance;
       instance = new Company(null,null,1,null,0,null,null);
       WazzufDB expected = new WazzufDB();
       WazzufDB result = new WazzufDB();
       expected.insertCompany(instance);
       result.getCompanyByID(1);
        
       assertEquals(expected,result);
    }
    
    
    
    
    
    

    /**
     * Test of getEstablishYear method, of class Company.
     */
    @Test
    public void testGetEstablishYear() {
        System.out.println("getEstablishYear");
        Company instance = new Company();
        int expResult = 0;
        int result = instance.getEstablishYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstablishYear method, of class Company.
     */
    @Test
    public void testSetEstablishYear() {
        System.out.println("setEstablishYear");
        int establishYear = 0;
        Company instance = new Company();
        instance.setEstablishYear(establishYear);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCategories method, of class Company.
     */
    @Test
    public void testGetCategories() {
        System.out.println("getCategories");
        Company instance = new Company();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getCategories();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCategories method, of class Company.
     */
    @Test
    public void testSetCategories() {
        System.out.println("setCategories");
        ArrayList<String> categories = null;
        Company instance = new Company();
        instance.setCategories(categories);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Company.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Company instance = new Company();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Company.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Company instance = new Company();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWebsite method, of class Company.
     */
    @Test
    public void testGetWebsite() {
        System.out.println("getWebsite");
        Company instance = new Company();
        String expResult = "";
        String result = instance.getWebsite();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWebsite method, of class Company.
     */
    @Test
    public void testSetWebsite() {
        System.out.println("setWebsite");
        String website = "";
        Company instance = new Company();
        instance.setWebsite(website);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmployees method, of class Company.
     */
    @Test
    public void testGetEmployees() {
        System.out.println("getEmployees");
        Company instance = new Company();
        int expResult = 0;
        int result = instance.getEmployees();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmployees method, of class Company.
     */
    @Test
    public void testSetEmployees() {
        System.out.println("setEmployees");
        int employees = 0;
        Company instance = new Company();
        instance.setEmployees(employees);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompanyValidationStatus method, of class Company.
     */
    @Test
    public void testGetCompanyValidationStatus() {
        System.out.println("getCompanyValidationStatus");
        Company instance = new Company();
        ValidationStatus expResult = null;
        ValidationStatus result = instance.getCompanyValidationStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCompanyValidationStatus method, of class Company.
     */
    @Test
    public void testSetCompanyValidationStatus() {
        System.out.println("setCompanyValidationStatus");
        ValidationStatus companyValidationStatus = null;
        Company instance = new Company();
        instance.setCompanyValidationStatus(companyValidationStatus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompID method, of class Company.
     */
    @Test
    public void testGetCompID() {
        System.out.println("getCompID");
        Company instance = new Company();
        int expResult = 0;
        int result = instance.getCompID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCompID method, of class Company.
     */
    @Test
    public void testSetCompID() {
        System.out.println("setCompID");
        int compID = 0;
        Company instance = new Company();
        instance.setCompID(compID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editProfile method, of class Company.
     */
    @Test
    public void testEditProfile() {
        System.out.println("editProfile");
        Company instance = new Company();
        instance.editProfile();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAccount method, of class Company.
     */
    @Test
    public void testDeleteAccount() {
        System.out.println("deleteAccount");
        Company instance = new Company();
        instance.deleteAccount();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of submitReport method, of class Company.
     */
    @Test
    public void testSubmitReport() {
        System.out.println("submitReport");
        Company instance = new Company();
        instance.submitReport();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerCompany method, of class Company.
     */
    @Test
    public void testRegisterCompany() {
        System.out.println("registerCompany");
        Company instance = new Company();
        instance.registerCompany();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompanyUsername method, of class Company.
     */
    @Test
    public void testGetCompanyUsername() {
        System.out.println("getCompanyUsername");
        Company instance = new Company();
        String expResult = "";
        String result = instance.getCompanyUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class Company.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Observable o = null;
        Object o1 = null;
        Company instance = new Company();
        instance.update(o, o1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createJob method, of class Company.
     */
    @Test
    public void testCreateJob() {
        System.out.println("createJob");
        Company instance = new Company();
        instance.createJob();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editJob method, of class Company.
     */
    @Test
    public void testEditJob() {
        System.out.println("editJob");
        Company instance = new Company();
        instance.editJob();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeJob method, of class Company.
     */
    @Test
    public void testRemoveJob() {
        System.out.println("removeJob");
        Company instance = new Company();
        instance.removeJob();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
