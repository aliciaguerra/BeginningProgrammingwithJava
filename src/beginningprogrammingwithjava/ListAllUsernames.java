import java.util.Scanner;
import jaca.io.File;
import java.io.FileNotFoundExceptionl
import java.io.PrintStream;

class ListAllUsernames{
public static void main(String args[]) throws FileNotFoundException{
Scanner diskScanner=new Scanner(new File("email.txt"));
PrintStream diskWriter=new PrintStream("usernames.txt");
char symbol;
while diskScanner.findWithinHorizon(".",0).charAt(0);

while(symbol!='0'){
diskWriter.print(symbol);
symbol=diskScanner.findWithinHorizon(".",0).charAt(0);
}
diskScanner.nextLine();
diskWriter.println();
}
}
}
