import java.awt.*;
import java.awt.event.*;
import java.awt.peer.MouseInfoPeer;
import javax.swing.*;
import javax.swing.event.*;

public class Gui extends JFrame{
    private String details;
    private JLabel statusbar;

    public Gui(){
        super("Title");

        statusbar = new JLabel("This is default");
        add(statusbar, BorderLayout.SOUTH);
        addMouseListener(new Mouseclass());

    }

    private class Mouseclass extends MouseAdapter{
        public void mouseClicked(MouseEvent event){
            details = String.format("You clicked %d ", event.getClickCount());

            if (event.isMetaDown())
                details += "with right mouse button";
            else if(event.isAltDown())
                details += "either center mouse button";
            else details += "with left mouse button";

            statusbar.setText(details);
        }
    }
}