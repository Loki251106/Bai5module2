public class Main {
    public static void main(String[] args) {

       Circle c1=new Circle();
        System.out.println("  Radius: " +c1.getRadius());
        System.out.println("dien tich hinh tron la: "+c1.getArea());

        Circle c2=new Circle(5);
        System.out.println("ban kinh hinh tron la: "+ c2.getRadius());
        System.out.println("dien tich hinh tron 2 la : "+c2.getArea());

    }
}