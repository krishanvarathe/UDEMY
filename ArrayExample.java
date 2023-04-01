public class ArrayExample {
    public static void main(String[] args) {
        String cars[]={"hundai","suzuki","honda"};
        cars[1]="ferari";
        String names[][]={{"hundai","suzuki","honda"},{"ABC","DEF","GHI"}};
        

        System.out.println(cars[1]);

        int arr[]=new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        

        for(int i=0;i<cars.length;i++){
            System.out.println(cars[i]);
        }
    }
}
