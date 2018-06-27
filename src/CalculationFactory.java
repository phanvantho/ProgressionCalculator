public class CalculationFactory {
    public Calculation getProgression(String progressionType) {
        switch (progressionType) {
            case "AP":
                return new APCalculation();
            default:
                System.out.print("Not implemented.");
                return null;
        }
    }
}
