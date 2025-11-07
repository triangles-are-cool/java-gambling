import java.awt.Font;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GamblingWindow {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("gambling?");

    GamblingWindow(){

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            label.setBounds(0,0,100,50);
            label.setFont(new Font(null, Font.PLAIN,25));  

            frame.add(label);
            frame.setSize(420,420);
            frame.setLayout(null);
            frame.setVisible(true);

    }

}
