import org.junit.Assert;
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
    public void addingTreeValueCheckWithNewLineBetweenNumbers(){
        Calculator c = new Calculator();
        assertEquals(6,c.AddStringDelimeter("1\n2,3"));
    }

    @Test
    public void addingTreeValueCheckWithMixDelimitersBetweenNumbers(){
        Calculator c = new Calculator();
        assertEquals(6,c.AddStringDelimeter("//1,;2/3\n"));
    }

    @Test
    public void checkNegativeNumbersAreNotAllowedAndTrowException(){
        Calculator c = new Calculator();
        try{
            assertEquals("negatives not allowed",c.AddStringDelimeter("1,-1"));
            Assert.fail("Expected exception");
        }
        catch(Exception e){
            String expectedMessage = "negatives not allowed";
            Assert.assertEquals( "Exception message must be correct", expectedMessage, e.getMessage() );
        }
    }

        }
