package Chapter6;

public class IsMultiple {
    public boolean isMultiple (int number, int multipleOf){
        for(int i = 0; i<= multipleOf; i++){
            if(multipleOf % number == 0){
//                System.out.println(true);
                return true;
            }
        }
//        System.out.println(false);
      return false;
    }

    public static void main(String[] args) {
        IsMultiple multiple = new IsMultiple();
        System.out.println(multiple.isMultiple(3, 61));
    }
}
