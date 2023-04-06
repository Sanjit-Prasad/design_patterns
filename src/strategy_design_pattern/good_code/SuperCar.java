package strategy_design_pattern.good_code;


import strategy_design_pattern.good_code.DriveStrategy.Normal;

public class SuperCar extends Vehicle {

    public SuperCar() {
        super(new Normal());
    }
}
