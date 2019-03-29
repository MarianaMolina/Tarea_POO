
package tarea_poo;

public class Cliente {
    private String nombre;
    private int edad;

    //constructor
    public Cliente() {
        nombre =null;
        edad = 0;
    }
    
    //Set y get

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    
    //metodos
    /*
    public String consultar(){
        
        return;
    }
    */
    
    
}
