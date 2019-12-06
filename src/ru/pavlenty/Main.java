package ru.pavlenty;

public class Main {

    public static void main(String[] args)  {

        Car ttt = new Car();
        try {
            ttt.bb();
        } catch (Exception e) {
            e.printStackTrace();
        }




      /*  try {
            int[] d = {1,2};
            int v = d[3];
            System.out.println("что-то внутри");
        } catch (ArrayIndexOutOfBoundsException l) {
            System.out.println(l.toString());
        } finally {
            System.out.println("что-то в finally");
        }
        System.out.println("что-то после!!!");
        */
    }
}
