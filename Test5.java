import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.*;

public class Test5 extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private List<String> shapes = new ArrayList<>();
    private BufferedImage level1Image, level2Image;
    private JButton triangleButton, rectangleButton, squareButton, parallelogramButton, rhombusButton, trapeziumButton, circleButton, passButton;
    private JLabel messageLabel, resultLabel, scoreLabel, levelLabel;
    private int score, correctAnswers, wrongAnswers, level;

    public Test5() {
        super("Geometric Objects as Buttons");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(995, 705);
        setLocationRelativeTo(null);

        // Initialize the shapes list
        shapes.add("Choose a triangle");
        shapes.add("Choose a rectangle");
        shapes.add("Choose a circle");
        shapes.add("Choose a rhombus");
        shapes.add("Choose a trapezium");
        shapes.add("Choose a square");
        shapes.add("Choose a parallelogram");

        // Shuffle the shapes list
        Collections.shuffle(shapes);

        try {
            level1Image = ImageIO.read(new File("/image.png")); // level1.jpg add image
            level2Image = ImageIO.read(new File("/pyramid_water.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        JPanel panel = new JPanel() {
            private static final long serialVersionUID = 1L;

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (level == 1) {
                    g.drawImage(level1Image, 0, 0, null);
                } else if (level == 2) {
                    g.drawImage(level2Image, 0, 0, null);
                }
            }
        };

        panel.setLayout(null);

        triangleButton = new JButton("Triangle");
        // ... (Other shape buttons)
        passButton = new JButton("Pass");

        // ... (Button positions and sizes)

        messageLabel = new JLabel(shapes.get(0));
        // ... (Label positions and sizes)

        resultLabel = new JLabel("");
        // ... (Label positions and sizes)

        scoreLabel = new JLabel("Score: 0");
        // ... (Label positions and sizes)

        levelLabel = new JLabel("Level: 1");
        // ... (Label positions and sizes)

        panel.add(triangleButton);
        // ... (Add other buttons)

        panel.add(messageLabel);
        panel.add(resultLabel);
        panel.add(scoreLabel);
        panel.add(levelLabel);

        setContentPane(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Test5();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();

        if (clickedButton == passButton) {
            resultLabel.setText("You have passed this question.");
        } else {
            String expectedShape = messageLabel.getText().substring("Choose a ".length());

            if (clickedButton.getText().equalsIgnoreCase(expectedShape)) {
                resultLabel.setText("Congratulations! +10 points");
                score += 10;
                correctAnswers++;
            } else {
                resultLabel.setText("Failure! -10 points");
                score -= 10;
                wrongAnswers++;
            }

            if (correctAnswers + wrongAnswers == shapes.size()) {
                if (score >= 30 && level == 1) {
                    level++;
                    levelLabel.setText("Level: " + level);
                    resultLabel.setText("Congratulations! You've advanced to Level " + level);
                    // Load new shapes for the next level
                    Collections.shuffle(shapes);
                    messageLabel.setText(shap��k�t Zڑ�Z�(-U�$.U��^ӡ#O�߬w�p:3K�KBKF�q�J��<����5�]��#u�����������9�����(��n�N����be��&;%r	��&� N��C�l�۬7=�i�-�2ک$���eO�j�e *蓖86y%����1�x�)���J\2m�F�/!��4.V��h��p���������}���u���ʇ��fh�Y����
�cQ@�ש���1Z��������"����t���Z��I�u��͂����-z+��w��kQ���F棵�����֢U�P	�y+)�F�������*me��������������Zf`��V���Αhv4�stF�<�њ��_�(��Q�Z4&���N%�=`b/���L^�R������h.�xg�fU��[�ـ*���<f�/O15c".�Y{�b|����'

�٢�¨�� ���ͬ$��U�P7>j����qƈ�Ig��Z�>d��Z�Uh�f�H�TRQ����r��^�Ьf�G�b3��矐�u�9�=����(��47�J-@}!u1x����[��UX�;j���V!D��M���~>fpf��PxRAd�,�"0�8|V x��3�&�vắFm�����ގ�N�q�C8�:�$ ���jhT��RNT���rDh��G��d�1CA�aj��Sx�'<(�:��pQ���$��{k���]a�ʓFK��~�4!�̦p2���۠n�����d��@/[��L5�b�r�,�j��!&�:8-P���0�o6&d��w���lוd��šm