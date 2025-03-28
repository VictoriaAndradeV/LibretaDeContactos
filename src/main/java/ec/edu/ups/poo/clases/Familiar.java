package ec.edu.ups.poo.clases;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Familiar extends Persona { // tiene los mismos atributos que la clase persona
    private String parentesco;
    private String tipoDeSangre;
    private GregorianCalendar fechaDeNacimiento; //calendar es una clase para manejar fechas

    public Familiar(){

    }

    public Familiar(String cedula, String nombre, String apellido, String direccion, GregorianCalendar fechaDeNacimiento, String tipoDeSangre, String parentesco) {
        super(cedula, nombre, apellido, direccion); //para acceder a la clase padre, super tiene la misma funcion que this
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.tipoDeSangre = tipoDeSangre;
        this.parentesco = parentesco;
    }
    //getters y setters
    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getTipoDeSangre() {
        return tipoDeSangre;
    }

    public void setTipoDeSangre(String tipoDeSangre) {
        this.tipoDeSangre = tipoDeSangre;
    }

    public Calendar getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(GregorianCalendar fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    // calcular edad del familiar
    public int edad(){
        GregorianCalendar fechaActual = new GregorianCalendar(); // instanciamos un objeto llamado fechaActual
        int anioA = fechaActual.get(GregorianCalendar.YEAR);
        int mesA = fechaActual.get(GregorianCalendar.MONTH);
        int diaA = fechaActual.get(GregorianCalendar.DAY_OF_MONTH);

        int anioN = fechaDeNacimiento.get(GregorianCalendar.YEAR);
        int mesN = fechaDeNacimiento.get(GregorianCalendar.MONTH);
        int diaN = fechaDeNacimiento.get(GregorianCalendar.DAY_OF_MONTH);

        int edad = anioA - anioN;

        if (mesN > mesA || (mesN == mesA && diaN > diaA)) {
            edad--;
        }
        return edad;
    }

    public String toString(){
        return "Parentesco: " +parentesco+
                ", Tipo de sangre: " +tipoDeSangre +
                ", Edad: " +edad();
    }

}
