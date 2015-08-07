/**
 * @author David Manouchehri
 *         Created on 8/6/15 at 4:50 PM.
 *         All content is under the MIT License unless otherwise specified.
 *         See LICENSE.txt for details.
 *
 *         Page 356, Question P7.16
 */

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


            System.out.println("TOTALS: ");
            for(String saleType : fileMap.keySet()) {
                double totalMoney = 0;
                for(HotelSale singleSale : fileMap.get(saleType))
                    totalMoney += singleSale.getIncome();
                System.out.println(saleType + ": $" + totalMoney);
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
