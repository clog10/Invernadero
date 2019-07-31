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
public class ComprasDBTest {
    
    public ComprasDBTest() {
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
     * Test of insertCompra method, of class ComprasDB.
     */
    @Test
    public void testInsertCompra() {
        System.out.println("insertCompra");
        Compras c = null;
        ComprasDB instance = new ComprasDB();
        boolean expResult = false;
        boolean result = instance.insertCompra(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listCompras method, of class ComprasDB.
     */
    @Test
    public void testListCompras() {
        System.out.println("listCompras");
        ComprasDB instance = new ComprasDB();
        List<Compras> expResult = null;
        List<Compras> result = instance.listCompras();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

