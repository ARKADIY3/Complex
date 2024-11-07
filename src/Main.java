public class Main {
    public static void main(String[] args) {
        Complex complex1 = new Complex(5,3);
        System.out.println(complex1);
        System.out.println(complex1.add(complex1.getX(),complex1.getY()));
        System.out.println(complex1.sub(complex1.getX(),complex1.getY()));
        System.out.println(complex1.mul(complex1.getX(),complex1.getY()));
        System.out.println(complex1.div(complex1.getX(),complex1.getY()));
        System.out.println(complex1.modul(complex1.getX(),complex1.getY()));

    }
}