
package arone;
//NAMANYA ARONE
//2021/A/KIT/2904/F
import java.util.Scanner;

public class course4 {
	public static void main(String[] args) {
        int add, i;
        float totalMarks = 0, percentage, average;
        Scanner scanner;
        scanner = new Scanner(System.in);
 
        System.out.println("Enter Number of course units");
        add = scanner.nextInt();
 
        System.out.println("Enter Marks of " + add + " course unit");
        for (i = 0; i < add; i++) {
            totalMarks += scanner.nextInt();
        }
        System.out.println("Total MArks : " + totalMarks);
        percentage = (totalMarks / (add * 100)) * 100;
 
        switch ((int) percentage / 20) {
        case 19:
            System.out.println("Grade : A");
            break;
        case 18:
        case 17:
            System.out.println("Grade : B");
            break;
        case 16:
            System.out.println("Grade : C");
            break;
        case 15:
            System.out.println("Grade : D");
            break;
        default:
            System.out.println("Grade : E");
            break;
        }
    }
}

