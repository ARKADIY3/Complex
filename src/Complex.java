public class Complex {
    private double x;
    private double y;

    public Complex() {
    }

    public Complex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return x + " + " + y + "i";
    }

    public double add(double x, double y) {
        return x + y;
    }

    public double sub(double x, double y) {
        return x - y;
    }

    public double mul(double x, double y) {
        return x * y;
    }

    public double div(double x, double y) {
        return x / y;
    }

    public double modul(double x, double y) {
        return Math.abs(x - y);
    }

    public boolean equals(Complex obj) {
        return x == obj.x && y == obj.y;
    }


}

