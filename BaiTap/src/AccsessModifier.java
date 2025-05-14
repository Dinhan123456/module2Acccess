public class AccsessModifier {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(3.5);

        System.out.println("Circle 1:");
        System.out.println("radius = " + c1.getRadius());
        System.out.println("area = " + c1.getArea());

        System.out.println("\nCircle 2:");
        System.out.println("radius = " + c2.getRadius());
        System.out.println("area = " + c2.getArea());
    }
}
