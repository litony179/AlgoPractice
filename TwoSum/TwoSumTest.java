package TwoSum;

import static org.junit.Assert.*;
import org.junit.*;

public class TwoSumTest {

    @Test
    public void testTwoSum(){
        assertEquals(43, TwoSum.findMax(new int[]{1,5,4,7,6,10,43}));
        assertEquals(-1, TwoSum.findMax(new int[]{-1,-3,-5, -6}));
    }
    
}
