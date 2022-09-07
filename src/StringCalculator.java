import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

    int add(String numbers){

        int finalAnswer = 0;
        boolean negFlag = false;
        List<Integer> negNumbers = new ArrayList();
        //Main Code Starts Here

        String[] tokens;
        if (numbers.startsWith("//")) {
            String delimiter = numbers.substring(2, 3);
            tokens = StringUtils.splitString(numbers.substring(4), delimiter);
        } else {
            tokens = StringUtils.splitString(numbers, ",\n");
        }
        for(int i = 0; i < tokens.length; ++i) {
            if (tokens[i].matches(".*-\\d.*")) {
                negNumbers.add(Integer.parseInt(tokens[i]));
                negFlag = true;
            }

            if (tokens[i].matches(".*\\d.*") && !negFlag) {
                if (Integer.parseInt(tokens[i]) <= 1000) {
                    finalAnswer += Integer.parseInt(tokens[i]);
                }
            } else if (tokens[i].matches(".*[a-zA-Z].*") && !negFlag) {
                char c = tokens[i].toLowerCase().charAt(0);
                int alphabetPosition = c - 96;
                finalAnswer += alphabetPosition;
            }
        }
        //End
        return finalAnswer;
    }

}
