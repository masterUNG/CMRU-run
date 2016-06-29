package appewtc.masterung.cmrurun;

/**
 * Created by masterUNG on 6/28/2016 AD.
 */
public class MyData {

    //Explicit
    private int[] avataInts = new int[]{R.drawable.bird48,
            R.drawable.doremon48, R.drawable.kon48,
            R.drawable.nobita48, R.drawable.rat48};

    private double[] latStationDoubles = new double[]{18.807637, 18.807997, 18.805877, 18.806679};
    private double[] lngStationDoubles = new double[]{98.985260, 98.987185, 98.987641, 98.986300};

    private int[] iconStaionInts = new int[]{R.drawable.build1, R.drawable.build2,
            R.drawable.build3, R.drawable.build4};

    public int[] getIconStaionInts() {
        return iconStaionInts;
    }

    public int[] getAvataInts() {
        return avataInts;
    }

    public double[] getLatStationDoubles() {
        return latStationDoubles;
    }

    public double[] getLngStationDoubles() {
        return lngStationDoubles;
    }
}   // Main Class
