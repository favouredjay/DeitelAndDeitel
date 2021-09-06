package Chapter6;

public class DistanceBetweenTwoPoints {


    public double distance( double x1 , double y1,double x2 , double y2){

        return Math.sqrt((Math.pow(x2-x1, 2)) + (Math.pow(y2-y1, 2)));
    }

    public static void main(String[] args) {
        DistanceBetweenTwoPoints distance = new DistanceBetweenTwoPoints();
        System.out.println(distance.distance(2,3,4,5));
    }

}
