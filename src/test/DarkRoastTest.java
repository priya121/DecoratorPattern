package test;

import main.DarkRoast;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DarkRoastTest {
    DarkRoast roast = new DarkRoast();

    @Test
    public void hasADescription() {
        assertEquals(roast.getDescription(), "Most Excellent Dark Roast ");
    }

    @Test
    public void hasACost() {
        assertEquals(roast.cost(), 0.85);
    }
}