interface Colorable {
    static void howToColor() {
    }
}

class GeometricObject implements Colorable {
    static void howToColor() {
        System.out.println("Color of the each side is Green");
    }
}

class Square extends GeometricObject {
    private double side1 = 0;

    Square() {
        System.out.println("Default Squre :");
        System.out.println("Area of square : " + side1 * side1);
        System.out.println();
    }

    public double getside1() {
        return side1;
    }

    public void setside1(double side1) {
        this.side1 = side1;
    }

    public void area() {
        System.out.println("Successfully Created a square...");
        System.out.println("Area of square : " + this.side1 * this.side1);
    }
}

class pr9_assignment extends GeometricObject {
    public static void main(String[] args) {
        Square s = new Square();
        s.setside1(15);
        s.getside1();
        s.area();
    }
}