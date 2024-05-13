package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String cantry = scanner.nextLine();
            if(cantry.equals("Stop"))
                break;

            switch(cantry){
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Росиия");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;
                case "Ливеппуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;

                default:
                    System.out.println("Неизвестная страна");
            }
        }
    }
}