
package edu.jsu.mcis;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class JUnitTest {
    
    public JUnitTest() {
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
    
    @Test
    public void testClassMethod1() {
        assertEquals(TestClass.testMethod1(), "Hello, World!");
    }
    
    @Test
    public void testClassMethod2() {
        assertEquals(TestClass.testMethod2(), "Hello there, world!");
    }
}
