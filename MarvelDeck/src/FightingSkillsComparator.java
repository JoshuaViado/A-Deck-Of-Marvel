import java.util.Comparator;

public class FightingSkillsComparator implements Comparator<MarvelCard> {
    public int compare(MarvelCard h1, MarvelCard h2) {
        if(h1.fightingSkills==h2.fightingSkills)
            return 0;
        else if(h1.fightingSkills>h2.fightingSkills)
            return -1;
        else
            return 1;
    }
}
