import java.util.Scanner;

public class Hec_to_dec {
    public static void main(String[] args) {
        String hex="0123456789ABCDEF";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter : ");
        String x= input.nextLine();

        double val=0, w=0;
        for(int i=x.length(); i>0; i--){
            int d=hex.indexOf(x.charAt(i-1));
            val= val+d*(Math.pow(16,w));
            w++;
        }
        int dec = (int)val;
        System.out.println(dec);

    }
}
