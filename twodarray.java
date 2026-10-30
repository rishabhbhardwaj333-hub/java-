import java.util.Scanner;
public class twodarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int marks[][] = new int[rows][cols];
        // input
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                marks[i][j] = sc.nextInt();
            }
        }
        // output
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();


        // ques
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
               if(marks[i][j] ==x){
                    System.out.println("x found at " + i + " " + j  );
                }   
                }
            }
        }
    }

 