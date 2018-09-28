import java.util.Comparator;

public class SpeedComparator implements Comparator<MarvelCard> {
    public int compare(MarvelCard h1, MarvelCard h2) {
        if(h1.speed==h2.speed)
            return 0;
        else if(h1.speed>h2.speed)
            return -1;
        else
            return 1;
    }
}
