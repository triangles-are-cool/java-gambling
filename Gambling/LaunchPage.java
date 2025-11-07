import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;


public class LaunchPage implements ActionListener {

        JFrame frame = new JFrame();
        JButton gamblingButton = new JButton();
        JComponent gamblingDisplay = new JComponent() {
            @Override
            protected void paintComponent(java.awt.Graphics g) {
                super.paintComponent(g);
                int Number1 = (int)(Math.random() * 10); 
                int Number2 = (int)(Math.random() * 10); 
                int Number3 = (int)(Math.random() * 10); // 0 to 9

                String gambleOutput = "|" + Number1 + "|" + Number2 + "|" + Number3 + "|";
                
                
                g.setFont(new Font("Arial", Font.BOLD, 24)); // Changed font
                FontMetrics metrics = g.getFontMetrics();
                int textWidth = metrics.stringWidth(gambleOutput);
                int textHeight = metrics.getHeight();

                // Calculate x and y to center the text
                int x = (frame.getWidth() / 2) - textWidth;
                int y = (frame.getHeight() / 2) / - textWidth + metrics.getAscent();
                
                
                g.setColor(Color.BLACK); // Set text color
                g.drawString(gambleOutput, x, y);

            }
        
        };

        LaunchPage(){

            gamblingDisplay.setBounds(100,160,300,150);
        
            //gamblingDisplay.setText("gambleOutput");
            
            gamblingButton.setBounds(100,260,200,40);
            gamblingButton.setFocusable(false);
            gamblingButton.addActionListener(this);
            gamblingButton.setText("GAMBLE");
            


            //sets up the window
            
            frame.setBackground(Color.gray);
            frame.add(gamblingDisplay);
            frame.add(gamblingButton);
            gamblingButton.setVisible(true);
            gamblingDisplay.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(420,420);
            frame.setLayout(null);
            frame.setVisible(true);

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == gamblingButton) {
                gamblingDisplay.repaint(); // Triggers the gambling display to update
            }
        }
        
         


}
