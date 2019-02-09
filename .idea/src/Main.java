// Andres Berthet 171504
// Rodolfo Alonzo 15470

import java.util.Random;
import java.util.Arrrays;
import java.io*;

public class main {
    public static void main(String[] args) {
        GFG gnome = new GFG();
        CountingSort count = new CountingSort();
        Merge merg = new Merge();
        quicksort quick = new quicksort();
        Radix radix = new Radix();
        ArrayList<String> nums = new ArrayList<>();
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
                writer.write(int);
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
        Scanner read = new Scanner(new File("Numeros.txt")); // crea un scanner de file
        read.useDlimeter("");
        String info;
        while (read.hasNext()){ // lee y guarda los numero en el array
            info = read.next();
            nums.add(info);
        }
        gnome.gnomeSort(nums,3000);
        count.sort(nums);
        merg.merge(nums);
        quick.qsort(nums);
        radix.radixsort(nums,3000);


    }

}