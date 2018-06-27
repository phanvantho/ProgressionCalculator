public class Controller {
    private IParameters parameters;
    private CalculationFactory calculationFactory;

    public Controller(IParameters parameters, CalculationFactory calculationFactory) {
        this.parameters = parameters;
        this.calculationFactory = calculationFactory;
    }

    public void run() {
        try {
            System.out.println("Begin");
            parameters.GetParams();
            ICalculation calculation = calculationFactory.getProgression(parameters.getProgressionType());
            calculation.Processing(parameters);
            System.out.print("\nEnd");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
}
