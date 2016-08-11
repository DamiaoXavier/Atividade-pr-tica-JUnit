/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetom;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author damião Xavier
 */
public class A_quadradoTest {
    
    public A_quadradoTest() {
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
     * Test of getBase method, of class A_quadrado.
     */
    @Test
    public void testGetBase() {
        System.out.println("getBase");
        int expResult = 0;
        int result = A_quadrado.getBase();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setBase method, of class A_quadrado.
     */
    @Test
    public void testSetBase() {
        System.out.println("setBase");
        int base = 0;
        A_quadrado.setBase(base);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getArea method, of class A_quadrado.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        int base = 0;
        int altura = 0;
        int expResult = 0;
        int result = A_quadrado.getArea(base, altura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setArea method, of class A_quadrado.
     */
    @Test
    public void testSetArea() {
        System.out.println("setArea");
        int area = 0;
        A_quadrado.setArea(area);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAltura method, of class A_quadrado.
     */
    @Test
    public void testGetAltura() {
        System.out.println("getAltura");
        int expResult = 0;
        int result = A_quadrado.getAltura();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAltura method, of class A_quadrado.
     */
    @Test
    public void testSetAltura() {
        System.out.println("setAltura");
        int altura = 0;
        A_quadrado.setAltura(altura);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
