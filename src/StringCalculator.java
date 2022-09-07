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

        //End
        return finalAnswer;
    }

}
