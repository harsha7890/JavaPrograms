import java.util.*;
import java.lang.*;

class MultipleInputs {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int stringLength = input.length();
        String making="";
        int count = 0,number,sum = 0;
        for(int i=0;i<stringLength;i++) {
            if(input.charAt(i) == ' ' || input.charAt(i) == '\n') {
                number = Integer.parseInt(making);
                sum += number;
                making="";
                continue;
            }
            making += input.charAt(i);
        }
        number = Integer.parseInt(making);
        sum += number;
        System.out.println("\n Sum = "+sum);
    }
}