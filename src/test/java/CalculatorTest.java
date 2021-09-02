import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void addingEmptyStringCheck(){
        Calculator c = new Calculator();
        assertEquals(0,c.AddStringDelimeter(""));
    }

    @Test
    public void addingOneValueCheck(){
        Calculator c = new Calculator();
        assertEquals(1,c.AddStringDelimeter("1"));
    }

    @Test
    public void addingTwoValueCheck(){
        Calculator c = new Calculator();
        assertEquals(3,c.AddStringDelimeter("1,2"));
    }

    @Test
    public void addingTreeValueCheck(){
        Calculator c = new Calculator();
        assertEquals(6,c.AddStringDelimeter("1,2,3"));
    }

    @Test
    public void addingTreeValueCheckWithNewLineBeetweenNumbers(){
        Calculator c = new Calculator();
        assertEquals(6,c.AddStringDelimeter("1\n2,3"));
    }
        }
