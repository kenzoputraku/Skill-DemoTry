import java.beans.Transient;

import static org.junit.Assert.*;
import org.junit.*;


public class SkillDemoTester {
    @Test 
    public void substraction(){
        assertEquals(3,SkillDemo.substraction(6, 3));
    }

}
