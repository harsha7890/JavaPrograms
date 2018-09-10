
package my_pack;
import java.util.Scanner;
import java.util.*;

public class excercise_1 {

    public static void main(String args[]) {
        Scanner inpu = new Scanner(System.in);
    System.out.println("Enter the input:");
        long num;
        num = inpu.nextLong();
        long reversed=0, remainder,original=num;
        while (num!=0) {
            remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num = num / 10;
        }
        num=original;
        long sum=0;
        while(num!=0){
            remainder=num%10;
            if(remainder%2==0){
                sum=sum+remainder;
            }
            num=num/10;
        }
        if(reversed==original){
            if(sum>25){
                System.out.println("number is palindrome and is greater than 25");
            }
            else{
                System.out.println("number is palindrome and is less than 25");
            }
        }
        else{
            System.out.println("number is not a palindrome");
        }

    }
}
