public class ProgressionTypeValidation implements IProgressionTypeValidation {
    @Override
    public boolean IsValid(String progressionType) {
        return progressionType.equals(ProgressionType.AP.toString());
    }
}
