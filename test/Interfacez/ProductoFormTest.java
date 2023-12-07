/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfacez;

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
public class ProductoFormTest {
    
    public ProductoFormTest() {
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
     * Test of listarProducto method, of class ProductoForm.
     */
    @Test
    public void testListarProducto() {
        System.out.println("listarProducto");
        ProductoForm instance = new ProductoForm();
        instance.listarProducto();
      
    }


    @Test
    public void testNuevo() {
        System.out.println("nuevo");
        ProductoForm instance = new ProductoForm();
        instance.nuevo();     
    }

    @Test
    public void testLimpiarTabla() {
        System.out.println("LimpiarTabla");
        ProductoForm instance = new ProductoForm();
        instance.LimpiarTabla();
      
    }
    
}
