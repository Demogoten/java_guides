import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Peach extends JPanel{

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        this.setBackground(Color.WHITE);

        graphics.setColor(Color.BLUE);
        graphics.fillRect(25, 25, 100, 30);

        graphics.setColor(new Color(190,81,215));   // red green blue
        graphics.fillRect(25,65,100,30);

        graphics.setColor(Color.RED);
        graphics.drawString("This is some text",25,120);
    }



}
