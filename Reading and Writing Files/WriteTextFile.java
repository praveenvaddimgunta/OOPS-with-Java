import java.io.*;
class WriteTextFile {
  public static void main (String [] args) throws IOException {
    File outFile = new File ("output.txt");
    FileWriter fWriter = new FileWriter (outFile);
    PrintWriter pWriter = new PrintWriter (fWriter);
    pWriter.println ("This is a line.");
    pWriter.println ("This is another");
    pWriter.close();
  }
}