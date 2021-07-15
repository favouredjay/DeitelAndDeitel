package chapterFour;

public class TabularOutput {
    public static void main(String[] args) {
        System.out.printf("%s%5s%6s%8s%n" , "N" , "10*N", "100*N", "1000*N" );
        /*int N;
        for( N = 1; N <=5; N++) {
            for (int i = 10; i <= 50; i+= 10)
                System.out.printf("%d%4d%%4d%n", N, i,N);
        }*/
        for(int N = 1; N <= 5; N++){
            for(int m = N *10; m <= N*10; m+=10){
                for(int o = N * 100; o <= N * 100; o+=100){
                    for(int i = N * 1000; i <= N * 1000; i+=1000) {
                        System.out.printf("%d%4d%6d%8d%n", N, m, o, i);
                    }
                }
            }

        }
    }
}
