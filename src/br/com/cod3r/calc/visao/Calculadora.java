package br.com.cod3r.calc.visao;

import javax.swing.*;

public class Calculadora extends JFrame {

    public Calculadora() {

        setSize(232, 322);
        // o dispose fecha a janela atual
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {

        // aqui ele chama o construtor e inicia a nossa aplicação
        new Calculadora();
    }
}
