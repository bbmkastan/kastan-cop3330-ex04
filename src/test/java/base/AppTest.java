package base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void testSentenceStructure() {
        App myApp = new App();
        String noun = "dog";
        String verb = "walk";
        String adjective = "blue";
        String adverb = "quickly";

        String expectedSentence = "Do you walk your blue dog quickly? That's hilarious!";
    }
}