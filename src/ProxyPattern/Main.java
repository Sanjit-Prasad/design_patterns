package ProxyPattern;

import ProxyPattern.Employee.Employe;
import ProxyPattern.Employee.EmployeImpl;
import ProxyPattern.Employee.EmployeeType;
import ProxyPattern.Proxy.EmployeProxyImpl;

public class Main {
    public static void main(String[] args) {
        EmployeImpl employeAdmin = new EmployeImpl(EmployeeType.ADMIN);
        Employe employe = new EmployeProxyImpl(employeAdmin);

        employe.createEmployee();
        employe.deleteEmployee();
        employe.getEmployee();

        System.out.println();

        EmployeImpl employeUser = new EmployeImpl(EmployeeType.USER);
        Employe employe1 = new EmployeProxyImpl(employeUser);

        employe1.createEmployee();
        employe1.deleteEmployee();
        employe1.getEmployee();

    }
}
