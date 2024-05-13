package day5;

public class Task1 {
    public static void main(String[] args) {
        Car honda = new Car();
        honda.setModel("Honda");
        honda.setColor("Black");
        honda.setYearOfRelease(2005);

        System.out.println("This is " + honda.getModel());
        System.out.println("It's color " + honda.getColor());
        System.out.println("It is " + honda.getYearOfRelease() + " old years");
    }
}

class Car {
    private String model;
    private String color;
    private int yearOfRelease;

    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }

    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    public void setYearOfRelease(int yearOfRelease){
        this.yearOfRelease = yearOfRelease;
    }

    public int getYearOfRelease(){
        return yearOfRelease;
    }
}