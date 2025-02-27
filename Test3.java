import java.awt.*;
import java.awt.event.*;
//import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Test3 extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    private BufferedImage image;
    private JButton triangleButton, rectangleButton, squareButton, parallelogramButton, rhombusButton, trapeziumButton, circleButton;
    private JLabel messageLabel, resultLabel;

    public Test3() {
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
        triangleButton.setBounds(350, 125, 50, 50);
        triangleButton.addActionListener(this);
        panel.add(triangleButton);

        rectangleButton = new JButton();
        rectangleButton.setBounds(795, 100, 50, 50);
        rectangleButton.addActionListener(this);
        panel.add(rectangleButton);

        squareButton = new JButton();
        squareButton.setBounds(150, 525, 50, 50);
        squareButton.addActionListener(this);
        panel.add(squareButton);

        parallelogramButton = new JButton();
        parallelogramButton.setBounds(375, 615, 50, 50);
        parallelogramButton.addActionListener(this);
        panel.add(parallelogramButton);

        rhombusButton = new JButton();
        rhombusButton.setBounds(845, 315, 50, 50);
        rhombusButton.addActionListener(this);
        panel.add(rhombusButton);

        trapeziumButton = new JButton();
        trapeziumButton.setBounds(420, 290, 50, 50);
        trapeziumButton.addActionListener(this);
        panel.add(trapeziumButton);

        circleButton = new JButton();
        circleButton.setBounds(145, 100, 50, 50);
        circleButton.addActionListener(this);
        panel.add(circleButton);

        String[] messages = {"Choose a rectangle", "Choose a triangle", "Choose a circle", "Choose a rhombus", "Choose a trapezium", "Choose a square"};
        int index = (int) (Math.random() * messages.length);
        messageLabel = new JLabel(messages[index]);
        messageLabel.setBounds(10, 10, 400, 20);
        panel.add(messageLabel);

        resultLabel = new JLabel("");
        resultLabel.setBounds(10, 40, 200, 20);
        panel.add(resultLabel);

        setContentPane(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Test3();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == triangleButton) {
            if (messageLabel.getText().equals("Choose a triangle")) {
                resultLabel.setText("Congratulations!");
            } else {
                resultLabel.setText("Failure!");
            }
        } else if (e.getSource() == rectangleButton) {
            if (messageLabel.getText().equals("Choose a rectangle")) {
                resultLabel.setText("Congratulations!");
            } else {
                resultLabel.setText("Failure!");
            }
        } else if (e.getSource() == squareButton) {
            if (messageLabel.getText().equals("Choose a square")) {
                resultLabel.setText("Congratulations!");
            } else {
                resultLabel.setText("Failure!");
            }
        } else if (e.getSource() == parallelogramButton) {
            if (messageLabel.getText().equals("Choose a parallelogram")) {
                resultLabel.setText("Congratulations!");
            } else {
                resultLabel.setText("Failure!");
            }
        } else if (e.getSource() == rhombusButton) {
            if (messageLabel.getText().equals("Choose a rhombus")) {
                resultLabel.setText("Congratulations!");
            } else {
                resultLabel.setText("Failure!");
            }
        } else if (e.getSource() == trapeziumButton) {
            if (messageLabel.getText().equals("Choose a trapezium")) {
                resultLabel.setText("Congratulations!");
            } else {
                resultLabel.setText("Failure!");
            }
        } else if (e.getSource() == circleButton) {
            if (messageLabel.getText().equals("Choose a circle")) {
                resultLabel.setText("Congratulations!");
            }
        }
    }
}
