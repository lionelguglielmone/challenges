import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayProcessor {

    public static ArrayList<ArrayList<Integer>> getNumbersWhoseSumEquals(Integer k, String arrayToProcess) {
        ArrayList<ArrayList<Integer>> result = new ArrayList();
        ArrayList<Integer> arrayFormatted = processStringArrayToIntegerArray(arrayToProcess);

        for(int i = 0; i < arrayFormatted.size(); i++) {
            for (int j = i + 1; j < arrayFormatted.size() - 1; j++) {
                if (arrayFormatted.get(i) + arrayFormatted.get(j) == k ) {
                    ArrayList<Integer> tuple = new ArrayList<>();
                    tuple.add(arrayFormatted.get(i));
                    tuple.add(arrayFormatted.get(j));
                    result.add(tuple);
                }
            }
        }
        return result;
    }

    public static ArrayList<Integer> processStringArrayToIntegerArray(String stringArray){
        ArrayList<Integer> arrayFormatted = new ArrayList<>();
        String arrayToProcessFormatted = stringArray.replace("[", "");
        arrayToProcessFormatted = arrayToProcessFormatted.replace("]","");
        String[] arrayToProcessList = arrayToProcessFormatted.split(",");
        for(String s: arrayToProcessList){
            arrayFormatted.add(Integer.valueOf(s));
        }
        return arrayFormatted;
    }
}
