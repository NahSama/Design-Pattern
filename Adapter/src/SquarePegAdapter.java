import java.lang.Math;

public class SquarePegAdapter extends RoundPeg{
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg){
        super(peg.getWidth()*Math.sqrt(2)/2);
        this.peg = peg;
    }
}
