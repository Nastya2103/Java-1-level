package HomeWork8.Calculator.Components;

import javax.swing.*;
import java.awt.*;

public class DigitJButton extends JButton {
    public DigitJButton(String text) {
        super(text);
        setFont(new Font("Arial", Font.PLAIN, 20));
        setBackground(new Color(52, 98, 188));
    }
}