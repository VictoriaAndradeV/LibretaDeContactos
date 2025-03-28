package ec.edu.ups.poo.clases;

//la clase persona contiene los atributos-informacion de la misma
public class Persona {
    //los atributos se escriben fuera de los metodos y dentro de la clase
    //deben tener un modificador de acceso,privado, por lo general va al inicio de la clase

    private String cedula; // cedula es de tipo texto porq algunas comienzan con 0
    private String nombre;
    private String apellido;
    private String direccion;

    //CONSTRUCTORES
    public Persona(String cedula){
        this.cedula = cedula;
    }
    public Persona(String nombre, String apellido){
        this.nombre =nombre;
    }
    //constructor que inicializa cada atributo
    public Persona(String cedula, String nombre, String apellido, String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public Persona(){ //constructor vacío

    }
    //GETTERS Y SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public String getApellido(){
        return apellido;
    }
    public void setCedula(String cedula){ //no importa nombre del parametro, solo el tipo
        this.cedula = cedula; //le asigno a cedula el parametro que recibo
    }
    public String getCedula(){ //metodo getter para mostrar valores
        return cedula;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public String getDireccion(){
        return direccion;
    }

    @Override
    public String toString(){ //metodo to string, metodo sobre escrito, para imprimir los datos ingresados
        return "Nombre: " +nombre +
                ", Apellido: " +apellido +
                ", Cédula: " +cedula+
                ", Direccion: " +direccion;
    }

}
