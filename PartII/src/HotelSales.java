import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author David Manouchehri
 *         Created on 8/6/15 at 4:50 PM.
 *         All content is under the MIT License unless otherwise specified.
 *         See LICENSE.txt for details.
 *
 *         Page 356, Question P7.16
 */
public class HotelSales {
    public static void main(String[] args) throws FileNotFoundException {
        String filename = args[0];
        System.out.println("Opening " + filename + "...");

        try {
            Scanner inFile = new Scanner(new File(filename));

            HotelSales holder = new HotelSales();

            holder.setServiceType("test1");
            System.out.println(holder.getServiceType());
            holder.addServiceIncome(32.34);
            System.out.println(holder.getServiceIncome());

            while (inFile.hasNextLine()) {
                holder.setServiceType("test2");
                String[] split = splitter(inFile.nextLine());

                if(split.length != 4) {
                    System.out.print("Error in file format.");
                    break;
                }

                System.out.println(holder.getServiceType());
                System.out.println(holder.getServiceIncome());
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

    private String serviceType;
    private double serviceIncome = 0;

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType.toUpperCase();
    }
    public void setServiceIncome(double serviceIncome) {
        this.serviceIncome = serviceIncome;
    }
    public void addServiceIncome(double serviceIncome) {
        this.serviceIncome += serviceIncome;
    }
    public String getServiceType() {
        return serviceType;
    }
    public double getServiceIncome() {
        return serviceIncome;
    }
}
