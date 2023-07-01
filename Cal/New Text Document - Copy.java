import  java.util.Scanner;
public class Dec_to_Oct {
    public static void main(String[]args){
        Scanner input4 = new Scanner(System.in);
        System.out.println("Enter the Dec : ");
        int x = input4.nextInt();

        int ary1[] = new int[40];
        int r=0 , p=0,  i=0;

        while(x!=0){
            r=x%8;
            x=x/8;
            ary1[i]=r;
            i++;
        }
        i--;
        while (i !=-1 ){
            System.out.print(ary1[i]);
            i--;
        }
    }
}
