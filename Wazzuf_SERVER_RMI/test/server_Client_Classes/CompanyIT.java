//
//package server_Client_Classes;
//
//import java.util.ArrayList;
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
///**
// *
// * @author kc
// */
//public class CompanyIT {
//    
//    public CompanyIT() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of editProfile method, of class Company.
//     */
//    @Test
//    public void testEditProfile() {
//        Company c = WazzufDB.getInstance().getDescription("our company is the biggest company in the middle east ");
//        assertNotNull(c);
//        
//    }
//
//    /**
//     * Test of deleteAccount method, of class Company.
//     */
//    @Test
//    public void testDeleteAccount() {
//        //error
//        Company c = WazzufDB.getInstance().getEstablishYear();
//        Company c = WazzufDB.getInstance().getCategories();
//        Company c = WazzufDB.getInstance().getDescription();
//        Company c = WazzufDB.getInstance().getWebsite();
//        Company c = WazzufDB.getInstance().getEmployees();
//        Company c = WazzufDB.getInstance().getCompanyValidationStatus();
//                
//        Company instance = new Company();
//        instance.deleteAccount();
//        assertNull(instance.getEstablishYear());
//        assertNull(instance.getCategories());
//        assertNull(instance.getDescription());
//        assertNull(instance.getWebsite());
//        assertNull(instance.getEmployees());
//        assertNull(instance.getCompanyValidationStatus());
//        assertNull(instance.equals(c));
//        
//    }
//
//    /**
//     * Test of submitReport method, of class Company.
//     */
//    @Test
//    public void testSubmitReport() {
//        System.out.println("submitReport");
//        Company instance = new Company();
//        instance.submitReport();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of update method, of class Company.
//     */
//    @Test
//    public void testUpdate() {
//        Company c = new Company( 1998, new ArrayList(),"our company is the bigesst company all over the world", "mndjdnj@gmail.com", 10);
//        int result = c.getEstablishYear();
//        assertEquals(result,1999);
//    }
//
// 
//    @Test
//    public void testRegisterCompany() {
//        Object User = WazzufDB.getInstance().login("ahmed", "5245651hgzvha");
//        assertEquals(User instanceof Company, false);
//    }
//
//    @Test
//    public void testGetCategories() {
//        
//       ArrayList<String> categories = WazzufDB.getInstance().getCategories("computer science");
//       int categoriesSize = categories.size();
//       assertEquals(categoriesSize, 1);
//    }
//
//  
//
//
//    @Test
//    public void testGetDescription() {
//  Company c = WazzufDB.getInstance().getDescription("our company is the biggest company in the middle east ");
//  assertNotNull(c);
//    }
//
//   
//
//   
//
//    
//}
