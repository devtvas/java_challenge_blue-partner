package com.sistemabluepartner.view;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.event.*;
import java.text.ParseException;

public class User extends JFrame {
    // Variables declaration
    private JPanel panelMain;
    private JButton btnAceptar;
    private JButton btnSalir;
    private JLabel labelNroEmpleado;
    private JLabel labelApePat;
    private JLabel labelApeMat;
    private JLabel labelNombre;
    private JLabel labelDir;
    private JLabel labelTelf;
    private JLabel labelDni;
    private JTextField txtNroEmpleado;
    private JTextField txtApePat;
    private JTextField txtApeMat;
    private JTextField txtNombre;
    private JTextField txtDir;
    private JTextField txtTelf;
    private JTextField txtDni;

    public User() {
        txtNroEmpleado.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();  // if it's not a number, ignore the event
                }
            }
        });

        txtApePat.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if ( !((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();  // if it's not a number, ignore the event
                }
            }
        });

        txtApeMat.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if ( !((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();  // if it's not a number, ignore the event
                }
            }
        });

        txtNombre.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if ( !((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();  // if it's not a number, ignore the event
                }
            }
        });

        txtTelf.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();  // if it's not a number, ignore the event
                }
            }
        });
        MaskFormatter mascaraCampo = null;
        try {
            mascaraCampo = new MaskFormatter("#.###,##");
        } catch (ParseException e) {
        }
        txtTelf = new JFormattedTextField(mascaraCampo);

        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nroEmpleado = txtNroEmpleado.getText();
                String apelidoPat = txtApePat.getText();
                String apelidoMat = txtApeMat.getText();
                String nombre = txtNombre.getText();
                String dir = txtDir.getText();
                String telf = txtTelf.getText();
                String dni = txtDni.getText();

                JOptionPane.showMessageDialog(
                        null,
                        nroEmpleado
                                + apelidoPat
                                + apelidoMat
                                + nombre
                                + dir
                                + telf
                                + dni);
            }
        });

    }

    public static void main(String[] args) {
        User user = new User();

        user.setContentPane(new User().panelMain);
        user.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        user.setVisible(true);
        user.pack();
    }
}
