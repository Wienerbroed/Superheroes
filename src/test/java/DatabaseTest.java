import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DatabaseTest {


    @Test
    public void testGetName() {
        Hero hero = new Hero("Superman", "Clark Kent", "Super strength", 1938, "No", 9999);
        assertEquals("Superman", hero.getName());
    }

    // Add more test methods for other functionalities
}