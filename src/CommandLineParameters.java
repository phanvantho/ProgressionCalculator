import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandLineParameters implements IParameters {
    IProgressionTypeValidation _progressionTypeValidation;
    INumberValidation _numberValidation;

    public CommandLineParameters(IProgressionTypeValidation progressionTypeValidation, INumberValidation numberValidation) {
        _progressionTypeValidation = progressionTypeValidation;
        _numberValidation = numberValidation;
    }

    public String ProgressionType;
    public int Start, Diff, Amount;

    @Override
    public void setProgressionType(String progressionType) {
        this.ProgressionType = progressionType;
    }

    @Override
    public String getProgressionType() {
        return ProgressionType;
    }

    @Override
    public void setStart(int start) {
        this.Start = start;
    }

    @Override
    public int getStart() {
        return Start;
    }

    @Override
    public void setDiff(int diff) {
        this.Diff = diff;
    }

    @Override
    public int getDiff() {
        return Diff;
    }

    @Override
    public void setAmount(int amount) {
        this.Amount = amount;
    }

    @Override
    public int getAmount() {
        return Amount;
    }

    @Override
    public void GetParams() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Input progression type (AP, GP, HP): ");
            String progType = null;
            progType = reader.readLine();
            while (!_progressionTypeValidation.IsValid(progType)) {
                System.out.print("Input progression type (AP, GP, HP): ");
                progType = reader.readLine();
            }
            setProgressionType(progType);

            System.out.print("Input start number: ");
            String start = reader.readLine();
            while (!_numberValidation.IsValid(start)) {
                System.out.print("Input start number: ");
                start = reader.readLine();
            }
            setStart(Integer.parseInt(start));

            System.out.print("Input diff number: ");
            String diff = reader.readLine();
            while (!_numberValidation.IsValid(diff)) {
                System.out.print("Input diff number: ");
                diff = reader.readLine();
            }
            setDiff(Integer.parseInt(diff));

            System.out.print("Input amount number: ");
            String amount = reader.readLine();
            while (!_numberValidation.IsValid(amount)) {
                System.out.print("Input amount number: ");
                amount = reader.readLine();
            }
            setAmount(Integer.parseInt(amount));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
