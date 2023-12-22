import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Traffic extends JFrame implements ActionListener
{
    JRadioButton r, y, g;
    Color c_red, c_yellow, c_green;

    public Traffic()
    {
        setSize(600, 600);
        setLayout(new FlowLayout());

        r = new JRadioButton("RED");
        y = new JRadioButton("YELLOW");
        g = new JRadioButton("GREEN");

        r.setSelected(true);

        add(r);
        add(y);
        add(g);

        ButtonGroup g1 = new ButtonGroup();
        g1.add(r);
        g1.add(y);
        g1.add(g);

        r.addActionListener(this);
        g.addActionListener(this);
        y.addActionListener(this);

        c_red = getBackground();
        c_yellow = getBackground();
        c_green = getBackground();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) 
    {
        if (r.isSelected())
        {
            c_red = Color.red;
            c_yellow = getBackground();
            c_green = getBackground();
        }
        else if (y.isSelected())
        {
            c_red = getBackground();
            c_yellow = Color.yellow;
            c_green = getBackground();
        }
        else if (g.isSelected())
        {
            c_red = getBackground();
            c_yellow = getBackground();
            c_green = Color.green;
        }
        repaint();
    }

    public void paint(Graphics gr)
    {
        super.paint(gr);

        gr.drawOval(250, 100, 50, 50);
        gr.drawOval(250, 200, 50, 50);
        gr.drawOval(250, 300, 50, 50);

        gr.setColor(c_red);
        gr.fillOval(250, 100, 50, 50);

        gr.setColor(c_yellow);
        gr.fillOval(250, 200, 50, 50);

        gr.setColor(c_green);
        gr.fillOval(250, 300, 50, 50);
    }

    public static void main(String[] args)
    {
        new Traffic();
    }
}
