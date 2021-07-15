package chapter5;

public class TaxPlanAlternative {
    //TaxPlanAlternative alternative = new TaxPlanAlternative();
    private double fairTax;
    private double taxRate = 0.23;
    private double expense;
    private double totalAmount;

    public double getExpense() {
        if (expense > 0) {
            System.out.println(expense);
        } else {
            if (expense <= 0) {
                System.out.println("Invalid Amount, \nPlease pay a valid amount");
            }

        }
    return expense;
    }
        public void setTotalAmount (Double expense){
            totalAmount = taxRate * expense;
        }
        public double getTotalAmount () {
            return totalAmount;
        }


    }
