import java.util.Scanner;

public class Tempconvert{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Enter a Celsius value: ");
        double C = scanner.nextDouble();
        double F = C * 9.0 / 5 + 32;

        String formattedC = String.format("%.2f", C);
        String formattedF = String.format("%.2f", F);
        System.out.println(formattedC + " Celsius is " + formattedF + " Fahrenheit");

    }
}