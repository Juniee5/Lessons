package day6;

public class Task1 {
    public static void main(String[] args) {
        Car honda = new Car();
        honda.setModel("Honda");
        honda.setColor("Black");
        honda.setYear(2005);

        Motorbike motorbike = new Motorbike("Kayo", "Red", 2020);

        honda.info();
        motorbike.info();

        System.out.println(honda.yearDifference(1999));
        System.out.println(motorbike.yearDifference(2000));
    }
}

