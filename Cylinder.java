public class Cylinder {

    private double radius;
    private double hight;

    public Cylinder(double radius, double hight) {
        this.radius = radius;
        this.hight = hight;
    }
    public void show() {
        double baseArea = Math.PI * radius * radius;
        double volume = baseArea * hight;

        System.out.println("Ppp: " + baseArea);
        System.out.println("Objętość walca: " + volume);
    }
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(4.0, 10.0);
        cylinder.show();
    }
}