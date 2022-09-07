import com.sun.deploy.util.StringUtils;

public class StringCalculator {

    int add(String numbers){

        int finalAnswer = 0;
        //Main Code Starts Here

        String[] tokens;
        if (numbers.startsWith("//")) {
            String delimiter = numbers.substring(2, 3);
            tokens = StringUtils.splitString(numbers.substring(4), delimiter);
        } else {
            tokens = StringUtils.splitString(numbers, ",\n");
        }
        for(int i = 0; i < tokens.length; ++i) {
            if (tokens[i].matches(".*\\d.*")) {
                if (Integer.parseInt(tokens[i]) <= 1000) {
                    finalAnswer += Integer.parseInt(tokens[i]);
                }
            }
        }
        //End
        return finalAnswer;
    }

}
