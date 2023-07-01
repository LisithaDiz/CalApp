import java.util.Scanner;
public class Bi_to_Dec {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter the Binary : ");
        long y = input1.nextInt();

        String c = String.format("%d", y);
        int d = c.length();

        long dec[] = new long[20];
        int i=0;
        long r=0;
        long p=0;

        while (d >=0) {
            r=y%10;
            y=y/10;
            double w=i;
            double h=(Math.pow(2,w));
            long t= (long) h;
            dec[i]=r*t;
            p=dec[i]+p;
            i++;
            d--;
        }
        System.out.println(p);
    }
}