package chapterFour;

public class Invoice {

    private String aPartNumber;
    private String aPartDescription;
    private int quantityOfItemPurchased;
    private double pricePerItem;

    Invoice(String aPartNumber, String aPartDescription, int quantityOfItemPurchased, double pricePerItem){
        this.aPartNumber = aPartNumber;
        this.aPartDescription = aPartDescription;
        this.quantityOfItemPurchased = quantityOfItemPurchased;
        this.pricePerItem = pricePerItem;
    }
    public void setAPartNumber (String Newnumber){
        this.aPartNumber = aPartNumber;
    }
    public String getAPartNumber(){
        return aPartNumber;
    }
    public void setAPartDescription(String partDescription){
        this.aPartDescription = aPartDescription;
    }
    public String getAPartDescription() {
        return aPartDescription;
    }
    public void setQuantityOfItemPurchased(int quantityOfItemPurchased) {
        this.quantityOfItemPurchased = quantityOfItemPurchased;
    }
    public int getQuantityOfItemPurchased() {
        if (quantityOfItemPurchased > 0);
        return quantityOfItemPurchased;

    }
    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public double getPricePerItem() {
        if (pricePerItem > 0) ;
        return pricePerItem;
    }

    public double getInvoiceAmount() {
        double invoiceAmount = quantityOfItemPurchased * pricePerItem;
return invoiceAmount;
    }
}
