package day6;

public class Task2 {
    public static void main(String[] args) {
    Airplane airplane = new Airplane("Самый лучший", 2020, 35.5f, 2500.85f);

    airplane.setYear(2022);
    airplane.setLength(40.52f);

    airplane.fillUp(50);
    airplane.fillUp(1000);

    airplane.info();
    }
}

