package Extras;

public class CuboidVolumes {

    public int findDifference(int[] firstCuboid, int [] secondCuboid){
        int firstVolume = 1;
        int secondVolume = 1;
        for(int i : firstCuboid)
            firstVolume *=i;
        for (int j : secondCuboid)
            secondVolume *=j;
        return firstVolume > secondVolume ? firstVolume - secondVolume : secondVolume - firstVolume;

    }
}
