import java.util.Scanner;

public class GetArrayMean{
    public static double getArrayMean(int[] arr){
        double sum = 0;
        for(int num : arr) {
            sum += num;
        }
        return sum/arr.length;
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int [] array1;

        System.out.print("Enter number of elements: ");
        int n = input.nextInt();
        array1 = new int[n];

        for (int i = 0; i < n; i++){
            System.out.print("Enter Number: ");
            array1[i] = input.nextInt();
        }
       
        double mean = getArrayMean(array1);
        System.out.println("Mean of array is: " + mean);
        input.close();
    }

}