
public class Main {

    public static void main(String[] args){
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        System.out.println("Fits? " + hole.fits(rpeg));//true

        SquarePeg smallSqPeg = new SquarePeg(5);
        SquarePeg largeSqPeg = new SquarePeg(10);
//      System.out.println("Fits? " + hole.fits(smallSqPeg); not compatible type

        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        System.out.println("Fits? " + hole.fits(smallSqPegAdapter));//true
        System.out.println("Fits? " + hole.fits(largeSqPegAdapter));//false

    }
}
