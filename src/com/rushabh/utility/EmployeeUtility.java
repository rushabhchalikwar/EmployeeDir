package com.rushabh.utility;

import com.rushabh.entity.Employee;

public class EmployeeUtility {
    public static boolean nullCheckForEmployee(Employee employee){
        if(employee == null){
            return true;
        }
        else {
            return false;
        }
    }
}
