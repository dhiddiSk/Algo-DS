package sorts.Strings;

/*
Given string s, print the number of words in string s on a new line.

s having the following properties:

- It is a concatenation of one or more words consisting of English letters.
- All letters in the first word are lowercase.
- For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.

 For example, s=oneTwoThree. There are 3 words in the string.

    s = saveChangesInTheEditor, there are 5 words in the string.
*/
import java.io.*;
import java.util.*;
public class CamelCase {

    public static void main(String[] args){

             Scanner scanner = new Scanner(System.in);
             String s = scanner.nextLine();
             int result = camelcase(s);
             System.out.println(result);
             scanner.close();
            }

    static int camelcase(String s) {

        //since all letters of the first word are lower case then start counting the uppercase letters(total), results in total+1

        int  count = 1;
        int stringLength = s.length();

        for(int i=0; i<stringLength; i++){

            char temp = s.charAt(i);

            if(Character.isUpperCase(temp)){
                count+=1;
            }

        }
        return count;

    }


}

