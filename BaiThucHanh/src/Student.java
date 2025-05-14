public class Student {
    public static void main(String[] args) {
        StaticMethod.change();
        StaticMethod s1 = new StaticMethod(101, "Hoang");
        s1.display();
        StaticMethod s2 = new StaticMethod(102, "Khanh");
        s2.display();
        StaticMethod s3 = new StaticMethod(103, "Nam");
        s3.display();
    }
}
