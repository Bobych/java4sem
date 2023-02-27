package bobych.java1_4sem;

public class triangle
{
    private double square;
    private double perimetr;
    public triangle(double a, double b, double c){
        count(a, b, c);
    }
    public void count(double a, double b, double c){
        double p = (a + b + c) / 2.0;
        square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        perimetr = a + b + c;
    }

    public double getSquare() {
        return square;
    }

    public double getPerimetr() {
        return perimetr;
    }
}
