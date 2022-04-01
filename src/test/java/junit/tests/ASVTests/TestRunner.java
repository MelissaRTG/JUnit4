package junit.tests.ASVTests;

import org.junit.runner.notification.Failure;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestRunner {
    /**
     * This is the execution method to print the results from the SeeResultsTest.
     * As this is not a test method, is doesn't need to conform to te CORRECT principles boundary.
     * @param args
     */

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(SeeResultsTest.class);

        System.out.println("Total numbers of tests run: " + result.getRunCount());
        System.out.println("Total numbers of tests failed: " + result.getFailureCount());
        System.out.println("Total numbers of tests ignored: " + result.getIgnoreCount());
        System.out.println("Time elapsed: " + result.getRunTime() + " ms");
        System.out.println();
        System.out.println("Failures: ");


        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
    }
}
