import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Akattack {
    public static void main(String[] args) {
        // Helper help = new Helper();

        new GUI();









        








    }
}

class GUI implements ActionListener {
    private int clicks = 0;
    private JLabel label = new JLabel("Number of clicks:  0     ");
    private JFrame frame = new JFrame();

    public GUI() {

        // the clickable button
        JButton button = new JButton("Click Me");
        button.addActionListener(this);
        button.setSize(100, 100);

        // the panel with the button and text
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        // set up the frame and display it
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Akattack!");
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("images/akapfp-70x70.png"));
    }

    // process the button clicks
    @Override
    public void actionPerformed(ActionEvent e) {
        clicks++;
        label.setText("Number of clicks:  " + clicks);
    }
}