import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.System.out;
class ShowOccupancy{
public static void main(String args[])
throws FileNotFoundException{
Scanner myScanner=new Scanner(System.in);
Scanner diskScanner=new Scanner(new File("occupancy"));
int whichRoom;
out.print("Which room?");
whichRoom=myScanner.nextInt();
out.println("guest(s).");
}
}
