package Practice;

public class Kata {
    int a;
    int n = 1;
    int a2;
    int d = a2 - a;
    int t = 5 * n;

    int aP;


    public  void nextNumber(int a, int a2,int thirdNumber, int n) {
        aP = a + (n - 1) * (a2 - a);

    }
    public int getNextNumber (){
        return aP;
    }

   public void nextFiveNumbers(int a, int n, int a2){
        aP = a + (n - 1) * (a2-a);
       System.out.println(aP);
       System.out.println();
        for(int i = 0; i <5; i++) {
            aP = aP + (a2-a);
            System.out.print(aP + " ");
        }
    }
   public void findSeriesOfNumbers(){
        int arithmeticProgression = a + (n-1)*(d);
   }





    }

