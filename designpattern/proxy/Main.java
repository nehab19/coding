package guru.springframework.spring5webapp.designpattern.proxy;

public class Main {
    public static void main(String[] args) {
        try {
            Employee employee = new EmployeeProxy();
            employee.create("ADMIN", employee);
            System.out.println("Operation Successful");
        } catch (Exception e) {
            System.out.println("Operation was not successful");
            e.printStackTrace();
        }
    }
}
