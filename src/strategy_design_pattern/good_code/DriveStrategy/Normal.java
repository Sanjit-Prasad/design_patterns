package strategy_design_pattern.good_code.DriveStrategy;

public class Normal implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal Drive strategy");
    }
}
