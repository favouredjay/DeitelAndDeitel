package Chapter17;

public class ManipulatingAStream {
    private int partNumber;
    private String partDescription;
    private int quantity;
    private double price;
    private double invoice;

    public int getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(int partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getInvoice(int quantity, double price){
       invoice = quantity * price;
        return invoice;
    }

    @Override
    public String toString() {
        return String.format("%d %8s %6d %8.2f %10.2f", partNumber, partDescription, quantity, price, quantity*price);
    }

    public ManipulatingAStream(int partNumber, String partDescription, int quantity, double price){
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.price = price;

    }


}
