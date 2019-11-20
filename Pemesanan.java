/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hema Ditania
 */
public class Pemesanan {
    
    public PemesananModelTest() {
    }
    
    
    public static void setUpClass() {
    }
    
   
    public static void tearDownClass() {
    }
    
    
    public void setUp() {
    }
    
   
    public void tearDown() {
    }

    /**
     * Test of setIdPemesanan method, of class PemesananModel.
     */
    public void testSetIdPemesanan() {
        System.out.println("setIdPemesanan");
        String idPemesanan = "PSN112";
        PemesananModel instance = new PemesananModel("suite","2019-11-20");;
        instance.setIdPemesanan(idPemesanan);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotal method, of class PemesananModel.
     */

    public void testSetTotal() {
        System.out.println("setTotal");
        int total = 1;
        PemesananModel instance = new PemesananModel("suite","2019-11-20");
        instance.setTotal(total);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setTglPmsn method, of class PemesananModel.
     */

    public void testSetTglPmsn() {
        System.out.println("setTglPmsn");
        String tglPmsn = "2019-11-20";
        PemesananModel instance = new PemesananModel("suite","2019-11-20");
        instance.setTglPmsn(tglPmsn);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdPemesanan method, of class PemesananModel.
     */

    public void testGetIdPemesanan() {
        System.out.println("getIdPemesanan");
        PemesananModel instance = new PemesananModel("PMS0015",2,"2019-11-19");
        String expResult = "PMS0015";
        String result = instance.getIdPemesanan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal method, of class PemesananModel.
     */

    public void testGetTotal() {
        System.out.println("getTotal");
        PemesananModel instance = new PemesananModel("PMS0015",2,"2019-11-19");
        int expResult = 2;
        int result = instance.getTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getTglPmsn method, of class PemesananModel.
     */
 
    public void testGetTglPmsn() {
        System.out.println("getTglPmsn");
        PemesananModel instance = new PemesananModel("suite","2019-11-20");
        String expResult = "2019-11-20";
        String result = instance.getTglPmsn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}

