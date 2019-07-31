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
public class puntoVentaDBTest {
    
    public puntoVentaDBTest() {
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
     * Test of listProducto method, of class puntoVentaDB.
     */
    @Test
    public void testListProducto() {
        System.out.println("listProducto");
        puntoVentaDB instance = new puntoVentaDB();
        List<Producto> expResult = null;
        List<Producto> result = instance.listProducto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listCliente method, of class puntoVentaDB.
     */
    @Test
    public void testListCliente() {
        System.out.println("listCliente");
        puntoVentaDB instance = new puntoVentaDB();
        List<Cliente> expResult = null;
        List<Cliente> result = instance.listCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertVenta method, of class puntoVentaDB.
     */
    @Test
    public void testInsertVenta() {
        System.out.println("insertVenta");
        Venta c = null;
        puntoVentaDB instance = new puntoVentaDB();
        boolean expResult = false;
        boolean result = instance.insertVenta(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listVentas method, of class puntoVentaDB.
     */
    @Test
    public void testListVentas() {
        System.out.println("listVentas");
        puntoVentaDB instance = new puntoVentaDB();
        List<Venta> expResult = null;
        List<Venta> result = instance.listVentas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

