package boletin18;

import javax.swing.JOptionPane;

/**
 *
 * @author cromerofajar
 */
public class Boletin18 {

    public static void main(String[] args) {
        Academica obxA=new Academica();
        int nota;
        nota=Integer.parseInt(JOptionPane.showInputDialog(null,"introduzca nota"));
        while (nota>10||nota<1){
            nota=Integer.parseInt(JOptionPane.showInputDialog("Porfavor inserte una nota valida"));
        }
        obxA.setNota(nota);
        obxA.setTelefono(Integer.parseInt(JOptionPane.showInputDialog(null,"introduzca numero de telefono")));
        obxA.setCorreo(JOptionPane.showInputDialog(null,"introduzca correo electronico"));
        obxA.setNome(JOptionPane.showInputDialog(null,"introduzca nombre"));
        JOptionPane.showMessageDialog(null, obxA.toString());
    }
    
}
