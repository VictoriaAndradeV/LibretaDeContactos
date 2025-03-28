package ec.edu.ups.poo.principal;

import ec.edu.ups.poo.clases.Familiar; //importamos la clase Familiar, ya que está en otro paquete
import ec.edu.ups.poo.clases.Persona; //importamos la clase de forma global

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Principal {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        /*
        Familiar familiar = new Familiar();
        //establecemos los valores de los atributos de la clase padre
        familiar.setCedula("010234272869");
        familiar.setNombre("July");
        familiar.setApellido("Vintimilla");
        familiar.setDireccion("Lope de Vega");
        //establecemos los valores de los atributos de la clase hija
        familiar.setParentesco("Madre");
        familiar.setTipoDeSangre("ORH+");
        //instanciamos objeto de tipo GregorianCalendar
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(2004, 10, 13);
        familiar.setFechaDeNacimiento(gregorianCalendar);*/

        Persona personita = new Persona();

        System.out.println("Indica el número de personas por ingresar: ");
        int totalPersonas = scanner.nextInt();
        scanner.nextLine();

        Persona[] personas = new Persona[totalPersonas]; // arreglo tipo persona
        for(int i = 0; i< totalPersonas; i++){
            Persona persona = new Persona(); //creamos un objeto
            System.out.println("Ingrese los datos de la persona: " +(i+1));
            System.out.println("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.println("Apellido: ");
            String apellido = scanner.nextLine();
            System.out.println("Número de cédula: ");
            String cedula = scanner.nextLine();
            System.out.println("Dirección: ");
            String direccion = scanner.nextLine();

            /*.setCedula(cedula);
            persona.setNombre(nombre);
            persona.setApellido(apellido);
            persona.setDireccion(direccion);*/

            personas[i] = new Persona(cedula, nombre, apellido, direccion);
        }

        //ingresar familiares
        System.out.println("Indica el número de familiares que quieres ingresar: ");
        int totalFamiliares = scanner.nextInt();
        scanner.nextLine();

        Familiar[] familiares = new Familiar[totalFamiliares]; //arreglo tipo Familiar
        for(int i=0; i < totalFamiliares; i++){
            Familiar familiar = new Familiar(); //creamos un nuevo objeto para familiar

            System.out.println("Ingrese los datos del familiar: " +(i+1));
            System.out.println("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.println("Apellido: ");
            String apellido = scanner.nextLine();
            System.out.println("Número de cédula: ");
            String cedula = scanner.nextLine();
            System.out.println("Dirección: ");
            String direccion = scanner.nextLine();
            System.out.println("Parentesco: ");
            String parentesco = scanner.nextLine();
            System.out.println("Tipo de sangre: ");
            String tipoDeSangre = scanner.nextLine();
            System.out.println("Ingrese la fecha de nacimiento");
            System.out.println("Año: ");
            int aNacimiento = scanner.nextInt();
            System.out.println("Mes: ");
            int mesNacimiento = scanner.nextInt();
            System.out.println("Día: ");
            int diaNacimiento = scanner.nextInt();

            GregorianCalendar fechaN = new GregorianCalendar(aNacimiento, mesNacimiento - 1, diaNacimiento);
            //creamos un objeto 
            familiares[i] = new Familiar(cedula, nombre, apellido, direccion, fechaN, tipoDeSangre, parentesco);

        }

        //imprimir Personas ingresadas

        System.out.println("Personas ingresadas: ");
        for(Persona persona: personas){  //para la clase Persona, objeto persona: personas(arreglo)
            System.out.println(persona); //imprime el objeto
            System.out.println("\n");
        }

        System.out.println("Familiares Ingresados: ");
        for(Familiar familiar: familiares){
            System.out.println(familiar);
            System.out.println("\n");
        }

        /*  FORMA ANTES UTILIZADA PARA IMPRIMIR
            for (int i = 0; i < totalPersonas; i++) {
            System.out.println("Datos Ingresados, Persona " +(i+1));
            System.out.println("Nombre: " +personas[i].getNombre());
            System.out.println("Apellido: " +personas[i].getApellido());
            System.out.println("Cédula: " +personas[i].getCedula());
            System.out.println("Dirección: " +personas[i].getDireccion());
        }*/

        //persona.setCedula("Victoria");
        // forma incorrecta: System.out.println(persona);estamos imprimiendo el objeto persona
        scanner.close();
    }
}
