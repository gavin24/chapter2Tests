package ac.za.gavin;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Ignore;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;

/**
 * Created by gavin.ackerman on 2016-03-06.
 */
public class testClassTest extends TestCase{
    testClass test = new testClass();


    public void testFloatingPt() //1
    {

        float result = test.addFloats(30.0f,10.0f);
        assertEquals(40.0f,result);
    }
    public void testFloatingPtNegative() //1
    {

        float result = test.addFloats(30.0f,10.0f);
        assertNotEquals(30.0f, result);
    }

    public void testName()
    {
        String newName  = "james";
        assertSame(newName,test.name());
    }
    public void testNameNegative()
    {
        String newName  = "paul";
        assertNotSame(newName, test.name());
    }
    public void testNull()
    {

        assertNull(test.aNull());
    }
    public void testNullNegative()
    {

        assertNotNull(test.aNonNull());
    }
    public void testNonNull()
    {

        assertNotNull(test.aNonNull());
    }
    public void testNonNullNegative()
    {

        assertNull(test.aNull());
    }
    public void testList()
    {
        assertTrue(test.v().contains("blah"));
    }
    public void testListNeagtive()
    {
        assertFalse(test.v().contains("cxvxcv"));
    }
}
