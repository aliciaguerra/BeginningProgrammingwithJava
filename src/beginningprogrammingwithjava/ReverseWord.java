import java.util.Scanner;
class ReverseWord{
public static void main(String args[]){
Scanner myScanner=new Scanner (System.in);
char c1, c2, c3, c4;
/*
Java's findwithin horizon method looks for things in the input
the things the method finds depend on the stuff you put in the parentheses
a call to findhorizon ("\\d\\d\\d) looks for a group consisting of three digits)
(".",0) tells the computer to find the next character of any kind that the user types into the keyboard
*/
c1=myScanner.findWiththinHorizon(".",0).charAt(0);
c2=myScanner.findWiththinHorizon(".",0).charAt(0);
c3=myScanner.findWiththinHorizon(".",0).charAt(0);
c4=myScanner.findWiththinHorizon(".",0).charAt(0);

System.out.print(c4);
System.out.print(c3);
System.out.print(c2);
System.out.print(c1);
System.out.println();
}
}
