import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

class ReadAndWrite{
public static void main(String args[]) throws FileNotFoundException{
Scanner diskScanner=new Scanner (new Scanner(new File("rawData.txt"));
PrintStream diskWritier=new PrintStream("cookedSata.txt");
double UnitPrice, quantity, total;

unitPrice=diskScanner.nextDouble();
quanitity=diskScanner.nextInt();

total=unitPrice*quanitity;
diskWriter.println(total);
}}
