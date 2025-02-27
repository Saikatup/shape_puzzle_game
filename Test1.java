import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Test1 extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    private BufferedImage image;
    private JButton triangleButton, rectangleButton, squareButton, parallelogramButton, rhombusButton, trapeziumButton, circleButton;
    private JLabel messageLabel;

    public Test1() {
        super("Geometric Objects as Buttons");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(995, 705);
        setLocationRelativeTo(null);

        try {
            image = ImageIO.read(new File("mehedi.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        JPanel panel = new JPanel() {
            private static final long serialVersionUID = 1L;
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, null);
            }
        };

        panel.setLayout(null);

        triangleButton = new JButton();
        triangleButton.setBounds(315, 95, 60, 80);
        triangleButton.addActionListener(this);
        panel.add(triangleButton);

        rectangleButton = new JButton();
        rectangleButton.setBounds(700, 40, 215, 110);
        rectangleButton.addActionListener(this);
        panel.add(rectangleButton);

        squareButton = new JButton();
        squareButton.setBounds(85, 450, 140, 140);
        squareButton.addActionListener(this);
        panel.add(squareButton);

        parallelogramButton = new JButton();
        parallelogramButton.setBounds(305, 565, 150,100);
        parallelogramButton.addActionListener(this);
        panel.add(parallelogramButton);

        rhombusButton = new JButton();
        rhombusButton.setBounds(815, 260, 65, 120);
        rhombusButton.addActionListener(this);
        panel.add(rhombusButton);

        trapeziumButton = new JButton();
        trapeziumButton.setBounds(350, 245, 150, 100);
        trapeziumButton.addActionListener(this);
        panel.add(trapeziumButton);

        circleButton = new JButton();
        circleButton.setBounds(95, 65, 105, 80);
        circleButton.addActionListener(this);
        panel.add(circleButton);

        messageLabel = new JLabel("Choose a shape");
        messageLabel.setBounds(10, 10, 100, 20);
        panel.add(messageLabel);

        setContentPane(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Test1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == triangleButton) {
            messageLabel.setText("Triangle");
        } else if (e.getSource() == rectangleButton) {
            messageLabel.setText("Rectangle");
        } else if (e.getSource() == squareButton) {
            messageLabel.setText("Square");
        } else if (e.getSource() == parallelogramButton) {
            messageLabel.setText("Parallelogram");
        } else if (e.getSource() == rhombusButton) {
            messageLabel.setText("Rhombus");
        } else if (e.getSource() == trapeziumButton) {
            messageLabel.setText("Trapezium");
        } else if (e.getSource() == circleButton) {
            messageLabel.setText("Circle");
        }
    }
}
