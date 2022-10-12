import java.io.*;

public class Bufferread
{
    public static void main(String[] args) throws IOException
    {
        Bufferread bfr = new Bufferread();
      //  bfr.readingFile();
        bfr.writingFile(" Good Peoplel");


    }
    protected void writingFile(String data) throws IOException
    {
        File f = new File("C:\\Users\\bhara\\OneDrive\\Desktop\\wonder.txt");
        FileWriter fw = new FileWriter(f);
        fw.write(data);
        fw.flush();
        fw.close();
    }

//    protected void readingFile() throws IOException {
//        File f = new File("C:\\Users\\bhara\\OneDrive\\Desktop\\mylife.txt");
//        FileReader fr = new FileReader(f);
//        BufferedReader br = new BufferedReader(fr);
//        String line = br.readLine();
//        while (line != null) {
//            System.out.println(line);
//            line = br.readLine();
//        }
    }
