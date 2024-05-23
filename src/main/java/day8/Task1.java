package day8;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder string = new StringBuilder();
        String st = new String("");

        //Способ StringBuilder = 15-20 мс
        long startTime = System.currentTimeMillis();
        for(int i = 0; i <= 20000; i++){
            string.append(i + " ");
        }
        System.out.println(string.toString());
        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime));

        //Способ String = >200 мс
        long startTime1 = System.currentTimeMillis();
        for (int a = 0; a <= 20000; a++){
            st += a + " ";
        }
        System.out.println(st);
        long stopTime1 = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime1 - startTime1));

    }
}
