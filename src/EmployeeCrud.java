import com.rushabh.employeeservice.EmployeeServiceImpl;
import com.rushabh.entity.Employee;

public class EmployeeCrud {
    public static void main(String[] args){
        EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();

        employeeServiceImpl.updateEmployee(new Employee(1 ,"EmployeeRushabh","Employee11" , "55252","XYZ"));
        System.out.println(EmployeeServiceImpl.employees);
    }
}
