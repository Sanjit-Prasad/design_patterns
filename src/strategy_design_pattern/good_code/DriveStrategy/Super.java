package strategy_design_pattern.good_code.DriveStrategy;

public class Super implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Super Drive strategy");
    }
}
