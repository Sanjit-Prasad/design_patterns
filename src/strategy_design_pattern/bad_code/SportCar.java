package strategy_design_pattern.bad_code;

public class SportCar extends Vehicle {

    @Override
    public void drive() {
        // This will use drive() functionality different from Vehicle class.
        System.out.println("Sport Drive vehicle");
    }
}
