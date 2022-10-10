import java.io.IOException;
import java.util.ArrayList;

public class ArraySumApp {
    public static void main(String[] args) {

        if (args.length == 2) {
            try {
                //receives array from txt
                String array = FileReader.readFileAndConcatenateLines(args[0]);
                //receives k desired
                Integer k = Integer.parseInt(args[1]);
                ArrayList<ArrayList<Integer>> result = ArrayProcessor.getNumbersWhoseSumEquals(k,array);
                if(result.size() == 1) {
                    System.out.println("There is " + result.size() + " pair whose sum equals " + k);
                } else if(result.size()>1) {
                    System.out.println("There are " + result.size() + " pairs whose sum equals " + k);
                } else {
                    System.out.println("There are no pairs whose sum equals " + k);
                }
                for(ArrayList<Integer> tuple: result){
                    System.out.println(tuple);
                }
            } catch (IOException exception) {
                System.err.println("File is either inexistent or corrupted");
            }
        } else {
            System.err.println("Arguments missing");
        }
    }
}
