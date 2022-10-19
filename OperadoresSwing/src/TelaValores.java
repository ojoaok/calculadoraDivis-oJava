import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaValores extends Container {
    private JPanel panel1;
    private JTextField txtNum;
    private JTextField txtDen;
    private JButton btnDividir;
    private JLabel lblDiv;
    private JLabel lblRest;

    public TelaValores() {
        btnDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = Integer.parseInt(txtNum.getText());
                int d = Integer.parseInt(txtDen.getText());
                float div = n / d;
                float res = n % d;
                lblDiv.setText(String.valueOf(div));
                lblRest.setText(String.valueOf(res));
            }
        });
    }

}
