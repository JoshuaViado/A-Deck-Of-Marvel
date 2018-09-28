import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class CardController {
    ArrayList<MarvelCard> marvelDeck;
    GUI view;
    int currentCard;

    CardController(ArrayList<MarvelCard> marvelDeck, GUI view, int currentCard) {
        this.marvelDeck = marvelDeck;
        this.view = view;
        this.currentCard = currentCard;

    }

    public String getCardTitle() {
        return marvelDeck.get(currentCard).title;
    }

    public int getCurrentCard() {
        return currentCard;
    }

    public void setCurrentCard(int currentCard) {
        this.currentCard = currentCard;
    }

    public void updateDisplayCard() {
        view.displayMarvelCard(getCardTitle().toLowerCase().replaceAll(" ", "-"));

        view.b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                setCurrentCard(0);
                view.displayMarvelCard(getCardTitle().toLowerCase().replaceAll(" ", "-"));

            }
        });

        view.b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (currentCard >= 1) {
                    setCurrentCard(currentCard - 1);
                    view.displayMarvelCard(getCardTitle().toLowerCase().replaceAll(" ", "-"));
                } else {
                    setCurrentCard(0);
                }
            }
        });

        view.b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (currentCard < 29) {
                    setCurrentCard(currentCard + 1);
                    view.displayMarvelCard(getCardTitle().toLowerCase().replaceAll(" ", "-"));
                } else {
                    setCurrentCard(29);
                    view.displayMarvelCard(getCardTitle().toLowerCase().replaceAll(" ", "-"));
                }
            }
        });

        view.b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setCurrentCard(29);
                view.displayMarvelCard(getCardTitle().toLowerCase().replaceAll(" ", "-"));
            }
        });

        view.cb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String sortSelected = view.cb.getItemAt(view.cb.getSelectedIndex()).toString();

                switch (sortSelected) {
                    case "Title":
                        Collections.sort(marvelDeck, new TitleComparator());
                        break;
                    case "Height":
                        Collections.sort(marvelDeck, new HeightComparator());
                        break;
                    case "Speed":
                        Collections.sort(marvelDeck, new SpeedComparator());
                        break;
                    case "Fighting Skills":
                        Collections.sort(marvelDeck, new FightingSkillsComparator());
                        break;
                }
                view.displayMarvelCard(getCardTitle().toLowerCase().replaceAll(" ", "-"));
            }
        });
    }

}
