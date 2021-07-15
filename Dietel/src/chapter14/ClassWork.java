package chapter14;

public class ClassWork {
    public static void main(String[] args) throws InterruptedException {

        String a = "68573565 234";
        StringBuilder s = new StringBuilder(a.substring(9));

        s.insert(3,")");
        s.insert(0,"(+");
        int count = 0;
        for (int i = a.length()-5; i >=0; i--) {

    if(count%3==0 && count > 0){
        s.append("-");
            }
            s.append(a.charAt(i));
            ;
            count++;
            Thread.sleep(1000);
        }
            System.out.print(s);




    }
}
