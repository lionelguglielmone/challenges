import java.util.ArrayList;

public class NumberProcessor {

    public static ArrayList<Integer> getBiggestProduct(Integer qtyAdjacentNumbers, String number) {
        Integer maxProductValue = 0;
        ArrayList<Integer> dataSolution = new ArrayList<>();
        for (int i = 0; i <= number.length() - qtyAdjacentNumbers; i++) {
            Integer product = 1;
            ArrayList<Integer> currentFactors = new ArrayList<>();

            for (int j = i; j < (i + qtyAdjacentNumbers); j++){
                product = product * Character.getNumericValue(number.charAt(j));
                currentFactors.add(Character.getNumericValue(number.charAt(j)));
            }
            if (product > maxProductValue) {
                maxProductValue = product;
                dataSolution = currentFactors;
            }
        }
        dataSolution.add(maxProductValue);
        return dataSolution;
    }
}
