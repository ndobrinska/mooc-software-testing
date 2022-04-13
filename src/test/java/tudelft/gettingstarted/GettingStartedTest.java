package tudelft.gettingstarted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GettingStartedTest {

    @Test
    public void addFiveTo20() {
        int result = new GettingStarted().addFive(20);
        Assertions.assertEquals(25,result);
    }

//    UNCOMMENT THE CODE BELOW, AND FILL THE GAPS!

    @Test
    public void addFiveToZero() {
        int result = new GettingStarted().addFive(0);
        Assertions.assertEquals(5, result);
    }
//
    @Test
    public void addFiveToMinus20() {
        int result = new GettingStarted().addFive(-20);
        Assertions.assertEquals(-15,result);
    }
    
    @Test
    public void addFiveTo1111() {
        int result = new GettingStarted().addFive(1111);
        Assertions.assertEquals(1116,result);
    }
        
    @Test
    public void addFiveToMinus1() {
        int result = new GettingStarted().addFive(-1);
        Assertions.assertEquals(4,result);
    }
}
