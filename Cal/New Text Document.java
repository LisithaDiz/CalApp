import java.util.Scanner;
public class Oct_to_Dec {
    public static void main(String[] args) {
        Scanner input5 = new Scanner(System.in);
        System.out.println("Enter Oct: ");
        int x = input5.nextInt();

        String d=String.format("%d",x);
        int q = d.length();

        int ary2[] = new int[40];
        int i = 0, dec1 = 0 ;
        int r = 0 ;

        while (q>=0) {
            r=x%10;
            x=x/10;
            double w=r;
            double h=Math.pow(8,i);
            int e = (int)h;
            ary2[i]=r*e;
            dec1=ary2[i]+dec1;
            i++;
            q--;
        }
        System.out.println(dec1);
    }
}

