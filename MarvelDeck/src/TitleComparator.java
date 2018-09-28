import java.util.Comparator;

public class TitleComparator implements Comparator<MarvelCard> {

    public int compare(MarvelCard h1, MarvelCard h2) {
        return h1.title.compareTo(h2.title);
    }
}
