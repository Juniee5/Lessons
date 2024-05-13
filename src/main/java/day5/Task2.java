package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike bike = new Motorbike();
    }
}

class Motorbike {

    private String model;
    private String color;
    private int yearOfRelease;

    public Motorbike(){
        this.model = "Kayo";
        this.color = "Red ";
        this.yearOfRelease = 2020;
        System.out.println("It's motorbike " + getModel() + " color " + getColor() + getYearOfRelease() + " old year.");
    }

    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public int getYearOfRelease(){
        return yearOfRelease;
    }
}