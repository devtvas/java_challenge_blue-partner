package com.sistemabluepartner;

import com.sistemabluepartner.view.User;

import javax.swing.*;

public class Principal
{

    public static void main(String[] args) {
        User user = new User();
        user.setContentPane(new User());
        user.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        user.setVisible(true);
        user.pack();
    }
}
