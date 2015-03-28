import java.util.Scanner;
import java.util.Random;
import static java.lang.System.out;

class TheOldSwitceroo{
public staic void main(String args[]){
Scanner myScanner=new Scanner(System.in);
Random myRandom = new Random();
int randomNumber;

out.print("Type your question, my child:");
myScanner.nextLine();

randomNumber=myRandom.nextInt(10)+1;

switch(randomNumber){
  case 1:
    out.println("Yes, isn't it obvious?");
    break;
    
  case 2:
    out.println("No, and don't ask again!");
    break;
    
  case 3:
    out.print("Yessir, yessir!");
    out.println("Three bags full");
  
  case 4:
    out.print("What part of 'no'");
    out.println("don't you understand?");
    break;
    
  case 5:
    out.println("No chance, Lance.");
    break;
    
  case 6:
    out.println("Sure, whatever.");
    break;
    
  case 7:
    out.print("Yea, but only if");
    out.println("you're nice to me");
    
  case 8:
    out.print("Yes (as if I care).");
    break;
    
  case 9:
    out.print("No, not until");
    out.println("Cromwell seizes Dover");
    break;
    
  case 10:
    out.print("No not until");
    out.println("Nell freezes over");
    break;
    
  default:
    out.print("You think you have problems?");
    out.println("My random number generator is broken!");
    break;
}

out.println("Goodbye");
}
}
