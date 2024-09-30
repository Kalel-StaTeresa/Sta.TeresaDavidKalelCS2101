import java.util.Scanner;

public class MultiplicationTable{
    public static int[][] getTable(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the multiplication table: ");
        int maxSize = input.nextInt();

        int[][] table = new int[maxSize][maxSize];
        for (int i=0; i < maxSize; i++){
            for(int j=0; j< maxSize; j++){
                table[i][j] = (i+1)*(j+1);
            }
        }
        input.close();
        return table;
    }

    public static void printTable(int[][] table, int maxSize){
        for(int i=0; i<maxSize; i++){
            for(int j=0; j<maxSize; j++){
                System.out.printf("%4d",table[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        int[][] table = getTable();
        int maxSize = table.length;

        System.out.println("Multiplication Table: ");
        printTable(table, maxSize);
    }
}