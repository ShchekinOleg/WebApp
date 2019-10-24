import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(JunitTestSuite.class);
        int count = 0;
        for (Failure failure : result.getFailures()) {
            System.out.println(failure);
            count++;
        }
        if (count == 0) {
            System.out.println("All TESTS PASSED SUCCESSFULLY!");
        }
    }
}
