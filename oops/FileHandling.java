import java.io.*;
import java.util.*;
public class FileHandling {
    public static void main(String[] args)throws IOException {
        File f=new File("C:/Users/dhana/OneDrive/Desktop/java backend learning/core java//FileConcept");
        f.mkdir();
        File f2=new File("C:/Users/dhana/OneDrive/Desktop/java backend learning/core java//FileConcept//file.txt");
        f2.createNewFile();
        File doc=new File("C:/Users/dhana/OneDrive/Desktop/java backend learning/core java//FileConcept//learn.doc");
        doc.createNewFile();
        File xls=new File("C:/Users/dhana/OneDrive/Desktop/java backend learning/core java//FileConcept//learning.xls");
        xls.createNewFile();
        File pdf=new File("C:/Users/dhana/OneDrive/Desktop/java backend learning/core java//FileConcept//learnt.pdf");
        pdf.createNewFile();

        //writing in a file
        FileWriter fw=new FileWriter(f2);
        fw.write("java program");
        fw.close();

        //reading in a file
        FileReader fr=new FileReader(f2);
        int a;
        //file is not empty
        while((a=fr.read())!=-1)
        {
            char b=(char)a;
            System.out.print(b);
        }

        //reading via scanner
        Scanner in=new Scanner(f2);
        while(in.hasNext())
        {
            System.out.print(in.next());
        }

//file exists or not
 System.out.println("File exist "+f2.exists());
  System.out.println("File name "+f2.getName());
   System.out.println("File path "+f2.getAbsolutePath());

//deleting a empty file
doc.delete();

    }
}