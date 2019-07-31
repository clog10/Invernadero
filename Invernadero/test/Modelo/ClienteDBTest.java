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
public class ClienteDBTest {
    
    public ClienteDBTest() {
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
     * Test of insertCliente method, of class ClienteDB.
     */
    @Test
    public void testInsertCliente() {
        System.out.println("insertCliente");
        Cliente c = null;
        ClienteDB instance = new ClienteDB();
        boolean expResult = false;
        boolean result = instance.insertCliente(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteCliente method, of class ClienteDB.
     */
    @Test
    public void testDeleteCliente() {
        System.out.println("deleteCliente");
        Cliente c = null;
        ClienteDB instance = new ClienteDB();
        boolean expResult = false;
        boolean result = instance.deleteCliente(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCliente method, of class ClienteDB.
     */
    @Test
    public void testUpdateCliente() {
        System.out.println("updateCliente");
        Cliente c = null;
        ClienteDB instance = new ClienteDB();
        boolean expResult = false;
        boolean result = instance.updateCliente(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectCliente method, of class ClienteDB.
     */
    @Test
    public void testSelectCliente() {
        System.out.println("selectCliente");
        Cliente c = null;
        ClienteDB instance = new ClienteDB();
        Cliente expResult = null;
        Cliente result = instance.selectCliente(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listCliente method, of class ClienteDB.
     */
    @Test
    public void testListCliente() {
        System.out.println("listCliente");
        ClienteDB instance = new ClienteDB();
        List<Cliente> expResult = null;
        List<Cliente> result = instance.listCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

