package com.hrms.tesscripts;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC003_SearchEmp extends General {

    public static void main(String[] args) throws Exception {

        System.out.println("TC003 Started");

        // Since TC003 extends General, no need to create object again
        TC003_SearchEmp tc = new TC003_SearchEmp();

        tc.openApplication();
        tc.login();
        tc.enterFrame();

        // Search Employee by First Name "Suresh"
        tc.SearchEmp();

        System.out.println("TC003 Completed");
    }
}
