/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfacez;

import java.awt.Graphics;
import java.awt.print.PageFormat;
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
public class ImprimirTest {
    
    public ImprimirTest() {
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
     * Test of imprimir method, of class Imprimir.
     */
    @Test
    public void testImprimir() {
        System.out.println("imprimir");
        Imprimir instance = new Imprimir();
        instance.imprimir();

    }

    /**
     * Test of print method, of class Imprimir.
     */
  
    
}
