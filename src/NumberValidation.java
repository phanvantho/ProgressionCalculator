public class NumberValidation implements INumberValidation {
    @Override
    public boolean IsValid(String input) {
        boolean isNumeric = true;
        for (char c : input.toCharArray()) {
            if (!Character.isDigit(c)) isNumeric = false;
            break;
        }
        return isNumeric;
    }
}
