package bt1;

public class Main {
    public static void main(String[] args) {
        double percent=Math.random()*100+1;
        Circle circle = new Circle(3);
        Rectangle rectangle=new Rectangle(3,4);
        Square square=new Square(3);
        System.out.println(circle.getArea());
        System.out.println(rectangle.getArea());
        System.out.println(square.getArea());
       circle.resize(percent);

       rectangle.resize(percent);
       square.resize(percent);
        System.out.println("After");
        System.out.println( circle.getArea());
        System.out.println( rectangle.getArea());
        System.out.println( square.getArea());
        square.howToColor();
    }
}
