import java.util.Scanner;
import static java.lang.System.out;

class WinLoseOrTie{
public static void main(String args[]){
Scanner myScanner=new Scanner(System.in);
int hankees, socks;

out.print("Hankees and socks scores?");
hankees=myScanner.nextInt();
socks=myScanner.nextInt();
out.println();

if(hankees>socks){
out.println("Hankees win...");
out.print("Hankees:");
out.println(hankees);
out.print("Socks:");
out.println(socks);
out.print("Hankees:");
out.println(hankees);
}else{
out.println("It's a tie...");
out.print("Hankees:");
out.println(hankees);
out.print("Socks:");
out.print(socks);
}
}
}
