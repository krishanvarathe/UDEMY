public class InstanceVariable {
    int x = 20;
    public static void main(String[] args) {
        InstanceVariable s1=new InstanceVariable();
        InstanceVariable s2=new InstanceVariable();
        InstanceVariable s3=new InstanceVariable();

        System.out.println(s1.x);
        System.out.println(s2.x);
        System.out.println(s3.x); 
        s1.x=50;
        System.out.println("After update");
        System.out.println(s1.x);
        System.out.println(s2.x); 
        System.out.println(s3.x);     
    }
    
}
