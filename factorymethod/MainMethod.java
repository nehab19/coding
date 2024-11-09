package guru.springframework.spring5webapp.factorymethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainMethod {
    public static void main(String[] args) throws IOException {
        PlanFactory planFactory = new PlanFactory();
        System.out.println("Enter the name of the plan you want");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String planName = bufferedReader.readLine();
        System.out.println("Enter the units of the plan");
        int units = Integer.parseInt(bufferedReader.readLine());
        Plan plan = planFactory.getPlan(planName);
        System.out.println("Bill amount for " + planName + " is this units:" + units);
        plan.getInterestRate();
        plan.calculateBill(units);

    }
}
