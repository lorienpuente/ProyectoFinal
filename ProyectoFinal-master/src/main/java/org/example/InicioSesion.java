package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InicioSesion extends JFrame implements ActionListener {
    private JButton boton;

    public InicioSesion() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        setLayout(new GridLayout(3, 2, 10, 10));
        setSize(400, 200);

        JLabel nombre = new JLabel("Nombre");
        JTextField nombreT = new JTextField();
        JLabel pasword = new JLabel("Contraseña");
        JTextField paswordT = new JTextField();


        boton = new JButton("Enviar");

        add(nombre);
        add(nombreT);
        add(pasword);
        add(paswordT);
        add(new JLabel(""));
        add(boton);
        boton.addActionListener(this);


        setVisible(true);


    }

    public void actionPerformed(ActionEvent e) {
        if (boton == e.getSource()) {
            setVisible(false);
            new Menu();


        }
    }
}


