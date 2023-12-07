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
public class LoginFormTest {
    
    public LoginFormTest() {
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
     * Test of validar method, of class LoginForm.
     */
    @Test
    public void testValidar() {
        System.out.println("validar");
        LoginForm instance = new LoginForm();
        instance.validar();
     
    }

    /**
     * Test of main method, of class LoginForm.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        LoginForm.main(args);
      
    }
    
}
