/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server_Client_Classes;

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
 * @author kc
 */
public class JobSeekerIT {
    
    public JobSeekerIT() {
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
     * Test of viewProfile method, of class JobSeeker.
     */
    @Test
    public void testViewProfile() {
        System.out.println("viewProfile");
        JobSeeker instance = null;
        instance.viewProfile();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editProfile method, of class JobSeeker.
     */
    @Test
    public void testEditProfile() {
        System.out.println("editProfile");
        JobSeeker instance = null;
        instance.editProfile();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAccount method, of class JobSeeker.
     */
    @Test
    public void testDeleteAccount() {
        System.out.println("deleteAccount");
        JobSeeker instance = null;
        instance.deleteAccount();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of viewAllJobs method, of class JobSeeker.
     */
    @Test
    public void testViewAllJobs() {
        System.out.println("viewAllJobs");
        ArrayList<Job> jobs = null;
        JobSeeker instance = null;
        instance.viewAllJobs(jobs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchOnJob method, of class JobSeeker.
     */
    @Test
    public void testSearchOnJob() {
        System.out.println("searchOnJob");
        String name = "";
        JobSeeker instance = null;
        instance.searchOnJob(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of viewApplication method, of class JobSeeker.
     */
    @Test
    public void testViewApplication() {
        System.out.println("viewApplication");
        JobSeeker instance = null;
        instance.viewApplication();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editApplication method, of class JobSeeker.
     */
    @Test
    public void testEditApplication() {
        System.out.println("editApplication");
        JobSeeker instance = null;
        instance.editApplication();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeApplication method, of class JobSeeker.
     */
    @Test
    public void testRemoveApplication() {
        System.out.println("removeApplication");
        JobSeeker instance = null;
        instance.removeApplication();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of trackApplication method, of class JobSeeker.
     */
    @Test
    public void testTrackApplication() {
        System.out.println("trackApplication");
        int ID = 0;
        JobSeeker instance = null;
        instance.trackApplication(ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editSkills method, of class JobSeeker.
     */
    @Test
    public void testEditSkills() {
        System.out.println("editSkills");
        JobSeeker instance = null;
        instance.editSkills();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editCV method, of class JobSeeker.
     */
    @Test
    public void testEditCV() {
        System.out.println("editCV");
        JobSeeker instance = null;
        instance.editCV();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addJobInterests method, of class JobSeeker.
     */
    @Test
    public void testAddJobInterests() {
        System.out.println("addJobInterests");
        JobSeeker instance = null;
        instance.addJobInterests();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeJobInterests method, of class JobSeeker.
     */
    @Test
    public void testRemoveJobInterests() {
        System.out.println("removeJobInterests");
        JobSeeker instance = null;
        instance.removeJobInterests();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of submitReport method, of class JobSeeker.
     */
    @Test
    public void testSubmitReport() {
        System.out.println("submitReport");
        Report r = null;
        JobSeeker instance = null;
        instance.submitReport(r);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of upgradeToPremium method, of class JobSeeker.
     */
    @Test
    public void testUpgradeToPremium() {
        System.out.println("upgradeToPremium");
        PaymentMethod r = null;
        JobSeeker instance = null;
        instance.upgradeToPremium(r);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerJobSeeker method, of class JobSeeker.
     */
    @Test
    public void testRegisterJobSeeker() {
        System.out.println("registerJobSeeker");
        JobSeeker instance = null;
        instance.registerJobSeeker();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIsPremium method, of class JobSeeker.
     */
    @Test
    public void testIsIsPremium() {
        System.out.println("isIsPremium");
        JobSeeker instance = null;
        boolean expResult = false;
        boolean result = instance.isIsPremium();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsPremium method, of class JobSeeker.
     */
    @Test
    public void testSetIsPremium() {
        System.out.println("setIsPremium");
        boolean isPremium = false;
        JobSeeker instance = null;
        instance.setIsPremium(isPremium);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAppLimit method, of class JobSeeker.
     */
    @Test
    public void testGetAppLimit() {
        System.out.println("getAppLimit");
        JobSeeker instance = null;
        int expResult = 0;
        int result = instance.getAppLimit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAppLimit method, of class JobSeeker.
     */
    @Test
    public void testSetAppLimit() {
        System.out.println("setAppLimit");
        int appLimit = 0;
        JobSeeker instance = null;
        instance.setAppLimit(appLimit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGender method, of class JobSeeker.
     */
    @Test
    public void testGetGender() {
        System.out.println("getGender");
        JobSeeker instance = null;
        gender expResult = null;
        gender result = instance.getGender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGender method, of class JobSeeker.
     */
    @Test
    public void testSetGender() {
        System.out.println("setGender");
        gender Gender = null;
        JobSeeker instance = null;
        instance.setGender(Gender);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCv method, of class JobSeeker.
     */
    @Test
    public void testGetCv() {
        System.out.println("getCv");
        JobSeeker instance = null;
        String expResult = "";
        String result = instance.getCv();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCv method, of class JobSeeker.
     */
    @Test
    public void testSetCv() {
        System.out.println("setCv");
        String cv = "";
        JobSeeker instance = null;
        instance.setCv(cv);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAchievement method, of class JobSeeker.
     */
    @Test
    public void testGetAchievement() {
        System.out.println("getAchievement");
        JobSeeker instance = null;
        String expResult = "";
        String result = instance.getAchievement();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAchievement method, of class JobSeeker.
     */
    @Test
    public void testSetAchievement() {
        System.out.println("setAchievement");
        String achievement = "";
        JobSeeker instance = null;
        instance.setAchievement(achievement);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSkills method, of class JobSeeker.
     */
    @Test
    public void testGetSkills() {
        System.out.println("getSkills");
        JobSeeker instance = null;
        String expResult = "";
        String result = instance.getSkills();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSkills method, of class JobSeeker.
     */
    @Test
    public void testSetSkills() {
        System.out.println("setSkills");
        String Skills = "";
        JobSeeker instance = null;
        instance.setSkills(Skills);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSsn method, of class JobSeeker.
     */
    @Test
    public void testGetSsn() {
        System.out.println("getSsn");
        JobSeeker instance = null;
        int expResult = 0;
        int result = instance.getSsn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSsn method, of class JobSeeker.
     */
    @Test
    public void testSetSsn() {
        System.out.println("setSsn");
        int ssn = 0;
        JobSeeker instance = null;
        instance.setSsn(ssn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBirthDate method, of class JobSeeker.
     */
    @Test
    public void testGetBirthDate() {
        System.out.println("getBirthDate");
        JobSeeker instance = null;
        Date expResult = null;
        Date result = instance.getBirthDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBirthDate method, of class JobSeeker.
     */
    @Test
    public void testSetBirthDate() {
        System.out.println("setBirthDate");
        Date birthDate = null;
        JobSeeker instance = null;
        instance.setBirthDate(birthDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJobInterests method, of class JobSeeker.
     */
    @Test
    public void testGetJobInterests() {
        System.out.println("getJobInterests");
        JobSeeker instance = null;
        ArrayList<Job> expResult = null;
        ArrayList<Job> result = instance.getJobInterests();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJobInterests method, of class JobSeeker.
     */
    @Test
    public void testSetJobInterests() {
        System.out.println("setJobInterests");
        ArrayList<Job> jobInterests = null;
        JobSeeker instance = null;
        instance.setJobInterests(jobInterests);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJobs method, of class JobSeeker.
     */
    @Test
    public void testGetJobs() {
        System.out.println("getJobs");
        JobSeeker instance = null;
        ArrayList<Job> expResult = null;
        ArrayList<Job> result = instance.getJobs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJobs method, of class JobSeeker.
     */
    @Test
    public void testSetJobs() {
        System.out.println("setJobs");
        ArrayList<Job> jobs = null;
        JobSeeker instance = null;
        instance.setJobs(jobs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSeekerApplications method, of class JobSeeker.
     */
    @Test
    public void testGetSeekerApplications() {
        System.out.println("getSeekerApplications");
        JobSeeker instance = null;
        ArrayList<Application> expResult = null;
        ArrayList<Application> result = instance.getSeekerApplications();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSeekerApplications method, of class JobSeeker.
     */
    @Test
    public void testSetSeekerApplications() {
        System.out.println("setSeekerApplications");
        ArrayList<Application> seekerApplications = null;
        JobSeeker instance = null;
        instance.setSeekerApplications(seekerApplications);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
