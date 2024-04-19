package org.liandro.elainy.listeners;

import org.liandro.elainy.tests.BaseTests;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class ReportPortalListener extends TestListenerAdapter {

    BaseTests baseTests = new BaseTests();

    @Override
    public void onTestSuccess(ITestResult tr) {
        baseTests.emitLog();
    }

    @Override
    public void onTestFailure(ITestResult tr) {
        baseTests.emitLog();
    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        baseTests.emitLog();
    }

}
