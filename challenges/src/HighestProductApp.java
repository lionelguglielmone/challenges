import java.io.IOException;
import java.util.ArrayList;


public class HighestProductApp {
    public static void main(String[] args) {
        if (args.length == 2) {
            try {
                String numberInString = FileReader.readFileAndConcatenateLines(args[0]);
                Integer adjacentNumbers = Integer.parseInt(args[1]);

                if (adjacentNumbers > numberInString.length()) {
                    throw new RuntimeException("Adjacent numbers must be smaller than the actual number to process.");
                }
                ArrayList biggestValue = NumberProcessor.getBiggestProduct(adjacentNumbers, numberInString);
                System.out.println("The following " + adjacentNumbers + " adjacent numbers have the greatest product: ");
                for (int i = 0; i < biggestValue.size() - 1; i++) {
                    if (i < biggestValue.size() - 2) {
                        System.out.print(biggestValue.get(i) + " x ");
                    } else {
                        System.out.print(biggestValue.get(i) + " = ");
                    }
                }
                System.out.println(biggestValue.get(biggestValue.size() - 1));
            } catch (IOException exception) {
                System.err.println("File is either inexistent or corrupted");
            }
        } else {
            System.err.println("Arguments missing");
        }
    }
}