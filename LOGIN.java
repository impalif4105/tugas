/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing.impal;

/*import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*; */
 /*
 * @author Hema Ditania
 */
public class TestingImpal {
    
    public LoginModelTest() {
    }
    
   /*BeforeClass*/
    public static void setUpClass() {
    }
    
    /*AfterClass*/
    public static void tearDownClass() {
    }
    
    /*Before*/
    public void setUp() {
    }
    
    /*After*/
    public void tearDown() { 
    } 

    /**
     * Test of getUsername method, of class LoginModel.
     */
    public void testGetUsername() {
        System.out.println("getUsername");
        LoginModel instance = new LoginModel("Rian","R123");
        String expResult = "Rian";
        String result = instance.getUsername();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUsername method, of class LoginModel.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        LoginModel instance = new LoginModel("Rian","R123");
        instance.setUsername(username);
    }

    /**
     * Test of getPassword method, of class LoginModel.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        LoginModel instance = new LoginModel("Rian","R123");
        String expResult = "mercyOnMe";
        String result = instance.getPassword();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setPassword method, of class LoginModel.
     */
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        LoginModel instance = new LoginModel("Rian","R123");
        instance.setPassword(password);
    }
    
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
