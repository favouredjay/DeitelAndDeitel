package chapterFour;


public class Christmas {

    public static void main(String[] args) {
        int num;

        for (num = 1; num <= 12; num++) {
            System.out.print("On the ");


            switch (num) {
                case 1 -> System.out.print("First ");
                case 2 -> System.out.print("Second ");
                case 3 -> System.out.print("Third ");
                case 4 -> System.out.print("Fourth ");
                case 5 -> System.out.print("Fifth ");
                case 6 -> System.out.print("Sixth ");
                case 7 -> System.out.print("Seventh ");
                case 8 -> System.out.print("Eighth ");
                case 9 -> System.out.print("Ninth ");
                case 10 -> System.out.print("Tenth ");
                case 11 -> System.out.print("Eleventh ");
                case 12-> System.out.print("Twelfth ");
            }

            System.out.print("day of Christmas, my true love sent to me");


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
