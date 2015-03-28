import java.io.File;
import io.java.FileNotFoundException;
import java.io.PrintStream;

class JustWrite{
public static void main(String args[]) throws FileNotFoundException{
PrintStream diskWriter = new PrintStream("cookedData.txt");
diskWriter.println(99.75);
}
}
