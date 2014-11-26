import java.io.*;

public class FileIO{

  public String[] load(String file) {
    File aFile = new File(file);     
    StringBuffer contents = new StringBuffer();
    BufferedReader input = null;
    try {
      input = new BufferedReader( new FileReader(aFile) );
      String line = null; 
      int i = 0;
      while (( line = input.readLine()) != null){
        contents.append(line);
        i++;
        contents.append(System.getProperty("line.separator"));
      }
    }
    catch (FileNotFoundException ex) {
      System.out.println("Can't find the file - are you sure the file is in this location: "+file);
      ex.printStackTrace();
    }
    catch (IOException ex){
      System.out.println("Input output exception while processing file");
      ex.printStackTrace();
    }
    finally {
      try {
        if (input!= null) {
          input.close();
        }
      }
      catch (IOException ex) {
        System.out.println("Input output exception while processing file");
        ex.printStackTrace();
      }
    }
    String[] array = contents.toString().split("\n");
    return array;
  }


  public void save(String file, String[] array) throws FileNotFoundException, IOException {

    File aFile = new File(file); 
    Writer output = null;
    try {
      output = new BufferedWriter( new FileWriter(aFile) );
      for(int i=0;i<array.length;i++){
        output.write( array[i] );
        output.write(System.getProperty("line.separator"));
      }
    }
    finally {
      if (output != null) output.close();
    }
  }
}