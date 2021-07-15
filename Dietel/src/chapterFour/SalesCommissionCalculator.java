package chapterFour;

public class SalesCommissionCalculator {
    private double weeklyPay = 200.00;
    private double grossSales = 0.09;
    private double itemsValue;
    private double grossCommission;
    private double total = 0;

    public void setItemsValues() {
        this.itemsValue = itemsValue;
    }

    public double getItemsValues() {
        return itemsValue;
    }

    public void calculateTotalItems(double itemsValue1, double itemsValue2, double itemsValue3, double itemsValue4) {
        total += itemsValue1;
        total += itemsValue2;
        total += itemsValue3;
        total += itemsValue4;

//       for (itemsValuesCounter = 0; itemsValuesCounter<4; itemsValuesCounter++){
//           total += itemsValuesCounter;
    }

    public double getTotal() {
        if (total > 0) {

        }
        return total;
    }
        public void setGrossSalesCommission ( double total){
            grossCommission = total * grossSales;
        }
        public double getGrossSalesCommission () {
            if (grossCommission > 0) {
                System.out.println();
            }
            return grossCommission;
        }
        public double getSalesEarnings () {
            double salesEarning = grossCommission + weeklyPay;
            if (salesEarning > 0) {
                System.out.println("Sales Earning for last week in dollars is " + salesEarning);
            }

            return salesEarning;
        }


    }









