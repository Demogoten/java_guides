import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Layout extends JFrame {

    private JButton lb;
    private JButton cb;
    private JButton rb;
    private FlowLayout layout;
    private Container container;


    public Layout(){
        super("the title");
        layout = new FlowLayout();
        container = getContentPane(); // ????
        setLayout(layout);

        //left stuff in here
        lb = new JButton("Left");
        add(lb);
        lb.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        layout.setAlignment(FlowLayout.LEFT);
                        layout.layoutContainer(container);
                    }
                }
        );
//center stuff in here
        cb = new JButton("Center");
        add(cb);
        cb.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        layout.setAlignment(FlowLayout.CENTER);
                        layout.layoutContainer(container);
                    }
                }
        );
        //right stuff in here
        rb = new JButton("Right");
        add(rb);
        rb.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        layout.setAlignment(FlowLayout.RIGHT);
                        layout.layoutContainer(container);
                    }
                }
        );
    }


}
