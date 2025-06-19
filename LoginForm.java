import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm {
    private JButton botonSesion;
    private JTextField userText;
    private JPasswordField passwordField1;
    private JPanel panel1;

    public LoginForm() {
        botonSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String usertext = userText.getText();
                String password = new String(passwordField1.getPassword());

                if (usertext.equals("admin")&& password.equals("1234")){
                    JOptionPane.showMessageDialog(null, "Login exitoso!!");
                }else{
                    JOptionPane.showMessageDialog(null,"Usuario o contraseña incorrecto","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
    public static void main(String[] args){
        JFrame frame = new JFrame("LoginForm");
        frame.setContentPane(new LoginForm().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
