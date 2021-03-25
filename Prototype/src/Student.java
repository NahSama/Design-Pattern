public class Student implements Prototype{

    protected String name;
    protected int year;

    public Student(String name, int year){
        this.name = name;
        this.year = year;
    }

    public Student(Student clonedStudent){
        this.name = clonedStudent.name;
        this.year = clonedStudent.year;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }

    public String toString(){
        return "This name is: " + this.name + " and this year is " + this.year;
    }
}

