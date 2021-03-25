public class Main {

    public static void main(String[] args){
        //Initialize Parent instance
        Student studentA = new Student("Hoang", 3);
        //Clone parent instance to parent instance
        Student studentB = studentA.clone();

        System.out.println(studentA);
        System.out.println(studentB);

        //Initialize Child intance
        GiftedStudent studentC = new GiftedStudent("Nguyen", 1, "CS");
        System.out.println(studentC);

        //Clone child instance to parent instance
        Student studentD = studentC.clone();
        System.out.println(studentD);

        //Clone parent instance to child instance
        //Cannot compile
        //studentC = studentD.clone();
        //System.out.println(studentC);
    }
}
