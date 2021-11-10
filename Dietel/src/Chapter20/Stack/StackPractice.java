package Chapter20.Stack;

public class StackPractice {

    public static void testPushDouble(Stacking<Double> elements, double[]values ){
        System.out.println("Pushing numbers into a stack: ");
        for(double value : values){
            System.out.print(value + " ");
            elements.push(value);

        }
        System.out.println();

    }

    public static void testPopDouble(Stacking<Double> elements){
        System.out.println("Popping numbers from a stack: ");
        try {
            double popValue;
            while (true)  {
                popValue = elements.pop();
                System.out.print(popValue + " ");
            }

        }catch (EmptyException e){
            System.out.println();
            System.out.println( e.getMessage() );
//            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        double [] array = {1.1,2.2,3.3,4.4,5.5};


        Stacking<Double>doubleStack = new Stacking<>();

        testPushDouble(doubleStack, array);
        testPopDouble(doubleStack);
    }
}
