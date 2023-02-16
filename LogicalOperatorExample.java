public class LogicalOperatorExample {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        int c=30;
        System.out.println("&& condition :"+ (a>b && a>c));
        System.out.println("|| condition :"+ (a>b || a>c));
        System.out.println("! condition :"+ !(a>b && a>c));
    }
    
}
