public class StaticVariable {
    static int x=10;
    public static void main(String[] args) {
        StaticVariable s1=new StaticVariable();
        StaticVariable s2=new StaticVariable();
        StaticVariable s3=new StaticVariable();

        System.out.println(s1.x);
        System.out.println(s2.x);
        System.out.println(s3.x);
        s1.x=20;
        System.out.println("After update");
        System.out.println(s1.x);
        System.out.println(s2.x);
        System.out.println(s3.x);
    }
    
}
