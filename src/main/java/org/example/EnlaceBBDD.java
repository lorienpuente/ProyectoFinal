package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class EnlaceBBDD {
    public static void main(String[] args) {


        JFrame frame = new JFrame("Envio");

        frame.setLayout(new GridLayout(3,2,10,10));
        frame.setSize(400,200);

        JLabel nombre = new JLabel("Nombre");
        JTextField nombreT = new JTextField();
        JLabel pasword = new JLabel("Contraseña");
        JTextField paswordT= new JTextField();


        JButton boton = new JButton("Enviar");

        frame.add(nombre);
        frame.add(nombreT);
        frame.add(pasword);
        frame.add(paswordT);
        frame.add(new JLabel(""));
        frame.add(boton);
        frame.setVisible(true);

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                frame.setVisible(false);


                System.out.println("Enviado");

            }
        });

      try{

            Connection conexion = DriverManager.getConnection("jdbc:mysql://pruebas-programacion.cz0imuc6y3z1.us-east-1.rds.amazonaws.com/Proyecto", "admin", "kuskini_06");
            System.out.println("Conectado correctamente");
            String consulta = "select * from PERSONA";
            Statement statement = conexion.createStatement();
            ResultSet resultado = statement.executeQuery(consulta);

          while (resultado.next()) {
              String DNI = resultado.getString("DNI");
              String NOMBRE = resultado.getString("NOMBRE");
              String APELLIDOS = resultado.getString("APELLIDOS");

              System.out.println("DNI: " + DNI + " - Nombre: " + NOMBRE + " - Apellidos: " + APELLIDOS);

          }
          String consulta2 = "select DNI_INSTRUCTOR from AGENDA_INSTRUCTOR";
          Statement statement2 = conexion.createStatement();
          ResultSet resultado2 = statement.executeQuery(consulta2);
          while (resultado2.next()) {
              String DNI_INSTRUCTOR = resultado2.getString("DNI_INSTRUCTOR");

              System.out.println("DNI INSTRUCTOR: " + DNI_INSTRUCTOR);

          }
          String consulta3 = "select ERRORES_TOTALES, ACIERTOS from TEST_TEORICOS";
          Statement statement3 = conexion.createStatement();
          ResultSet resultado3 = statement.executeQuery(consulta3);
          while (resultado3.next()) {
              String ERRORES_TOTALES = resultado3.getString("ERRORES_TOTALES");
              String ACIERTOS = resultado3.getString("ACIERTOS");


              System.out.println("ERRORES TOTALES: " + ERRORES_TOTALES + ", ACIERTOS: " + ACIERTOS);

          }

        }catch (SQLException e){
            e.printStackTrace();
        }





    }
}

