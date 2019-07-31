/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Clog_10
 */
public class ProveedorDBTest {
    
    public ProveedorDBTest() {
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
     * Test of insertProveedor method, of class ProveedorDB.
     */
    @Test
    public void testInsertProveedor() {
        System.out.println("insertProveedor");
        Proveedor c = null;
        ProveedorDB instance = new ProveedorDB();
        boolean expResult = false;
        boolean result = instance.insertProveedor(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateProveedor method, of class ProveedorDB.
     */
    @Test
    public void testUpdateProveedor() {
        System.out.println("updateProveedor");
        Proveedor c = null;
        ProveedorDB instance = new ProveedorDB();
        boolean expResult = false;
        boolean result = instance.updateProveedor(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteProveedor method, of class ProveedorDB.
     */
    @Test
    public void testDeleteProveedor() {
        System.out.println("deleteProveedor");
        Proveedor c = null;
        ProveedorDB instance = new ProveedorDB();
        boolean expResult = false;
        boolean result = instance.deleteProveedor(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listProveedor method, of class ProveedorDB.
     */
    @Test
    public void testListProveedor() {
        System.out.println("listProveedor");
        ProveedorDB instance = new ProveedorDB();
        List<Proveedor> expResult = null;
        List<Proveedor> result = instance.listProveedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

