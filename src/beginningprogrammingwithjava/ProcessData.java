import java.util.Scanner;
class ProcessData{
public static void main(String args[])[
Scanner myScanner=new Scanner(System.in);
double amount;
boolean taxable;
double total;

System.out.print("Amount:");
amount=myScanner.nextDouble();
System.out.print("Taxable? (true/false)");
taxable=myScanner.nextBoolean();

if(taxable){
total=amounnt*1.05;
} else{
total=amount;
}

System.out.print("Total:");
System.out.println(total);
}
}
