public class GiftedStudent extends Student implements Prototype{

    private String subject;

    public GiftedStudent(String name, int year, String subject){
        super(name, year);
        this.subject = subject;
    }

    public GiftedStudent(GiftedStudent clonedGiftedStudent){
        super(clonedGiftedStudent);
        this.subject = clonedGiftedStudent.subject;
    }

    @Override
    public GiftedStudent clone() {
        return new GiftedStudent(this);
    }

    public String toString(){
        return "This name is: " + this.name + " and this year is " + this.year + " and this subject is " + this.subject;
    }
}

