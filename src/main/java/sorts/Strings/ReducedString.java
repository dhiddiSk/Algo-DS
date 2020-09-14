package sorts.Strings;
import java.io.*;
import java.util.*;

public class ReducedString {

    // Complete the superReducedString function below.
    static String superReducedString(String s) {

        // Here use a for loop and iterate through the string and check for two same adjacent chars
       StringBuilder stringBuilder = new StringBuilder(s);

        for(int i=1; i<stringBuilder.length(); i++){
            if(stringBuilder.charAt(i) == stringBuilder.charAt(i-1)){
                stringBuilder.delete(i-1, i+1);
            }
        }
        if(stringBuilder.length() == 0){
//            String empty = "Empty String";
            return "Empty String";
        }
        else{

            return stringBuilder.toString();
        }

    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        String result = superReducedString(input);

        System.out.println(result);
    }
}

