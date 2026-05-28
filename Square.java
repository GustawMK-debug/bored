public class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }
    public void show() {
        double area = side * side;
        double volume = side * side * side;
        System.out.println("Długość boku: " + side);
        System.out.println("Pole powierzchni kwadratu: " + area);
        System.out.println("Objętość sześcianu: " + volume);
    }

    public static void main(String[] args) {
        Square square1 = new Square(5.0);
        square1.show();
    }
}