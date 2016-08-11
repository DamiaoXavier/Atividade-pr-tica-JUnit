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
public class vendasTest {
    
    public vendasTest() {
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
     * Test of getQuatidadeProduto method, of class vendas.
     */
    @Test
    public void testGetQuatidadeProduto() {
        System.out.println("getQuatidadeProduto");
        int expResult = 0;
        int result = vendas.getQuatidadeProduto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecoProduto method, of class vendas.
     */
    @Test
    public void testGetPrecoProduto() {
        System.out.println("getPrecoProduto");
        double expResult = 0.0;
        double result = vendas.getPrecoProduto();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getValorTotal method, of class vendas.
     */
    @Test
    public void testGetValorTotal() {
        System.out.println("getValorTotal");
        int quantidade = 0;
        int preco = 0;
        double expResult = 0.0;
        double result = vendas.getValorTotal(quantidade, preco);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }   
}