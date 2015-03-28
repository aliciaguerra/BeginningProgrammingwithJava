import java.util.Scanner;
class ComputeTotal{
public static void main(String args[]){
Scanner myScanner=new Scanner(System.in);
//i think this has a typo, shouldn't quanitity be an int?
double unitPrice, quanitity, total;

unitPrice=myScanner.nextDouble();
quanitity=myScanner.nextInt();
total=unitPrice*quanitity;
System.out.println(total);
}}
