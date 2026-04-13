package partB;

public class App {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        s1.setName("nam");
        s2.setName("bao");

        System.out.println("ten cua sv 1 la: "+ s1.getName());
        System.out.println("ten cua sv 2 la: "+ s2.getName());
    }
}
