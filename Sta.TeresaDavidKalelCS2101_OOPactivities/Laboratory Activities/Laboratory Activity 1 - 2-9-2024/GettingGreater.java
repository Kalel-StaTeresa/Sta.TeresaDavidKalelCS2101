import java.util.Scanner;

public class GettingGreater{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Getting the Greater Value");
        System.out.print("Enter first character: ");
        char char1 = input.next().charAt(0);
        System.out.print("Enter second character: ");
        char char2 = input.next().charAt(0);

        int asciiValue1 = (int) char1;
        int asciiValue2 = (int) char2;
        int maxAscii = Math.max(asciiValue1, asciiValue2);

        if (asciiValue1 > asciiValue2) {
            System.out.println("The character with greater value is: " +char1);
        } else if (asciiValue1 < asciiValue2) {
            System.out.println("The character with greater value is: " +char2);
        } else {
            System.out.println("Both Characters have same value.");
        }
        System.out.println("Showing ASCII codes");
        System.out.println(char1+ " : " +asciiValue1);
        System.out.println(char2+ " : " +asciiValue2);

        input.close();

    }
}
