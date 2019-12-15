/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server_Client_Classes;

import Database.WazzufDB;
import java.util.ArrayList;
import java.util.Date;
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
public class JobTest {
    
    public JobTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
        
    }
    
    @Before
    public void setUp() {
        ArrayList<Application> a[] = null;
        
        Job instance;
        instance = new Job(1,"first",true,"three", 2.0f,"SE", Type.PARTTIME, " ", 250.0f, "one year", "eng",5, ("2020-01-01") ,a);
        
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void TestJob(){
       ArrayList<Application> a[] = null;
       Job instance;
       instance = new Job(1,"first",true,"three", 2.0f,"SE", Type.PARTTIME, " ", 250.0f, "one year", "eng",5, ("2020-01-01") ,a);
       WazzufDB expected = new WazzufDB();
       WazzufDB result = new WazzufDB();
       expected.insertJob(instance);
       result.getJobByID(1);
        
       assertEquals(expected,result);
    }

    /**
     * Test of getID method, of class Job.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Job instance = new Job();
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setID method, of class Job.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        int ID = 0;
        Job instance = new Job();
        instance.setID(ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Job.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Job instance = new Job();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Job.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Job instance = new Job();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class Job.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Job instance = new Job();
        Boolean expResult = null;
        Boolean result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class Job.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        Boolean Status = null;
        Job instance = new Job();
        instance.setStatus(Status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLevel method, of class Job.
     */
    @Test
    public void testGetLevel() {
        System.out.println("getLevel");
        Job instance = new Job();
        String expResult = "";
        String result = instance.getLevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLevel method, of class Job.
     */
    @Test
    public void testSetLevel() {
        System.out.println("setLevel");
        String level = "";
        Job instance = new Job();
        instance.setLevel(level);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExperience method, of class Job.
     */
    @Test
    public void testGetExperience() {
        System.out.println("getExperience");
        Job instance = new Job();
        float expResult = 0.0F;
        float result = instance.getExperience();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setExperience method, of class Job.
     */
    @Test
    public void testSetExperience() {
        System.out.println("setExperience");
        float experience = 0.0F;
        Job instance = new Job();
        instance.setExperience(experience);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCategory method, of class Job.
     */
    @Test
    public void testGetCategory() {
        System.out.println("getCategory");
        Job instance = new Job();
        String expResult = "";
        String result = instance.getCategory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCategory method, of class Job.
     */
    @Test
    public void testSetCategory() {
        System.out.println("setCategory");
        String Category = "";
        Job instance = new Job();
        instance.setCategory(Category);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJobType method, of class Job.
     */
    @Test
    public void testGetJobType() {
        System.out.println("getJobType");
        Job instance = new Job();
        Type expResult = null;
        Type result = instance.getJobType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJobType method, of class Job.
     */
    @Test
    public void testSetJobType() {
        System.out.println("setJobType");
        Type jobType = null;
        Job instance = new Job();
        instance.setJobType(jobType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Job.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Job instance = new Job();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Job.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Job instance = new Job();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSalary method, of class Job.
     */
    @Test
    public void testGetSalary() {
        System.out.println("getSalary");
        Job instance = new Job();
        float expResult = 0.0F;
        float result = instance.getSalary();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSalary method, of class Job.
     */
    @Test
    public void testSetSalary() {
        System.out.println("setSalary");
        float Salary = 0.0F;
        Job instance = new Job();
        instance.setSalary(Salary);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDuration method, of class Job.
     */
    @Test
    public void testGetDuration() {
        System.out.println("getDuration");
        Job instance = new Job();
        String expResult = "";
        String result = instance.getDuration();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDuration method, of class Job.
     */
    @Test
    public void testSetDuration() {
        System.out.println("setDuration");
        String duration = "";
        Job instance = new Job();
        instance.setDuration(duration);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLanguage method, of class Job.
     */
    @Test
    public void testGetLanguage() {
        System.out.println("getLanguage");
        Job instance = new Job();
        String expResult = "";
        String result = instance.getLanguage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLanguage method, of class Job.
     */
    @Test
    public void testSetLanguage() {
        System.out.println("setLanguage");
        String language = "";
        Job instance = new Job();
        instance.setLanguage(language);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumOfPositions method, of class Job.
     */
    @Test
    public void testGetNumOfPositions() {
        System.out.println("getNumOfPositions");
        Job instance = new Job();
        int expResult = 0;
        int result = instance.getNumOfPositions();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumOfPositions method, of class Job.
     */
    @Test
    public void testSetNumOfPositions() {
        System.out.println("setNumOfPositions");
        int numOfPositions = 0;
        Job instance = new Job();
        instance.setNumOfPositions(numOfPositions);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeadline method, of class Job.
     */
    @Test
    public void testGetDeadline() {
        System.out.println("getDeadline");
        Job instance = new Job();
        Date expResult = null;
        Date result = instance.getDeadline();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDeadline method, of class Job.
     */
    @Test
    public void testSetDeadline() {
        System.out.println("setDeadline");
        Date deadline = null;
        Job instance = new Job();
        instance.setDeadline(deadline);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApp method, of class Job.
     */
    @Test
    public void testGetApp() {
        System.out.println("getApp");
        Job instance = new Job();
        ArrayList<Application> expResult = null;
        ArrayList<Application> result = instance.getApp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setApp method, of class Job.
     */
    @Test
    public void testSetApp() {
        System.out.println("setApp");
        ArrayList<Application> app = null;
        Job instance = new Job();
        instance.setApp(app);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createJob method, of class Job.
     */
    @Test
    public void testCreateJob() {
        System.out.println("createJob");
        Job instance = new Job();
        instance.createJob();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editJob method, of class Job.
     */
    @Test
    public void testEditJob() {
        System.out.println("editJob");
        Job instance = new Job();
        instance.editJob();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeJob method, of class Job.
     */
    @Test
    public void testRemoveJob() {
        System.out.println("removeJob");
        Job instance = new Job();
        instance.removeJob();
        assertNull(instance.getID());
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of applyForJob method, of class Job.
     */
    @Test
    public void testApplyForJob() {
        System.out.println("applyForJob");
        Job instance = new Job();
        instance.applyForJob();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
