import java.util.*;
import java.math.*;

class RP {
    private int n = 3;
    private double s = 1;
    private double x = 0;
    private double y = 0;
    double area;
    double pi = 3.14;
    double pari;

    int getNoside() {
        System.out.println("The Number of side is : " + n);
        return n;
    }

    void setNoside(int n) {
        this.n = n;
    }

    double getlengthos() {
        System.out.println("The Length Of side is : " + s);
        return s;
    }

    void setlengthos(Double s) {
        this.s = s;
    }

    public double getx() {
        System.out.println("The value of x is : " + x);
        return x;
    }

    public void setx(Double x) {
        this.x = x;
    }

    public double gety() {
        System.out.println("The value of y is : " + y);
        return y;
    }

    public void sety(Double y) {
        this.y = y;
    }

    public double perimeter() {
        pari = n * s;
        return pari;
    }

    public double area_count() {
        area = (n * s * s) / (4 * (Math.tan(pi / n)));
        return area;
    }
}

public class pr2_assignment {
    public static void main(String[] args) {
        RP r = new RP();
        r.setNoside(8);
        r.setlengthos(23.9);
        r.setx(15.8);
        r.sety(6.79);
        r.getNoside();
        r.getlengthos();
        r.getx();
        r.gety();

        System.out.println("Perimeter of polygone : " + r.perimeter());
        System.out.println("Area of polygone : " + r.area_count());
    }
}
