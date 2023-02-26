package week7.day2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class RetryListener implements IRetryAnalyzer, IAnnotationTransformer {

	int retryLimit = 0;
	int maxRetry = 1;

	@Override
	public boolean retry(ITestResult result) {
		if (retryLimit < maxRetry) {
			retryLimit++;
			return true;
		}
		return false;
	}

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		annotation.setRetryAnalyzer(RetryListener.class);
	}

}
