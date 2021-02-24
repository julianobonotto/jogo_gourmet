package ui;

import javax.swing.*;

public class PopUpConfirmBtnOK {
    private JFrame jFrame;

    public void showPopUp(String message) {
     jFrame = new JFrame();
     JOptionPane.showMessageDialog(jFrame, message);
    }
}
