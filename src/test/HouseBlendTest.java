package test;

import main.HouseBlend;
import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HouseBlendTest {
    HouseBlend houseBlend = new HouseBlend();

    @Test
    public void hasADescription() {
        assertEquals(houseBlend.getDescription(), "House Blend Coffee");
    }
    
    @Test
    public void hasACost() {
        Assert.assertEquals(houseBlend.cost(), 0.89, 0.02);
    }
}