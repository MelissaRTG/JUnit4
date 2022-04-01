package junit.tests.ASVTests;

import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import static org.junit.Assert.*;

public class CreateTest {
    ArrayList<String> arrayList = new ArrayList<String>();


    /**
     * This test will create a successful test by adding a amount of elements to an arraylist and the assert if the amount
     * of elements equals the expected amount of elements.
     * This test conforms to the CORRECT principles boundaries:
     * Conformation: This method adds 4 elements to the arraylist and asserts if the amount
     * of elements in the arraylist equals the expected amount of elements. If you add more or less elements to the
     * arraylist, the test will fail, unless you change the expected number in the assertEqual method.
     * Ordering: The elements are added in the arraylist. The first one added will get index 0, the second one index 1, etc.
     * The values are not ordered and don't need to be ordered.
     * Range: The minimum and maximum amount of elements to add to the arraylist is 4 to let the test succeed.
     * Reference: The assertion method uses standard Java and JUnit classes that are not within control in the itself.
     * Existence: There are 4 values here. If there are no value the test will fail, unless you make the assertion an assertNull.
     * Cardinality: The test adds 4 elements to the arraylist. In the end, the test asserts if there are 4 elements in the arraylist.
     * The test also counts the time spent to execute the test.
     * Time: The test executes in under 1 ms.
     */

    @Test
    public void createSuccessfulTest() {
        long start = System.nanoTime();
        arrayList.add("String 1");
        arrayList.add("String 2");
        arrayList.add("String 3");
        arrayList.add("String 4");
        assertEquals(4, arrayList.size());
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        long end = System.nanoTime();
        System.out.println("Method " + methodName + " is successful and took " + (end - start) + " ns");
    }

    /**
     * This test creates a failed test. This test is made to fail. This test will catch the AssertError so that it doesn't affect the build.
     * This test conforms to the CORRECT principles boundary:
     * Conformation: The test will fail as the arraylist is not null. The test will succeed if the arraylist is null.
     * The method will always count the time the test spent to execute the test, no matter whether the test failed or succeeded.
     * Ordering: The values in the arraylist are not ordered and don't need to be ordered.
     * Range: The minimum amount of elements to add to the arraylist to let the test fail is 1.
     * There isn't really a maximum amount of values here.
     * Reference: The assertion method uses standard Java and JUnit classes that are not within control in the itself.
     * The getMessage method in the catch method isn't within control in the code itself either.
     * Existence: The values to exist in this case. There are 2 values. The assertion checks if there are no values.
     * If there are values in the arraylist or the arraylist returns an empty arraylist, the test will fail and will
     * go to the try-catch part.
     * Cardinality: The test adds 2 elements to the arraylist. In the end, the test asserts if the arraylist returns null.
     * The test also counts the time spent to execute the test.
     * Time: The test executes within 4 ms.
     */

    @Test
    public void createFailedTest() {
        long start = System.nanoTime();

        try {
            arrayList.add("String 1");
            arrayList.add("String 2");
            assertNull(arrayList);
        } catch (AssertionError e) {
            String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
            System.out.println("Method " + methodName + " failed: " + e.getMessage());
        }

        finally {
           long end = System.nanoTime();
            String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
            System.out.println("Method " + methodName + " took " + (end - start) + " ns");
        }

    }


    /**
     * Tests if the method returns an IndexOutOfBoundsException when executing the test.
     * This test conforms to the CORRECT principles boundaries:
     * Conformance: The test will succeed if the IndexOutOfBoundsException is triggered. This is possible
     * by trying to remove an element from the arraylist from an index that doesn't have an element.
     * If the IndexOutOfBoundsException is not triggered, the test will fail.
     * Ordering: The elements in the arraylist are not ordered and don't need to be ordered.
     * Range: The maximum elements to add in the arraylist to let the test succeed is 3. There isn't really a minimum amount
     * of elements to add to the arraylist to let the test succeed.
     * Reference: The assertion method uses standard Java and JUnit classes that are not within control in the itself.
     * Existence: There are values existing in this case. However, the value to be removed doesn't exist. If the value
     * to be removed does exist, the IndexOutOfBoundsException will not be triggered and the test will fail.
     * Cardinality: The method counts the index of the arraylist to find the element to be removed.
     * The method adds elements to the arraylist per index.
     * Time: The test executes within 1 ms.
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWithException() {
        long start = System.nanoTime();
        arrayList.add("String 1");
        arrayList.remove(3);
        long end = System.nanoTime();
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println("Method " + methodName + " was successful and took " + (end - start) + " ns");
    }


    /**
     * This test is created to be ignored. The content of the test doesn't really matter as the test will be ignored.
     * This test conforms to the CORRECT principles boundaries:
     * Conformance: The test will return an "Test ignored." message if the test is ignored. If the test is not ignored
     * it will print a message saying "Woops! The test was not ignored!"
     * Ordering: There are no values to be ordered in this test.
     * Range: The minimum and maximum values in this test don't matter. The only thing that's needed is the @Ignore annotation
     * Reference: The assertion method uses standard Java and JUnit classes that are not within control in the itself.
     * Existence: Teh values don't exist in this test. If the values did exist, it didn't matter anyway as the test will be ignored.
     * Cardinality: The test doesn't count anything.
     * Time: The test takes 1 ms to execute.
     */
    @Ignore
    @Test
    public void ignoredTest() {
        System.out.println("Woops! The method was nog ignored!");
        assertNull(arrayList);

    }


}