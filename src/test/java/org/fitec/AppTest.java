package org.fitec;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
    @Test
    public void sohouldReturn5Given2and3() {
        App app = new App();
        assertTrue(app.addition(2, 3) == 5);
    }
}