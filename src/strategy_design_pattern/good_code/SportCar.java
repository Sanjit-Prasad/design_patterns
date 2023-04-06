package strategy_design_pattern.good_code;

import strategy_design_pattern.good_code.DriveStrategy.Sport;

public class SportCar extends Vehicle {

    public SportCar() {
        super(new Sport());
    }
}
