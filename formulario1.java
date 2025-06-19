import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formulario1 extends JFrame {
    private JPanel Principal;
    private JTextField textField1;
    private JButton activarButton;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JButton mostrarButton;
    private JLabel resultado;

    private void mostrarDatos(){
        String n= textField1.getText();
        String n2=textField2.getText();
        String n3= textField3.getText();
        String n4=textField4.getText();
        String n5=textField5.getText();
        String n6=textField6.getText();

        String texto="<html>Nombre: "+n+"<br>Apellido: "+n2+"<br>Direccion: "+n3+"<br>Edad: "+n4+"<br>Telefono: "+n5+"<br>Estatura: "+n6+"</html>";
        resultado.setText(texto);
    }
    public formulario1() {
        setTitle("Formulario");
        setSize(600,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Para que aparezca los botones
        setContentPane(Principal); //Llama al contenedor
        setVisible(true); //Importante para que se visualice


        activarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarDatos();

            }
        });
        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n= textField1.getText();
                String n2=textField2.getText();
                String n3= textField3.getText();
                String n4=textField4.getText();
                String n5=textField5.getText();
                String n6=textField6.getText();
                JOptionPane.showMessageDialog(null,"Nombre: "+n+"\nApellido:"+n2+"\nDireccion: "+n3+"\nTelefono: "+n4+"\nAño de nacimiento: "+n5+"\nEstatura:"+n6);
            }
        });
    }
}
