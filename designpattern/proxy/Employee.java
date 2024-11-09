package guru.springframework.spring5webapp.designpattern.proxy;

public interface Employee {
    public void create(String client,Employee employee) throws Exception;
    public void delete(String client,int employeeId) throws Exception;
}
