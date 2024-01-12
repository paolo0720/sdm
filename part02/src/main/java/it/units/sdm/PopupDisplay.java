package it.units.sdm;

import javax.swing.JOptionPane;

class PopupDisplay implements Display {
    @Override
    public void display(String text) {
        JOptionPane.showMessageDialog(null, text);
    }
}