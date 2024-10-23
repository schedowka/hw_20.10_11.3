import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double [] myArray = new double[15];
        for (int i=0; i< 15; i++){
            myArray[i] = (double)
            Math.random();
        }
        for (double num : myArray) {
            System.out.println(num);
        }
        
    }
}