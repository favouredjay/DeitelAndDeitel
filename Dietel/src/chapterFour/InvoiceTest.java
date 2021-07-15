package chapterFour;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice myInvoice = new Invoice("3", "paper", 10, 100);

        System.out.println("My invoice Number: " + myInvoice.getAPartNumber());
        System.out.println("Description: " + myInvoice.getAPartDescription());
        System.out.println("Quantity of Item Purchased: " + myInvoice.getQuantityOfItemPurchased());
        System.out.println("Price per Item: " + myInvoice.getPricePerItem());

        System.out.println("Invoice Amount: "+ myInvoice.getInvoiceAmount());
    }
}
