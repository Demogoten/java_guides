/**
 * Created by FlorinNitoiu on 8/31/2015.
 */
import java.util.Scanner;
public class apples {
    public static void main(String args[]) {
      Scanner bucky = new Scanner(System.in);
        double fnum,snum,answer;
        System.out.println("Enter first num: ");
        fnum = bucky.nextDouble();
        System.out.println("Enter second num: ");
        snum = bucky.nextDouble();
        answer = fnum+snum;
        System.out.println(answer);

    }
}