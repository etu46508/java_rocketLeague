package View.Utility;

import java.awt.*;
import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainWindow extends JFrame{
    private Container mainContainer;
    private ImageIcon icon;

    public MainWindow (){
        super("Rocket League Esport");
        setBounds(50,50,800,700);
        addWindowListener (new WindowAdapter() {
            public void windowClosing (WindowEvent e) {
                System.exit(0);
            }
        } );

        icon = new ImageIcon("C:\\Users\\merlin\\Desktop\\iesn\\bloc 2\\java\\projetV2\\projetV0\\Images\\balleRocketLeague.png");

        mainContainer = this.getContentPane();
        JLabel iconLabel = new JLabel();
        iconLabel.setIcon(icon);
        iconLabel.setBounds(50,500,20,20);
        mainContainer.add(iconLabel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public void turnIcon (){

    }
}
