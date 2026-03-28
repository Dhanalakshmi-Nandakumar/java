import java.io.*;
public class ThrowsException {
    //creating a function to read a file
    static void readFile(String fileName) throws IOException
    {
        //using try with resources to automatically close fileReader
        try(FileReader file=new FileReader(fileName))
        {
               int data;
        while((data=file.read())!=-1)
        {
            System.out.print((char)data);
        }
        }
       
    }
    public static void main(String[] args) {
        
        //calling a function and providing file path
              try
              {
                readFile("C:/Users/dhana/OneDrive/Desktop/java backend learning/core java//FileConcept//file.txt1");
              }
              catch(IOException e)
              {
                System.out.print("File not found exception"+e.getMessage());
              }
    }
}