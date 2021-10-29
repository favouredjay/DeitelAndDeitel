package chapter5;

public class ModifiedTrianglePrintingProgram {
    public static void main(String[] args) {
        for(int i = 0; i< 10; i++){
            for (int stars = 0; stars <= i; stars ++){
                System.out.print('*');
            }
            for(int spaces = 13; spaces >= i; spaces--){
                System.out.print(" ");
            }
            for(int stars = 10; stars > i; stars--) {
                System.out.print('*');
            }

            for(int spaces = 0; spaces < i+3; spaces ++) {
                System.out.print("  ");
            }
            for(int stars = 10; stars > i; stars--) {
                System.out.print('*');
            }
            for(int spaces = 13; spaces >= i; spaces--) {
                System.out.print(' ');
            }
            for(int stars = 0; stars <= i; stars++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
