/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eca.acounting.login;

import javax.swing.JButton;

/**
 *
 * @author Zenbook Duo
 */
public class MyButton extends JButton {
    private int id;

    public MyButton(int id, String label) {
        super(label);
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
