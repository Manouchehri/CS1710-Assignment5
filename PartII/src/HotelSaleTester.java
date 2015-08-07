import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class HotelSaleTester {
    public static void main(String[] args) throws FileNotFoundException {
        String filename = args[0];
        System.out.println("Opening " + filename + "...");

        try {
            Scanner inFile = new Scanner(new File(filename));

            Map<String, List<HotelSale>> fileMap = new HashMap<String, List<HotelSale>>();

            while (inFile.hasNextLine()) {
                String[] split = splitter(inFile.nextLine());

                if(split.length != 4) {
                    System.out.print("Error in file format.");
                    break;
                }

                HotelSale sale = new HotelSale(split[0], split[1], Double.parseDouble(split[2]), split[3]);

                if(!fileMap.containsKey(sale.getService()))
                    fileMap.put(sale.getService(), new ArrayList<HotelSale>());
                fileMap.get(sale.getService()).add(sale);
            }

            System.out.println(fileMap);

            for(String a : fileMap.keySet()) {
                double totalMoney = 0;
                for(HotelSale b : fileMap.get(a))
                    totalMoney += b.getIncome();
                System.out.println(a.trim() + " : " + totalMoney);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
    public static String[] splitter(String line) {
        String splitter = ";";
        return line.split(splitter);
    }
}
