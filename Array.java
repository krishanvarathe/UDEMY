import java.util.jar.Manifest;

public class Array {
    public static void main(String [] args){
        String [] animals ={"cat","dog","mouse"};
        System.out.println(animals[1]);

        int [] numbers={1,2,3,4,5};
        System.out.println(numbers[3]);

        for(int i=0;i < animals.length;i++){
            System.out.println(animals[i]);
        }
    }

}
