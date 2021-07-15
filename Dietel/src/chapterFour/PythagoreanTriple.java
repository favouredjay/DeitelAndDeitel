
package chapterFour;

public class PythagoreanTriple {
    public static void main(String[] args) {
        System.out.printf("%s%10s%13s%n ", "Opposite", "Adjacent", "Hypothenuse");
        for (int opposite = 1; opposite < 500; opposite++) {
            for (int adjacent = 1; adjacent < 500; adjacent++) {
                for (int hypothenuse = 1; hypothenuse < 500; hypothenuse++) {
                    boolean pythagoras =Math.sqrt (Math.pow(opposite, 2) + Math.pow(adjacent, 2)) == hypothenuse;
                    if (pythagoras) {
                        System.out.printf("%5d%10d%9d\n", opposite, adjacent, hypothenuse);
                    }
                }
            }
        }
    }
}


