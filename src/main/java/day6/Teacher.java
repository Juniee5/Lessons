package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    private Random random = new Random();

    public void evaluate(Student student){
        int value = random.nextInt(4) + 2;

        String evaluation = "";
        switch(value){
            case 2:
                evaluation = "неудовлетворительно";
                break;
            case 3:
                evaluation = "удовлетворительно";
                break;
            case 4:
                evaluation = "хорошо";
                break;
            default:
                evaluation = "отлично";
                break;
        }

        System.out.println("Преподаватель " + this.name + " оценил студента с именем " +
                student.getName() + " по предмету " + this.subject + " на оценку " + evaluation);
    }
}

