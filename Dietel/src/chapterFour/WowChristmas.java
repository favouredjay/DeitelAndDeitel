package chapterFour;

public class WowChristmas {

        public static void main(String[] args) {
            int num;

            for (num = 1; num <= 12; num++) {
                System.out.print("On the " + num);


                switch (num) {
                    case 1 -> System.out.println("first");
                    case 2 -> System.out.println("second");
                    case 3 -> System.out.println("third");
                    case 4 -> System.out.println("fourth");
                    case 5 -> System.out.println("fifth");
                    case 6 -> System.out.println("sixth");
                    case 7 -> System.out.println("seventh");
                    case 8 -> System.out.println("eigth");
                    case 9 -> System.out.println("ninth");
                    case 10 -> System.out.println("tenth");
                    case 11 -> System.out.println("eleventh");
                    case 12 -> System.out.println("twelveth");

                }

                System.out.println("day of Christmas my true love sent to me");


                switch (num) {
                    case 12:
                        System.out.println("Twelve Lords a Leaping!!");

                    case 11:
                        System.out.println("Eleven Ladies Dancing");

                    case 10:
                        System.out.println("ten Pipers piping!!");

                    case 9:
                        System.out.println("Nine Drummers Drumming!!");
                    case 8:
                        System.out.println("Eight Maids are milking!!");
                    case 7:
                        System.out.println("Seven swans a swimming!!");

                    case 6:
                        System.out.println("Six Geese a laying!!");

                    case 5:
                        System.out.println("Five golden rings!!");

                    case 4:
                        System.out.println("Four Colly birds!!");
                    case 3:
                        System.out.println("Three French hens!!");

                        case 2:
                        System.out.println("Two Turtle dove, and");

                    default:
                        System.out.println("A Partridge in a pear-tree!! \n ");


                }
            }
        }
    }


