package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pregunta4 extends JFrame implements ActionListener {
    private JButton boton2,boton5,boton7,boton8,boton9;

    public Pregunta4() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        setLayout(new GridLayout(4, 4, 10, 10));
        setSize(800, 400);

        JLabel bienvenida = new JLabel("Cuantas personas pueder ir en un turismo");
        boton2 = new JButton("1");
        boton5 = new JButton("2");
        boton7 = new JButton("Volver");
        boton8 = new JButton("5");
        boton9 = new JButton("Siguiente");

        add(new JLabel(""));
        add(bienvenida);
        add(new JLabel(""));
        add(new JLabel(""));
        add(boton2);
        add(new JLabel(""));
        add(new JLabel(""));
        add(boton5);
        add(new JLabel(""));
        add(boton7);
        add(boton8);
        add(boton9);
        boton2.addActionListener(this);
        boton5.addActionListener(this);
        boton7.addActionListener(this);
        boton8.addActionListener(this);
        boton9.addActionListener(this);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (boton2 == e.getSource()) {
            setVisible(false);
            new Pregunta5();
        }
        if (boton5 == e.getSource()) {
            setVisible(false);
            new Pregunta5();
        }
        if (boton7 == e.getSource()) {
            setVisible(false);
            new Pregunta3();
        }
        if (boton8 == e.getSource()) {
            setVisible(false);
            new Pregunta5();
        }
        if (boton9 == e.getSource()) {
            setVisible(false);
            new Pregunta5();
        }
        if (boton2 == e.getSource()) {
            System.out.println("Error");
        }
        if (boton5 == e.getSource()) {
            System.out.println("Error");
        }
        if (boton8 == e.getSource()) {
            System.out.println("Correcto");
        }
    }
}