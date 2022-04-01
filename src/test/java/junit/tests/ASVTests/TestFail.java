package junit.tests.ASVTests;

import junit.framework.AssertionFailedError;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TestFail {

    ArrayList<String> arrayList = new ArrayList<String>();


    /**
     * Tests whether the arraylist is null. This test will give an AssertionError.
     * This test conforms to the CORRECT principles boundary:
     * Conformance: The test succeeds if the expected exception is thrown and fails if the expected exception is not thrown
     * Ordering: The values are not sorted and don't need to be sorted
     * Range: The is not really a maximum value. The minimum value to let the test succeed is one element, so that the exception will be triggered
     * Reference: The method uses some standard java classes. Those are not always within the control of the code itself
     * Existence: The value does exist. The method tests whether the value does not exist.
     * Cardinality: The method can test the correct value
     * Time: The method executes under 1 ms.
     */
    @Test(expected = AssertionError.class)
    public void testNullFail() {

        arrayList.add("String 1");
        arrayList.add("String 2");
        assertNull(arrayList);
    }


    /**
     * Tests the AssertionFailedError class with no message.
     *
     *@throws Exception
     *This test conforms to the CORRECT principles boundary.
     *Conformance: The method checks if the message is empty (null). The method will throw an exception if something goes wrong.
     *Ordering: The values are not ordered and don't need to be ordered.
     *Range: The method has one instance of the AssertionFailedError class.
     *Reference: The AssertionFailedError class is not within control of the code itself.
     *The method als uses standard Java methods that are not within control of the code itself.
     *Existence: The message does not exist. This is needed to let the test succeed. When the message is not null the test will fail.
     *Cardinality: The test has nothing to count as it is only a test to check the message of the class object.
     *Time: The method executes in 1 ms.
     */
    @Test
    public void assertionFailedErrorTestNoMessage() throws Exception {
        AssertionFailedError error = new AssertionFailedError();
        assertNull(error.getMessage());
    }

    /**
     * Tests the AssertionFailedError class with message
     *
     * @throws Exception
     * This test conforms to the CORRECT principles boundary.
     *Conformance: The method checks if the message given to the parameter of the method equals the expected message.
     *The method will throw an exception if something goes wrong.
     *Ordering: The values are nor ordered and don't need to be ordered.
     *Range: There is not really a minimum or maximum value. The message given to the method is a test string.
     *Reference: The AssertionFailedError class is not within control of the code itself.
     *The method als uses standard Java methods that are not within control of the code itself.
     *Existence: The message does exist in this case. When the message is null the test will fail.
     *Cardinality: The method doesn't count anything. It only checks whether the message equals the expected message.
     *Time: The method executes within 4 ms.
     */

    @Test
    public void assertionFailedErrorTestMessage() throws Exception {
        AssertionFailedError error = new AssertionFailedError("This is an error message");
        assertEquals("This is an error message", error.getMessage());
        System.out.println(error.toString());

    }


    /**
     * Tests the AssertionFailedError class with message
     *
     * @throws Exception
     * This test conforms to the CORRECT principles boundary.
     *Conformance: The method checks if the message given to the parameter of the method is empty.
     *The method will throw an exception if something goes wrong.
     *Ordering: The values are nor ordered and don't need to be ordered.
     *Range: There is not really a minimum or maximum value. The message given to the method is null.
     *Reference: The AssertionFailedError class is not within control of the code itself.
     *The method als uses standard Java methods that are not within control of the code itself.
     *Existence: The message does not exist in this case. When the message is not null the test will fail.
     *Cardinality: The method doesn't count anything. It only checks whether the message is empty.
     *Time: The method executes within 1 ms.
     */

    @Test
    public void assertionFailedErrorTestEmptyMessage() throws Exception {
        AssertionFailedError error = new AssertionFailedError(null);
        assertEquals("", error.getMessage());
    }


}
