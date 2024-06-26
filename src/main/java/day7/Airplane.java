package day7;

public class Airplane {
    private String manufacturer;
    private int year;
    private float length;
    private float weight ;
    private int fuel;

    public Airplane(String manufacturer,
                    int year,
                    float length,
                    float weight){
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2){
        if(airplane1.length < airplane2.length){
            System.out.println("Второй самоелет длинее");
        } else if(airplane1.length > airplane2.length){
            System.out.println("Первый самолет длинее");
        } else{
            System.out.println("Два самолета равны");
        }
    }

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setLength(float length){
        this.length = length;
    }

    public void setWeight(float weight){
        this.weight = weight;
    }

    public void setFuel(int fuel){
        this.fuel = fuel;
    }
    public int getFuel(){
        return this.fuel;
    }

    public void fillUp(int n){
        fuel+= n;
    }
    public void info(){
        System.out.println("Изготовитель: " + manufacturer + ", "
                + "год выпуска: " + year +  ", " +  "длина: " + length + ", " + "вес: " + weight
                + ", " + "количество топлива в баке: " + fuel);
    }

}
