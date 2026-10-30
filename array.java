import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        // int marks[] = new int[3];
        // marks[0] = 100;
        // marks[1] = 90;
        // marks[2] = 80;
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
// same same
        // int marks[]= {100, 90, 80};
        // for(int i=0; i<3; i++){
        //     System.out.println(marks[i]);
        // }

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // input
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        // output
        for(int i=0; i<size; i++){
            System.out.println("your marks:"+ numbers[i]);
        }   
        sc.close();


        // ques
        int x = sc.nextInt();
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==x){
                System.out.println("x is present at index: "+i);
            }
        }
        
    }
}
