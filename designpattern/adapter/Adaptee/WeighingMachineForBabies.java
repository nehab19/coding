package guru.springframework.spring5webapp.designpattern.adapter.Adaptee;

public class WeighingMachineForBabies implements WeighingMachine{
    @Override
    public double getWeightInPound() {
        return 28;
    }
}
