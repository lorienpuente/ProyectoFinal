package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReservarClase extends JFrame implements ActionListener {

    private JButton validar;
    private JButton boton2;
    public ReservarClase() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        setLayout(new GridLayout(3, 3, 0, 0));
        setSize(500, 200);

        JLabel horaRequerida = new JLabel("Elija el dia y hora para su clase práctica:");
        JTextField horaRequeridaT = new JTextField();
        JLabel espacio = new JLabel("     ");
        JLabel espacio2 = new JLabel("     ");

        validar = new JButton("Validar disponibilidad");
        boton2 = new JButton("Volver");
        add(horaRequerida);
        add(horaRequeridaT);
        add(espacio);
        add(espacio2);
        add(boton2);
        add(validar);
        boton2.addActionListener(this);
        validar.addActionListener(this);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        if (boton2 == e.getSource()) {
            setVisible(false);
            new Menu();
        }
        if (validar == e.getSource()){
            setVisible(false);
            JOptionPane.showMessageDialog(null, "¡Hora reservada!");
            new Menu();
        }
    }
}
