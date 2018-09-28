import javax.smartcardio.Card;
import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {

        ArrayList<MarvelCard> MarvelCardDeck = marvelDeck1();

        GUI gui = new GUI();
        CardController cardController = new CardController(MarvelCardDeck, gui, 0);
        cardController.updateDisplayCard();

    }

    private static ArrayList marvelDeck1() {

        ArrayList<MarvelCard> MarvelCardDeck = new ArrayList<MarvelCard>();

        MarvelCard s1 = new MarvelCard("Apocalypse", 0, 16, 80);
        MarvelCard s2 = new MarvelCard("Black Panther", 180, 7, 79);
        MarvelCard s3 = new MarvelCard("Black Widow", 168, 4, 81);
        MarvelCard s4 = new MarvelCard("Blade", 185, 5, 85);
        MarvelCard s5 = new MarvelCard("Captain America", 186,6, 86);
        MarvelCard s6 = new MarvelCard("Dr Doom", 186, 4, 70);
        MarvelCard s7 = new MarvelCard("Dr Octopus",  173, 2, 65);
        MarvelCard s8 = new MarvelCard("Dr Strange", 184, 4, 85);
        MarvelCard s9 = new MarvelCard("Elektra",  173, 6, 80);
        MarvelCard s10 = new MarvelCard("Ghost Rider", 181, 8, 66);
        MarvelCard s11 = new MarvelCard("Green Goblin", 178, 10, 55);
        MarvelCard s12 = new MarvelCard("Hawkeye", 188, 4, 80);
        MarvelCard s13 = new MarvelCard("Iceman", 170, 4, 70);
        MarvelCard s14 = new MarvelCard("Invisible Woman", 165, 2, 70);
        MarvelCard s15 = new MarvelCard("Iron Man", 183, 2, 85);
        MarvelCard s16 = new MarvelCard("Juggernaut", 205, 2, 63);
        MarvelCard s17 = new MarvelCard("Kingpin", 198, 4,75);
        MarvelCard s18 = new MarvelCard("Magneto", 185, 2, 81);
        MarvelCard s19 = new MarvelCard("Mr Fantastic", 183, 2,65);
        MarvelCard s20 = new MarvelCard("Mysterio",  178, 3,70);
        MarvelCard s21 = new MarvelCard("Nick Fury", 183, 4,86);
        MarvelCard s22 = new MarvelCard("Professor X", 180, 1, 64);
        MarvelCard s23 = new MarvelCard("Silver Surfer", 190, 13, 72);
        MarvelCard s24 = new MarvelCard("Spiderman", 175, 11, 66);
        MarvelCard s25 = new MarvelCard("Storm", 178, 12, 69);
        MarvelCard s26 = new MarvelCard("The Beast", 177,  10, 72);
        MarvelCard s27 = new MarvelCard("The Human Torch", 175, 5, 71);
        MarvelCard s28 = new MarvelCard("The Thing", 180, 8, 85);
        MarvelCard s29 = new MarvelCard("Thor",  195, 9, 85);
        MarvelCard s30 = new MarvelCard("Venom", 188, 10, 64);

        MarvelCardDeck.add(s1); MarvelCardDeck.add(s2); MarvelCardDeck.add(s3); MarvelCardDeck.add(s4); MarvelCardDeck.add(s5);
        MarvelCardDeck.add(s6); MarvelCardDeck.add(s7); MarvelCardDeck.add(s8); MarvelCardDeck.add(s9); MarvelCardDeck.add(s10);
        MarvelCardDeck.add(s11); MarvelCardDeck.add(s12); MarvelCardDeck.add(s13); MarvelCardDeck.add(s14); MarvelCardDeck.add(s15);
        MarvelCardDeck.add(s16); MarvelCardDeck.add(s17); MarvelCardDeck.add(s18); MarvelCardDeck.add(s19); MarvelCardDeck.add(s20);
        MarvelCardDeck.add(s21); MarvelCardDeck.add(s22); MarvelCardDeck.add(s23); MarvelCardDeck.add(s24); MarvelCardDeck.add(s25);
        MarvelCardDeck.add(s26); MarvelCardDeck.add(s27); MarvelCardDeck.add(s28); MarvelCardDeck.add(s29); MarvelCardDeck.add(s30);

        return MarvelCardDeck;

    }

}
