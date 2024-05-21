package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Самый лучший", 2020, 35.5f, 2500.85f);
        Airplane airplane2 = new Airplane("Самый лучший", 2020, 35.5f, 2500.85f);

        Airplane.compareAirplanes(airplane1,airplane2);
    }
}