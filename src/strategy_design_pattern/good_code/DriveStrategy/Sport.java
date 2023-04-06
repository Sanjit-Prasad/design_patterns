package strategy_design_pattern.good_code.DriveStrategy;

public class Sport implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Sport Drive vehicle");
    }
}
