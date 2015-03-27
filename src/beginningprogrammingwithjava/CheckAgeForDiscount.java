import java.util.Scanner;
class CheckAgeForDiscount{
public static void main(String args[]){
Scanner myScanner= new Scanner(System.in);
int age;
double price=0.00;
char reply;

System.out.print("How old are you?");
age=myScanner.FindWithinHorizon(".",0).charAt(0);

if(age>=12 && age<65){
price=9.25;
}
if(age<12||age>=65){
price=5.25;
}

if((reply=='Y'||reply=='y') &&
(age>=12 && age<65)){
price-=2.00;
}

System.out.print("Please pay $");
System.out.print(price);
System.out.print(".");
System.out.print("Enjoy the show!");
}
}
