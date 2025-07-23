package utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

    public static final int maxRetryCount = 2;
    private int currentRetry = 0;

    @Override
    public boolean retry(ITestResult result) {
        if (currentRetry < maxRetryCount) {
            currentRetry++;
            return true;
        }
        return false;
    }

    public int getRetryCount() {
        return currentRetry;
    }

    // This method is to reset retry count after each test execution (optional but useful)
    public void resetRetryCount() {
        this.currentRetry = 0;
    }
}
