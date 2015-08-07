public class HotelSale {
    private String name;
    private String service;
    private double income;
    private String date;

    public HotelSale(String name, String service, double income, String date) {
        this.name = name;
        this.service = service;
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