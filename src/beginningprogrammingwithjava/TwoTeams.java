import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;
class TwoTeams{
public static{
public static void main(String args[]){
Scanner myScanner=new Scanner(System.in);
int hankees, socks;
out.print("Hankees and Socks scores?");
hankees=myScanner.nextInt();
socks=myScanner.nextInt();
out.println();

if(hankees>socks){
out.print("Hankees:");
out.println(hankees);
out.print("Socks: ");
out.println(socks);
} else{
out.print("Socks: ");
out.println(socks);
out.print("Hankees: ");
out.println(hankees);
}
}
}
