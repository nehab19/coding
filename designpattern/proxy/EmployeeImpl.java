package guru.springframework.spring5webapp.designpattern.proxy;

public class EmployeeImpl implements Employee {

    @Override
    public void create(String client, Employee employee) {
        System.out.println("I am in create method of Employee impl");
    }

    @Override
    public void delete(String client, int employeeId) {
        System.out.println("Hi I am in delete method of Employee impl");
    }
}
