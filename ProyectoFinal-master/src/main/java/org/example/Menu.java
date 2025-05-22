package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {
    private JButton boton,boton2,boton3,boton4,boton6;

    public Menu() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        setLayout(new GridLayout(3, 3, 10, 10));
        setSize(600, 400);

        JLabel bienvenida = new JLabel("Bienvenidos a la autoescuela");
        boton = new JButton("Ver horas disponibles");
        boton2 = new JButton("Reservar clase práctica");
        boton3 = new JButton("Instructores disponibles");
        boton4 = new JButton("Test teóricos");

        boton6 = new JButton("Volver");

        add(new JLabel(""));
        add(bienvenida);
        add(new JLabel(""));
        add(boton);
        add(boton2);
        add(boton3);
        add(boton4);
        add(new JLabel(""));
        add(boton6);
        boton.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);
        boton4.addActionListener(this);
        boton6.addActionListener(this);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (boton6 == e.getSource()) {
            setVisible(false);
            new InicioSesion();
        }
        if (boton == e.getSource()) {
            setVisible(false);
            new HorasDisponibles();
        }
        if (boton2 == e.getSource()) {
            setVisible(false);
            new ReservarClase();
        }
        if (boton3 == e.getSource()) {
            setVisible(false);
            new InstructoresDisponibles();
        }
        if (boton4 == e.getSource()) {
            setVisible(false);
            new TestTeoricos();
        }
    }
}


