import java.util.Random;
import java.util.Scanner;
import java.util.*;
public class javaLotto {
    public static void main(String[] args) {
        Random num = new Random();
        Scanner scanner = new Scanner(System.in); //use input

        int upBound = 49;  //Upper bound of random numbers

        int winingNumbers[]  = new int[6];
        int userNumbers[] = new int[winingNumbers.length];

        for (int i = 0; i < winingNumbers.length; i++){
            winingNumbers[i] = num.nextInt(upBound);
        }

        for (int i = 0; i < winingNumbers.length; i++){
            System.out.print("Enter your " + (i+1) + " number: ");
            userNumbers[i] = scanner.nextInt();
        }
        System.out.println("wining numbers: " + Arrays.toString(winingNumbers));
        System.out.println("Your numbers: " + Arrays.toString(userNumbers));

        int win = 0; //variable to count matching numbers in user declared numbers and random generated

        for (int i = 0; i < winingNumbers.length; i++){
            for (int j = 0; j < winingNumbers.length; j++){
                if (winingNumbers[i] == userNumbers[j]){
                    win++;
                }
            }
        }

        if (win > 0){
            System.out.println("Congrats, you get: "+win+" numbers right!");
        } else {
            System.out.println("Unfortunately you got: "+win+" numbers right better luck next time");
        }
    }
}