package ui;

import javax.swing.*;

public class PopUpConfirmInputBtnOkCancela {
    private JFrame jFrame;

    public String showPopUp(String title, String message) {
        jFrame = new JFrame();
        Object[] options = { "Ok", "Cancelar" };
        return JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
    }
}
