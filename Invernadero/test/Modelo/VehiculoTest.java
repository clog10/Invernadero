/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

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
public class VehiculoTest {
    
    public VehiculoTest() {
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
     * Test of getMatricula method, of class Vehiculo.
     */
    @Test
    public void testGetMatricula() {
        System.out.println("getMatricula");
        Vehiculo instance = new Vehiculo();
        String expResult = "";
        String result = instance.getMatricula();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMatricula method, of class Vehiculo.
     */
    @Test
    public void testSetMatricula() {
        System.out.println("setMatricula");
        String matricula = "";
        Vehiculo instance = new Vehiculo();
        instance.setMatricula(matricula);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMarca method, of class Vehiculo.
     */
    @Test
    public void testGetMarca() {
        System.out.println("getMarca");
        Vehiculo instance = new Vehiculo();
        String expResult = "";
        String result = instance.getMarca();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMarca method, of class Vehiculo.
     */
    @Test
    public void testSetMarca() {
        System.out.println("setMarca");
        String marca = "";
        Vehiculo instance = new Vehiculo();
        instance.setMarca(marca);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModelo method, of class Vehiculo.
     */
    @Test
    public void testGetModelo() {
        System.out.println("getModelo");
        Vehiculo instance = new Vehiculo();
        String expResult = "";
        String result = instance.getModelo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModelo method, of class Vehiculo.
     */
    @Test
    public void testSetModelo() {
        System.out.println("setModelo");
        String modelo = "";
        Vehiculo instance = new Vehiculo();
        instance.setModelo(modelo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumSerie method, of class Vehiculo.
     */
    @Test
    public void testGetNumSerie() {
        System.out.println("getNumSerie");
        Vehiculo instance = new Vehiculo();
        int expResult = 0;
        int result = instance.getNumSerie();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumSerie method, of class Vehiculo.
     */
    @Test
    public void testSetNumSerie() {
        System.out.println("setNumSerie");
        int numSerie = 0;
        Vehiculo instance = new Vehiculo();
        instance.setNumSerie(numSerie);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnio method, of class Vehiculo.
     */
    @Test
    public void testGetAnio() {
        System.out.println("getAnio");
        Vehiculo instance = new Vehiculo();
        int expResult = 0;
        int result = instance.getAnio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnio method, of class Vehiculo.
     */
    @Test
    public void testSetAnio() {
        System.out.println("setAnio");
        int anio = 0;
        Vehiculo instance = new Vehiculo();
        instance.setAnio(anio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Vehiculo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Vehiculo instance = new Vehiculo();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Vehiculo.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Vehiculo o = null;
        Vehiculo instance = new Vehiculo();
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

