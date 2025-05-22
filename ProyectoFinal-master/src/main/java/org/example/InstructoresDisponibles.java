package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InstructoresDisponibles extends JFrame implements ActionListener {

    private JButton boton;
    private JLabel profe, profe2, profe3, profe4, profe5, profe6, profe7, profe8, profe9, profe10;
    public InstructoresDisponibles() {

        setTitle("");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();


        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel2.setLayout(new BoxLayout(panel2,BoxLayout.X_AXIS));
        panel3.setLayout(new BoxLayout(panel3,BoxLayout.Y_AXIS));

        JLabel profe = new JLabel("JUAN EL VIERNES 23 DE MAYO A LAS 16:00");
        profe.setAlignmentX(CENTER_ALIGNMENT);
        JLabel profe2 = new JLabel("DAVID EL VIERNES 23 DE MAYO A LAS 15:40");
        profe2.setAlignmentX(CENTER_ALIGNMENT);
        JLabel profe3 = new JLabel("MARTA EL VIERNES 23 DE MAYO A LAS 19:20");
        profe3.setAlignmentX(CENTER_ALIGNMENT);
        JLabel profe4 = new JLabel("DANI EL LUNES 26 DE MAYO A LAS 15:20");
        profe4.setAlignmentX(CENTER_ALIGNMENT);
        JLabel profe5 = new JLabel("DAVID EL LUNES 26 DE MAYO A LAS 18:20");
        profe5.setAlignmentX(CENTER_ALIGNMENT);
        JLabel profe6 = new JLabel("JUAN EL MARTES 27 DE MAYO A LAS 17:30");
        profe6.setAlignmentX(CENTER_ALIGNMENT);
        JLabel profe7 = new JLabel("MARIA EL MIERCOLES 28 DE MAYO A LAS 16:40");
        profe7.setAlignmentX(CENTER_ALIGNMENT);
        JLabel profe8 = new JLabel("MARIA EL MIERCOLES 28 DE MAYO A LAS 19:50");
        profe8.setAlignmentX(CENTER_ALIGNMENT);
        JLabel profe9 = new JLabel("DANI EL JUEVES 29 DE MAYO A LAS 15:40");
        profe9.setAlignmentX(CENTER_ALIGNMENT);
        JLabel profe10 = new JLabel("MARTA EL VIERNES 30 DE MAYO A LAS 19:10");
        profe10.setAlignmentX(CENTER_ALIGNMENT);

        boton = new JButton("Volver");
        boton.addActionListener(this);

        panel.add(profe);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(profe2);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(profe3);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(profe4);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(profe5);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(profe6);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(profe7);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(profe8);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(profe9);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(profe10);

        panel2.add(Box.createRigidArea(new Dimension(400,180)));
        panel2.add(boton);

        panel3.add(panel);
        panel3.add(panel2);
        add(panel3);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (boton == e.getSource()) {
            setVisible(false);
            new Menu();
        }
    }
}
