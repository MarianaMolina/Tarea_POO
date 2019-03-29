
package tarea_poo;

import java.util.ArrayList;

public class Mesa {
    private int cant_personas;
    private ArrayList<String> comida;
    private ArrayList<String> bebida;
    private ArrayList<String> postre;
    private ArrayList<Integer> mesa;

    //constructor
    public Mesa() {
        cant_personas = 0;
        comida = null;
        bebida = null;
        postre = null;
        mesa=  null;
    }

    public Mesa(int cant_personas, ArrayList<String> comida, ArrayList<String> bebida, ArrayList<String> postre, ArrayList<Integer> mesa) {
        this.cant_personas = cant_personas;
        this.comida = comida;
        this.bebida = bebida;
        this.postre = postre;
        this.mesa = mesa;
    }
    
    

    //Setters 

    public void setCant_personas(int cant_personas) {
        this.cant_personas = cant_personas;
    }

    public void setComida(ArrayList<String> comida) {
        this.comida = comida;
    }

    public void setBebida(ArrayList<String> bebida) {
        this.bebida = bebida;
    }

    public void setPostre(ArrayList<String> postre) {
        this.postre = postre;
    }

    public void setCant_mesa(ArrayList<Integer> cant_mesa) {
        this.mesa = cant_mesa;
    }
    
    
    //Getters
    public int getCant_personas() {
        return cant_personas;
    }

    public ArrayList<String> getComida() {
        return comida;
    }

    public ArrayList<String> getBebida() {
        return bebida;
    }

    public ArrayList<String> getPostre() {
        return postre;
    }

    public ArrayList<Integer> getCant_mesa() {
        return mesa;
    }

    
    
    //metodos 
    public void AsignarMesa(ArrayList<String> mesa){
        for (int i = 0; i < mesa.size(); i++) {
            if (mesa.get(i)== null) {
                Cliente cliente = new Cliente(); 
                mesa.add(cliente.getNombre());
            }
        }
    }
    
    public void AgregarComida(){
        
    }
    
    public void AgregarBebida(){
        
    }
    
    public void AgregarPostre(){
        
    }

    public void AgregarPersona(){
        
    }
    
    public void ordenar(){
        
    }
    
    public void pagar(){
        System.out.println("Pagar");
    }
    
}
