import java.util.Scanner;
public class Dec_to_Hex{
        public static void main(String[]args){
         Scanner input3 = new Scanner(System.in);
         System.out.println("Enter the Dec : ");
         int x = input3.nextInt();

         String ary1[] = new String[40];
         String[] s= {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F" };
         int r=0 , p=0,  i=0;

         while(x!=0){
             r=x%16;
             x=x/16;
             ary1[i]=s[r];
             i++;
         }
         i--;
         while (i !=-1 ){
             System.out.print(ary1[i]);
             i--;
         }
        }
}