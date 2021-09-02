import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void addingEmptyStringCheck() {
        Calculator c = new Calculator();
        try {
            assertEquals(0, c.AddStringDelimeter(""));
        } catch (Exception e) {
        }
    }

    @Test
    public void addingOneValueCheck() {
        Calculator c = new Calculator();
        try {
            assertEquals(1, c.AddStringDelimeter("1"));
        } catch (Exception e) {
        }
    }

    @Test
    public void addingTwoValueCheck() {
        Calculator c = new Calculator();
        try {
            assertEquals(3, c.AddStringDelimeter("1,2"));
        } catch (Exception e) {
        }
    }

    @Test
    public void addingTreeValueCheck() {
        Calculator c = new Calculator();
        try {
            assertEquals(6, c.AddStringDelimeter("1,2,3"));
        } catch (Exception e) {
        }
    }

    @Test
    public void addingTreeValueCheckWithNewLineBetweenNumbers() {
        Calculator c = new Calculator();
        try {
            assertEquals(6, c.AddStringDelimeter("1\n2,3"));
        } catch (Exception e) {
        }
    }

    @Test
    public void addingTreeValueCheckWithMixDelimitersBetweenNumbers() {
        Calculator c = new Calculator();
        try {
            assertEquals(6, c.AddStringDelimeter("//1,;2/3\n"));
        } catch (Exception e) {
        }
    }

    @Test
    public void checkNegativeNumbersAreNotAllowedAndTrowException() {
        Calculator c = new Calculator();
        try {
            assertEquals("negatives not allowed", c.AddStringDelimeter("1,-1"));
            Assert.fail("Expected exception");
        } catch (Exception e) {
            String expectedMessage = "negatives not allowed";
            Assert.assertEquals("Exception message must be correct", expectedMessage, e.getMessage());
        }
    }

    @Test
    public void checkIgnoringNumberBigger1000() {
        Calculator c = new Calculator();
        try {
            assertEquals(2, c.AddStringDelimeter("2,1000"));
        } catch (Exception e) {
        }
    }

}
