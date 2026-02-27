package br.com.cod3r.calc.visao;

import javax.swing.*;
import java.awt.*;

public class Teclado extends JPanel {

    private final Color COR_CINZA_ESCURO = new Color(68, 68, 68);
    private final Color COR_CINZA_CLARO = new Color(99, 99, 99);
    private final Color COR_LARANJA = new Color(242, 163, 60);

    public Teclado() {

        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();

        setLayout(layout);

        add(new Botao("AC", COR_CINZA_ESCURO), c);
        add(new Botao("+/-", COR_CINZA_ESCURO), c);
        add(new Botao("%", COR_CINZA_ESCURO), c);
        add(new Botao("/", COR_LARANJA), c);

        add(new Botao("7", COR_CINZA_CLARO), c);
        add(new Botao("8", COR_CINZA_CLARO), c);
        add(new Botao("9", COR_CINZA_CLARO), c);
        add(new Botao("*", COR_LARANJA), c);

        add(new Botao("7", COR_CINZA_CLARO), c);
        add(new Botao("8", COR_CINZA_CLARO), c);
        add(new Botao("9", COR_CINZA_CLARO), c);
        add(new Botao("*", COR_LARANJA), c);

        add(new Botao("7", COR_CINZA_CLARO), c);
        add(new Botao("8", COR_CINZA_CLARO), c);
        add(new Botao("9", COR_CINZA_CLARO), c);
        add(new Botao("*", COR_LARANJA), c);

        add(new Botao("7", COR_CINZA_CLARO), c);
        add(new Botao("8", COR_CINZA_CLARO), c);
        add(new Botao("9", COR_CINZA_CLARO), c);
        add(new Botao("*", COR_LARANJA), c);
    }
}
