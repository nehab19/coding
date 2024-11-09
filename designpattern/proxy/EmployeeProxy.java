package guru.springframework.spring5webapp.designpattern.proxy;

public class EmployeeProxy implements Employee {

    //as if it passes proxy then it will go to real impl
    Employee employee;

    EmployeeProxy() {
        this.employee = new EmployeeImpl();
    }

    @Override
    public void create(String client, Employee employee) throws Exception {
        //it should have a condition to surpass
        if ("ADMIN".equalsIgnoreCase(client)) {
            employee.create(client, employee);
            return;
        }
        throw new Exception("Access denied! You cannot create an object");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        if ("ADMIN".equalsIgnoreCase(client)) {
            employee.delete(client, employeeId);
            return;
        }
        throw new Exception("Access denied! You cannot delete an object");
    }
}
