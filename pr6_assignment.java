class GeometricObject {
    double side1 = 1, side2 = 1, side3 = 1;
    double Peri = side1 + side2 + side3;
    double P = Peri / 2.00;
 
    double Area = Math.sqrt(P * (P - side1) * (P - side2) * (P - side3));
 
 }
 
 class Triangle extends GeometricObject {
 
    Triangle() {
        System.out.println("The Default Triangle : ");
        System.out.println("Side1 : " + side1);
        System.out.println("Side2 : " + side2);
        System.out.println("Side3 : " + side3);
        System.out.println("Area of Triange Is : " + Area);
        System.out.println("Perimeter of Triange Is : " + Peri);
    }
 
    public void setside1(double side1) {
        this.side1 = side1;
    }
 
    public double getside1() {
        return side1;
    }
 
    public void setside2(double side2) {
        this.side2 = side2;
    }
 
    public double getside2() {
        return side2;
    }
 
    public void setside3(double side3) {
        this.side3 = side3;
    }
 
    public double getside3() {
        return side3;
    }
 
    public void getArea(double Area) {
        this.Area = Area;
    }
 
    public double setArea() {
        return Area;
    }
 
    public void getPeri(double Peri) {
        this.Peri = Peri;
    }
 
    public double setPeri() {
        return Peri;
    }
 
    void tostring() {
        System.out.println("The Triangle Having 3 Sides : ");
        System.out.println("Side1 : " + side1);
        System.out.println("Side2 : " + side2);
        System.out.println("Side3 : " + side3);
        System.out.println("Area of Triange Is : " + Area);
        System.out.println("Perimeter of Triange Is : " + Peri);
    }
 
    Triangle(double a, double b, double c) {
        side1 = a;
        side2 = b;
        side3 = c;
        double Peri = (a + b + c);
        double P = Peri / 2.00;
        double Area = Math.sqrt(P * (P - a) * (P - b) * (P - c));
        System.out.println("The Specific Triangle : ");
        System.out.println("The Triangle Having 3 Sides : ");
        System.out.println("Side1 : " + a);
        System.out.println("Side2 : " + b);
        System.out.println("Side3 : " + c);
        System.out.println("Area of Triange Is : " + Area);
        System.out.println("Perimeter of Triange Is : " + Peri);
    }
 
 }
 
 class pr6_assignment extends Triangle {
    public static void main(String[] args) {
        new Triangle();
        new Triangle(25, 35, 45);
 
    }
 }