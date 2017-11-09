/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progskills;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Leonardo Cardoso
 */
public class AnimalTest {
    
    public AnimalTest() {
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
     * Test of speak method, of class Animal.
     */
    @Test
	public void testMeow() {
		SpeakBehaviour catspeak = new CatSpeakBehaviour();
		Animal cat = new Animal(catspeak);
		String animalVoice = cat.speak();
		assertEquals(animalVoice,"meow");
	}
	
	@Test
	public void testHoof() {
		SpeakBehaviour dogspeak = new DogSpeakBehaviour();
		Animal dog = new Animal(dogspeak);
		String animalVoice = dog.speak();
		assertEquals(animalVoice,"hoof");
	}
    
}
