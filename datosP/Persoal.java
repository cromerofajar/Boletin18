package datosP;

/**
 *
 * @author cromerofajar
 */
public class Persoal {
    private int telefono;
    private String correo;

    public Persoal() {
    }

    public Persoal(int telefono, String correo) {
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Datos personales: " + "\ntelefono=" + telefono + "\ncorreo=" + correo;
    }

}
