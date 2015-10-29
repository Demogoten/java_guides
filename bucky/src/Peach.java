import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Peach extends JPanel{

    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        this.setBackground(Color.WHITE);

        graphics.setColor(Color.BLUE);
        graphics.drawLine(10,25,200,45);

        graphics.setColor(Color.RED);
        graphics.drawRect(10,55,100,30);

        graphics.setColor(Color.GREEN);
        graphics.fillOval(10,95,100,30);

        graphics.setColor(Color.ORANGE);
        graphics.fill3DRect(10,160,100,50,true);
    }


}
