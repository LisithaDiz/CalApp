import java.util.Scanner;
public class Dec_to_Bi {
    public static void main(String[] args) {
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter the Dec : ");
        int x = input2.nextInt();

        int ary[] = new int[40];
        int r=0 , p=0,  i=0;

        while(x!=0){
            r=x%2;
            x=x/2;
            ary[i]=r;
            i++;
        }
        i--;
        while (i !=-1 ){
            System.out.print(ary[i]);
            i--;
        }

    }
}
