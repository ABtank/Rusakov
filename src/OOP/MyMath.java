package OOP;

import java.util.Random;

public class MyMath {
    private static int COUNT = 0;


    public static int getCOUNT() {
        return COUNT;
    }

    public static int getAdd(int a, int b) {
        COUNT++;
        return a + b;
    }

    public static int getSub(int a, int b) {
        COUNT++;
        return a - b;
    }

    public static int getMult(int a, int b) {
        COUNT++;
        return a * b;
    }

    public static int getDiv(int a, int b) {
        COUNT++;
        return a / b;
    }

    public static Random random = new Random();

    public static void main(String[] args) {

        int [] arr = new int[random.nextInt(20)];

        for (int i = 0; i <arr.length ; i++) {
            arr[i]= random.nextInt(100);
            if(i%2!=0){
                System.out.println("a="+arr[i]+" b="+arr[i-1]);
                System.out.print("add="+MyMath.getAdd(arr[i-1],arr[i]));
                System.out.print(" sub="+MyMath.getSub(arr[i-1],arr[i]));
                System.out.print(" mult="+MyMath.getMult(arr[i-1],arr[i]));
                System.out.println(" div="+MyMath.getDiv(arr[i-1],arr[i]));
                System.out.println("--------------");
            }
        }
        System.out.println("Всего операций "+MyMath.getCOUNT());


    }
}
