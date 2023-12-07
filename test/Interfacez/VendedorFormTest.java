/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfacez;

import javax.swing.JInternalFrame;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fidel Sánchez
 */
public class VendedorFormTest {
    
    public VendedorFormTest() {
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
     * Test of getSelectedFrame method, of class VendedorForm.
     */
    @Test
    public void testGetSelectedFrame() {
        System.out.println("getSelectedFrame");
        JInternalFrame expResult = null;
        JInternalFrame result = VendedorForm.getSelectedFrame();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of listarVendedor method, of class VendedorForm.
     */
    @Test
    public void testListarVendedor() {
        System.out.println("listarVendedor");
        VendedorForm instance = new VendedorForm();
        instance.listarVendedor();
       
    }

    /**
     * Test of modificarVendedor method, of class VendedorForm.
     */
    @Test
    public void testModificarVendedor() {
        System.out.println("modificarVendedor");
        VendedorForm instance = new VendedorForm();
        instance.modificarVendedor();
      
    }

    /**
     * Test of nuevo method, of class VendedorForm.
     */
    @Test
    public void testNuevo() {
        System.out.println("nuevo");
        VendedorForm instance = new VendedorForm();
        instance.nuevo();
       
    }

    /**
     * Test of LimpiarTabla method, of class VendedorForm.
     */
    @Test
    public void testLimpiarTabla() {
        System.out.println("LimpiarTabla");
        VendedorForm instance = new VendedorForm();
        instance.LimpiarTabla();
        
    }
    
}
