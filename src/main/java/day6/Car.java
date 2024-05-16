package day6;

public class Car {
    private String model;
    private String color;
    private int year;

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

    public void setYear(int year){
        this.year = year;
    }

    public int getYear(){
        return year;
    }

    public void info(){
        System.out.println("Это автомобиль");
    }

    int yearDifference(){
        return Math.abs(2000 - year);
    }

}
