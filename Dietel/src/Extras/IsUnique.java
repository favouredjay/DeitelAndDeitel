package Extras;

public class IsUnique {
    boolean isUnique = false;

    public static boolean unique(String array) {
        for (int i = 0; i < array.length(); i++) {
            for (int j = i + 1; j < array.length(); j++) {
                if (array.charAt(i) == array.charAt(j))
                    return false;
            }
        }return true;
    }

    public static boolean uniqueArray(int [] array){
        for (int i = 0; i<array.length; i++){
            for(int j = i+1; j < array.length; j++){
                if (array[i] == array[j])
                    return false;

            }
        }return true;
    }




    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        System.out.println(unique("ayamatanga"));
        System.out.println(unique("love"));
        System.out.println(unique("pinkish"));
        System.out.println();
        System.out.println(uniqueArray(new int[]{2, 3, 2, 4, 5}));
        System.out.println(uniqueArray(new int[]{1, 2, 3, 4, 5}));
    }
}
