package br.com.cod3r.calc.visao;

import javax.swing.*;

public class Display extends JPanel {

    private final JLabel label;

    public Display() {
        label = new JLabel("1234,56");
        add(label);
    }
}
