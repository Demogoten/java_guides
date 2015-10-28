import java.awt.*;
import java.awt.event.*;
import java.awt.peer.MouseInfoPeer;
import javax.swing.*;
import javax.swing.event.*;

public class Gui extends JFrame{
    private JPanel mousepanel;
    private JLabel statusbar;

    public Gui(){
        super("title");

        mousepanel = new JPanel();
        mousepanel.setBackground(Color.WHITE);
        add(mousepanel, BorderLayout.CENTER);

        statusbar = new JLabel("default");
        add(statusbar, BorderLayout.SOUTH);

        HandlerClass handler = new HandlerClass();
        mousepanel.addMouseListener(handler);
        mousepanel.addMouseMotionListener(handler);
    }

    private class HandlerClass implements MouseListener,MouseMotionListener{

        public void mouseClicked(MouseEvent event){
        statusbar.setText(String.format("Clicked at %d,%d", event.getX(),event.getY()));
        }
        public void mousePressed(MouseEvent event){
            statusbar.setText("you pressed down the mouse");
        }
        public void mouseReleased(MouseEvent event){
            statusbar.setText("you released the button");
        }
        public void mouseEntered(MouseEvent event){
            statusbar.setText("you entered the area");
            mousepanel.setBackground(Color.RED);
        }
        public void mouseExited(MouseEvent event){
            statusbar.setText("The mouse has left the window");
            mousepanel.setBackground(Color.WHITE);
        }
        //these are mouse motion events


        @Override
        public void mouseDragged(MouseEvent event) {
            statusbar.setText("you are dragging the mouse");
        }
        public void mouseMoved(MouseEvent event) {
            statusbar.setText("you moved the mouse");
        }

    }
}