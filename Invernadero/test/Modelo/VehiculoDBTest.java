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
public class VehiculoDBTest {
    
    public VehiculoDBTest() {
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
     * Test of insertVehiculo method, of class VehiculoDB.
     */
    @Test
    public void testInsertVehiculo() {
        System.out.println("insertVehiculo");
        Vehiculo c = null;
        VehiculoDB instance = new VehiculoDB();
        boolean expResult = false;
        boolean result = instance.insertVehiculo(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateVehiculo method, of class VehiculoDB.
     */
    @Test
    public void testUpdateVehiculo() {
        System.out.println("updateVehiculo");
        Vehiculo c = null;
        VehiculoDB instance = new VehiculoDB();
        boolean expResult = false;
        boolean result = instance.updateVehiculo(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteVehiculo method, of class VehiculoDB.
     */
    @Test
    public void testDeleteVehiculo() {
        System.out.println("deleteVehiculo");
        Vehiculo c = null;
        VehiculoDB instance = new VehiculoDB();
        boolean expResult = false;
        boolean result = instance.deleteVehiculo(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listVehiculo method, of class VehiculoDB.
     */
    @Test
    public void testListVehiculo() {
        System.out.println("listVehiculo");
        VehiculoDB instance = new VehiculoDB();
        List<Vehiculo> expResult = null;
        List<Vehiculo> result = instance.listVehiculo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

