public class APCalculation extends Calculation {
    @Override
    public void Processing(IParameters parameters) {
        int temp = parameters.getStart();
        System.out.print(temp);
        for (int i = 1; i < parameters.getAmount(); i++) {
            temp += parameters.getDiff();
            System.out.print(", " + temp);
        }
    }
}
