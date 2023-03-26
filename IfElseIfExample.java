public class IfElseIfExample {
    public static void main(String[] args) {
        int num=96;
        if(num<35){
            System.out.println("Failed");
        }
        else if(num>35 && num<50){
            System.out.println("D Grade");
        }
        else if(num>50 && num<75){
            System.out.println("C Grade");
        }
        else if(num<75 && num<90){
            System.out.println("B Grade");
        }
        else if(num>90){
            System.out.println("A Grade");
        }
        else{
            System.out.println("INVALID");
        }
    }
    
}
