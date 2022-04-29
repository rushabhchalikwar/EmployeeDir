package com.rushabh.employeeservice;

import com.rushabh.entity.Employee;
import com.rushabh.utility.EmployeeUtility;

import java.util.HashMap;
import java.util.Map;

public class EmployeeServiceImpl {

    public static Map<Integer , Employee> employees = new HashMap<Integer , Employee>(){{
        put(1 , new Employee(1 ,"Employee1","Employee11" , "55252","XYZ"));
        put(2 , new Employee(2 ,"Employee2","Employee22" , "55252","XYZ"));
        put(3 , new Employee(3 ,"Employee3","Employee33" , "55252","XYZ"));
        put(4 , new Employee(4 ,"Employee4","Employee44" , "55252","XYZ"));
        put(5 , new Employee(5 ,"Employee5","Employee55" , "55252","XYZ"));
    }};

    public Employee getEmployee(int id){
        return employees.get(id);
    }

    public void addEmployee(Employee employee){
        if(EmployeeUtility.nullCheckForEmployee(employee)){
            System.out.println("Employee has no data");
        }
        else {
            employees.put(employee.getId(),employee);
        }
    }

    public void deleteEmployee(Employee employee){
        if(EmployeeUtility.nullCheckForEmployee(employee)){
            System.out.println("Employee has no data");
        }
        else {
            employees.remove(employee.getId());
        }
    }

    public void deleteEmployee(int id){

            employees.remove(id);

    }

    public void updateEmployee(Employee employee){
        if(EmployeeUtility.nullCheckForEmployee(employee)){
            System.out.println("Employee has no data");
        }
        else {
            employees.replace(employee.getId() , employee);
        }
    }
}
