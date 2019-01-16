package boletin18;

import javax.swing.JOptionPane;
import datosP.Persoal;
/**
 *
 * @author cromerofajar
 */
public class Academica {
    private static int numReferencia=2018;
    private String nome;
    private int nota;
    private Persoal per=new Persoal(); //importamos el paquete y luego lo creamos de esta manera.

    public Academica() {
        numReferencia=numReferencia+1;
    }

    public Academica(String nome, int nota, Persoal per) {
        this.nome = nome;
        this.nota = nota;
        numReferencia=numReferencia+1;
    }


    public int getTelefono(){
        return per.getTelefono();
    }
    
    public String getCorreo(){
        return per.getCorreo();
    }
    
    public String getNome() {
        return nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void setTelefono(int telefono){
        per.setTelefono(telefono);
    }
    
    public void setCorreo(String correo){
        per.setCorreo(correo);
    }
    @Override
    public String toString() {
        return "Datos academicos: " + "\nnumReferencia= " + numReferencia + "\nnome= " + nome + "\nnota= " + nota +"\n"+ per;
    }

}
