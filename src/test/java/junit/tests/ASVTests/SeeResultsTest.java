package junit.tests.ASVTests;

import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SeeResultsTest {
    ArrayList<String> arrayList = new ArrayList<String>();


    /**
     * Simple test to add a value to an arraylist.
     * This test conforms to the CORRECT principles boundaries:
     * Conformance: One value is added to the arraylist. The assertion expects one value.
     * If the amount of elements in te arraylist does not equal 1 the test will fail.
     * Ordering: The elements in the arraylist are not ordered and don't need to be ordered.
     * Range: The maximum and minimum value to let this test succeed is 1.
     * Reference: The assertion method uses standard Java and JUnit classes that are not within control in the itself.
     * Existence: The value does exist. If the value is null the test will fail.
     * Cardinality: The method counts exactly one value. The assertion checks if there is exactly one value in the arraylist.
     * Time: The method executes in under 1 ms.
     */
    @Test
    public void addStringToArrayList() {
        arrayList.add("String 1");
        assertEquals(1, arrayList.size());
    }


    /**
     * This test adds and removes a value from the arraylist. This test is designed to fail.
     * During the build this test will be ignored to let the build succeed.
     * This test conforms to the CORRECT principles boundary.
     * Conformance: The test checks if the value is null.
     * Because the method returns an empty arraylist this test will fail.
     * Ordering: The values are not ordered and don't need to be ordered.
     * Range: In the beginning the arraylist has one value. At the end the arraylist has no values.
     * There isn't really a maximum amount of values. The minimum anount of values in the arraylist should be one
     * to remove a value from the arraylist.
     * Reference: The assertion method uses standard Java and JUnit classes that are not within control in the itself.
     * Existence; The values do exist in this case. The arraylist cannot be null in this case unless you don't add any values
     * to the arraylist. This test will always fail.
     * Cardinality: The method adds one value to the arraylist. In the end, the arraylist will have zero elements.
     * Time: The test executes within 10 ms.
     */
    @Test
    public void addAndRemoveStringFromArrayList() {
        arrayList.add("String 1");
        arrayList.remove(0);
        assertNull(arrayList);
    }

    /**
     * Clears an arraylist and will return an empty arraylist. This method will fail because the arraylist is not null.
     * During the build this method will be ignored to let the build succeed.
     * This test conforms to the CORRECT principles boundaries:
     * Conformance: The test will always fail because the arraylist is not null. If you don't add anything to the arraylist,
     * the arraylist will be null and the test will succeed.
     * Ordering: The values have their own index and are added in the order they are added to.
     * So "String 1" will have index 0, "String 2" will have index 1, etc. The values are not ordered and don't need to be ordered.
     * Range: The isn't really a maximum amount of values here. There should be minimal one value added to the arraylist
     * to remove a value.
     * Reference: The assertion method uses standard Java and JUnit classes that are not within control in the itself.
     * Existence: The values do exist in this case. If the value is null the test will succeed., but then nothing can be
     * removed from the arraylist.
     * Cardinality: The test counts 4 elements in the arraylist, beginning with index 0. In the end, the test counts 0 elements
     * in the arraylist.
     * Time: The test executes within 15 ms.
     */

    @Test
    public void clearArrayList() {
        arrayList.add("String 1");
        arrayList.add("String 2");
        arrayList.add("String 3");
        arrayList.add("String 4");
        arrayList.clear();
        assertNull(arrayList);
    }


    /**
     * A test that is made to fail on purpose. This test will be ignored during the build to let the build succeed.
     * This test conforms to the CORRECT principles boundary:
     * Conformance: The test will fail is the arraylist is not null. If you don't add any values to the arraylist
     * the test will succeed.
     * Ordering: The values in the arraylist are not ordered and don't need to be ordered.
     * Range: There isn't really a maximum value here. To let the test fail the minimum amount of
     * elements to be added to the arraylist is one.
     * Reference: The assertion method uses standard Java and JUnit classes that are not within control in the itself.
     * Existence: The values do exist in this case. If the arraylist is null the test will succeed.
     * Cardinality: The method counts one element to the arraylist.
     * Time: The test executes within 2 ms.
     */
    @Test
    public void failedTest() {
        arrayList.add("String 1");
        assertNull(arrayList);
    }


    /**
     * This test is ignored on purpose to show ignored tests in the test results.
     * This test conforms to the CORRECT principles boundary:
     * Conformance: The test checks if the test will be ignored. If the test is not ignored
     * the test will be executed and will fail.
     * Ordering: The values are not ordered and don't need to be ordered.
     * Range: There aren't really minimum and maximum values in this test. The minimum requirement is
     * the @Ignore annotation to let the test be ignored.
     * Reference: The assertion method uses standard Java and JUnit classes that are not within control in the itself.
     * Existence: The values do exist here, however, they will not be used because the test will be ignored.
     * Cardinality: The test doesn't count anything here. The test will be skipped and therefore nothing will be executed.
     * Time: The test does not execute and therefore takes 0 ms to execute.
     */

    @Ignore
    @Test
    public void ignoredTest() {
        arrayList.add("String 1");
        arrayList.add("String 2");
        assertEquals(1, arrayList);
    }




}





