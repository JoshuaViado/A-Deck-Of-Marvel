import java.util.Comparator;

public class HeightComparator implements Comparator<MarvelCard> {
    public int compare(MarvelCard h1, MarvelCard h2) {
        if(h1.height==h2.height)
            return 0;
        else if(h1.height>h2.height)
            return -1;
        else
            return 1;
    }
}
