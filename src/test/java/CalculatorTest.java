import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void addingEmptyStringCheck(){
        Calculator c = new Calculator();
        assertEquals(3,c.addition(""));
    }

    @Test
    public void addingOneValueCheck(){
        Calculator c = new Calculator();
        assertEquals(1,c.addition("1"));
    }

        }
