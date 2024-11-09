package guru.springframework.spring5webapp.designpattern.adapter.Adapter;

import guru.springframework.spring5webapp.designpattern.adapter.Adaptee.WeighingMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter {
    //it will take an existing interface means adaptee and then convert that into kg
    WeighingMachine weighingMachine;

    public WeightMachineAdapterImpl(WeighingMachine weighingMachine) {
        this.weighingMachine = weighingMachine;
    }

    @Override
    public double getWeightInKg() {
        double weightInPounds = weighingMachine.getWeightInPound();
        return weightInPounds * .45;

    }
}
