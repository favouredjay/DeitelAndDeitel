package chapterFour;


public class Christmas {

    public static void main(String[] args) {
        int num;

        for (num = 1; num <= 12; num++) {
            System.out.println("On the " + num);


            switch (num) {
                case 1 -> System.out.println("st");
                case 2 -> System.out.println("nd");
                case 3 -> System.out.println("rd");
                default -> System.out.println("th");
            }

            System.out.println("day of Christmas my true love sent to me");


                switch (num) {
                    case 1:
                        System.out.println("A Partridge in a pear-tree!!");

                    case 2:
                        System.out.println("Two Turtle dove");
                        break;
                    case 3:
                        System.out.println("Three French hens!!");

                    case 4:
                        System.out.println("Four Colly birds!!");
                    case 5:
                        System.out.println("Five golden rings!!");
                    case 6:
                        System.out.println("Six Geese a laying!!");

                    case 7:
                        System.out.println("Seven swams a swimming!!");

                    case 8:
                        System.out.println("Eight Maids are milking!!");

                    case 9:
                        System.out.println("Nine Drummers Drumming!!");
                    case 10:
                        System.out.println("ten Pipers piping!!");
                    case 11:
                        System.out.println("Eleven Ladies Dancing");

                    case 12:
                        System.out.println("Twelve Lords a Leaping!!");


            }
}
    }
}
