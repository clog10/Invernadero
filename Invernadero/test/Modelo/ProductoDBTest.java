/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;
import javax.swing.table.DefaultTableModel;
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
public class ProductoDBTest {
    
    public ProductoDBTest() {
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
     * Test of insertProducto method, of class ProductoDB.
     */
    @Test
    public void testInsertProducto() {
        System.out.println("insertProducto");
        Producto p = null;
        ProductoDB instance = new ProductoDB();
        boolean expResult = false;
        boolean result = instance.insertProducto(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteProducto method, of class ProductoDB.
     */
    @Test
    public void testDeleteProducto() {
        System.out.println("deleteProducto");
        int id = 0;
        ProductoDB instance = new ProductoDB();
        boolean expResult = false;
        boolean result = instance.deleteProducto(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listProducto method, of class ProductoDB.
     */
    @Test
    public void testListProducto() {
        System.out.println("listProducto");
        ProductoDB instance = new ProductoDB();
        List<Producto> expResult = null;
        List<Producto> result = instance.listProducto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listProducto2 method, of class ProductoDB.
     */
    @Test
    public void testListProducto2() {
        System.out.println("listProducto2");
        ProductoDB instance = new ProductoDB();
        DefaultTableModel expResult = null;
        DefaultTableModel result = instance.listProducto2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizardatos method, of class ProductoDB.
     */
    @Test
    public void testActualizardatos() {
        System.out.println("actualizardatos");
        Producto p = null;
        ProductoDB instance = new ProductoDB();
        boolean expResult = false;
        boolean result = instance.actualizardatos(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

