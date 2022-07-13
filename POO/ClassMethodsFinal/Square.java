package ClassMethodsFinal;

public class Square extends ClosedFigure{
    private double Area;

    public Square(double size, int nSides, double area) {
        super(size, nSides);
        Area = area;
    }
    public void draw(){
        System.out.println("Drawing a Square");
    }
}
