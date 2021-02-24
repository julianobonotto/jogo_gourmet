package ui;

import javax.swing.*;

public class PopUpConfirmBtnSimNao {
    private JFrame jFrame;

    public Integer showPopUp(String title, String message) {
        jFrame = new JFrame();
        Object[] options = { "Sim", "Não" };
        return JOptionPane.showOptionDialog(null, message, title, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
    }
}
