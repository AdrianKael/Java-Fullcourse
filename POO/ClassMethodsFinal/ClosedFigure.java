package ClassMethodsFinal;

public class ClosedFigure extends Figure{ //final will make that this class can't have children classes
    private int nSides;

    public ClosedFigure(double size, int nSides) {
        super(size);
        this.nSides = nSides;
    }
    final public void draw1(){ //final will make this method name UNIQUE, so any other Children class can't have this same name on a method
        System.out.println("Drawing a Closed Figure");
    }
}
