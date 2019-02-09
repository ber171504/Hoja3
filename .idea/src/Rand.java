import java.util.Random;
import java.io*;
// importan io y random de las librerias de java
public class Rand{
    public static void main(String[] args){// en este main se genera el documento con numeros aleatoreos
        Random rand = new Random();
        String fileName= "Numeros";
        try {
            File file = new File(fileName);
            fileWriter = new FileWriter(fileName);
            if (!file.exists()){
                file.createNewFile();
            }
            writer = new BufferedWriter(fileWriter);
            for (int i = ; i<=2999) { // for que genera los numero y los escribe en el file
                int numero = randomnextInt(bound:1000);
                writer.write(int)
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {// apaga los writers
            if (writer != null){
                try{
                    writer.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            if (fileWriter != null){
                try{
                    fileWriter.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }

    }
}