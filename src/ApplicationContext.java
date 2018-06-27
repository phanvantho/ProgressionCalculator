public class ApplicationContext {
    public static void main(String[] args){
        IProgressionTypeValidation progressionTypeValidation = new ProgressionTypeValidation();

        INumberValidation numberValidation = new NumberValidation();

        IParameters parameters = new CommandLineParameters(progressionTypeValidation, numberValidation);

        CalculationFactory calculationFactory = new CalculationFactory();

        Controller controller = new Controller(parameters, calculationFactory);
        controller.run();
    }
}