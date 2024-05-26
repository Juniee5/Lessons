package day9.Task1;

public class Student extends Human{

    private String groupName;

    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public void printInfo(){
        System.out.println("Этот человек с именем " + super.name + " \nЭтот студент с именем " + super.name);
    }
}
