import javafx.scene.layout.Pane;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    JButton b1 = new JButton("<");
    JButton b2 = new JButton("<<");
    String sortOption[] = {"Title", "Height", "Speed", "Fighting Skills"};
    JComboBox cb = new JComboBox(sortOption);
    JButton b3 = new JButton(">>");
    JButton b4 = new JButton(">");
    ImageIcon icon;
    JLabel imgCard = new JLabel(icon);
    JLabel marvelLogo = new JLabel(new ImageIcon(this.getClass().getResource("resource/marvel-icon.jpg")));
    Panel allUI = new Panel();


    GUI() {
        Panel uiElements = new Panel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(450, 700);
        setResizable(false);
        getContentPane().setBackground(Color.red.darker());

        uiElements.add(b1);
        uiElements.add(b2);
        uiElements.add(cb);
        uiElements.add(b3);
        uiElements.add(b4);

        uiElements.setLayout(new BoxLayout(uiElements, BoxLayout.X_AXIS));
        allUI.add(uiElements);
        allUI.add(imgCard, BorderLayout.CENTER);
        allUI.add(marvelLogo, BorderLayout.CENTER);

        add(allUI);
        setVisible(true);
    }


    public void displayMarvelCard(String heroName) {
        icon = new ImageIcon(this.getClass().getResource("resource/" + heroName + ".jpg"));
        imgCard.setIcon(icon);
    }

}
