/**
 * @author David Manouchehri
 *         Created on 8/6/15 at 4:50 PM.
 *         All content is under the MIT License unless otherwise specified.
 *         See LICENSE.txt for details.
 *
 *         Page 356, Question P7.16
 */

public class HotelSale {
    private String name;
    private String service;
    private double income;
    private String date;

    public HotelSale(String name, String service, double income, String date) {
        this.name = name.trim();
        this.service = service.trim().toUpperCase();
        this.income = income;
        this.date = date;
    }
    public String getName() {
        return name;
    }
    public String getService() {
        return service;
    }
    public double getIncome() {
        return income;
    }
    public String getDate() {
        return date;
    }
}