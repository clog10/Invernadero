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
public class UsuarioDBTest {
    
    public UsuarioDBTest() {
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
     * Test of insertUsuario method, of class UsuarioDB.
     */
    @Test
    public void testInsertUsuario() {
        System.out.println("insertUsuario");
        Usuario c = null;
        UsuarioDB instance = new UsuarioDB();
        boolean expResult = false;
        boolean result = instance.insertUsuario(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteUsuario method, of class UsuarioDB.
     */
    @Test
    public void testDeleteUsuario() {
        System.out.println("deleteUsuario");
        Usuario c = null;
        UsuarioDB instance = new UsuarioDB();
        boolean expResult = false;
        boolean result = instance.deleteUsuario(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listEmpleado method, of class UsuarioDB.
     */
    @Test
    public void testListEmpleado() {
        System.out.println("listEmpleado");
        UsuarioDB instance = new UsuarioDB();
        List<Empleado> expResult = null;
        List<Empleado> result = instance.listEmpleado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listUsuario method, of class UsuarioDB.
     */
    @Test
    public void testListUsuario() {
        System.out.println("listUsuario");
        UsuarioDB instance = new UsuarioDB();
        List<Usuario> expResult = null;
        List<Usuario> result = instance.listUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

