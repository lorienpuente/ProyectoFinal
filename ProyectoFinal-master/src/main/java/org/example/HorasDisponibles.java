package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HorasDisponibles extends JFrame implements ActionListener {

    private JButton boton;
    private JLabel hora, hora2, hora3, hora4, hora5, hora6, hora7, hora8, hora9, hora10;
    public HorasDisponibles() {

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

        JLabel hora = new JLabel("VIERNES 23 DE MAYO A LAS 16:00");
        hora.setAlignmentX(CENTER_ALIGNMENT);
        JLabel hora2 = new JLabel("VIERNES 23 DE MAYO A LAS 15:40");
        hora2.setAlignmentX(CENTER_ALIGNMENT);
        JLabel hora3 = new JLabel("VIERNES 23 DE MAYO A LAS 19:20");
        hora3.setAlignmentX(CENTER_ALIGNMENT);
        JLabel hora4 = new JLabel("LUNES 26 DE MAYO A LAS 15:20");
        hora4.setAlignmentX(CENTER_ALIGNMENT);
        JLabel hora5 = new JLabel("LUNES 26 DE MAYO A LAS 18:20");
        hora5.setAlignmentX(CENTER_ALIGNMENT);
        JLabel hora6 = new JLabel("MARTES 27 DE MAYO A LAS 17:30");
        hora6.setAlignmentX(CENTER_ALIGNMENT);
        JLabel hora7 = new JLabel("MIERCOLES 28 DE MAYO A LAS 16:40");
        hora7.setAlignmentX(CENTER_ALIGNMENT);
        JLabel hora8 = new JLabel("MIERCOLES 28 DE MAYO A LAS 19:50");
        hora8.setAlignmentX(CENTER_ALIGNMENT);
        JLabel hora9 = new JLabel("JUEVES 29 DE MAYO A LAS 15:40");
        hora9.setAlignmentX(CENTER_ALIGNMENT);
        JLabel hora10 = new JLabel("VIERNES 30 DE MAYO A LAS 19:10");
        hora10.setAlignmentX(CENTER_ALIGNMENT);

        boton = new JButton("Volver");
        boton.addActionListener(this);

        panel.add(hora);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(hora2);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(hora3);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(hora4);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(hora5);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(hora6);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(hora7);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(hora8);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(hora9);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(hora10);

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
