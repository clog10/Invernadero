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
public class EmpleadoDBTest {
    
    public EmpleadoDBTest() {
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
     * Test of insertEmpleado method, of class EmpleadoDB.
     */
    @Test
    public void testInsertEmpleado() {
        System.out.println("insertEmpleado");
        Empleado e = null;
        EmpleadoDB instance = new EmpleadoDB();
        boolean expResult = false;
        boolean result = instance.insertEmpleado(e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateEmpleado method, of class EmpleadoDB.
     */
    @Test
    public void testUpdateEmpleado() {
        System.out.println("updateEmpleado");
        Empleado e = null;
        EmpleadoDB instance = new EmpleadoDB();
        boolean expResult = false;
        boolean result = instance.updateEmpleado(e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteEmpleado method, of class EmpleadoDB.
     */
    @Test
    public void testDeleteEmpleado() {
        System.out.println("deleteEmpleado");
        Empleado e = null;
        EmpleadoDB instance = new EmpleadoDB();
        boolean expResult = false;
        boolean result = instance.deleteEmpleado(e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listEmpleado method, of class EmpleadoDB.
     */
    @Test
    public void testListEmpleado() {
        System.out.println("listEmpleado");
        EmpleadoDB instance = new EmpleadoDB();
        List<Empleado> expResult = null;
        List<Empleado> result = instance.listEmpleado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

