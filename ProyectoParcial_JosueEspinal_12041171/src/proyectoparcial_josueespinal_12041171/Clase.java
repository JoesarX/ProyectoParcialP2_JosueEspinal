package proyectoparcial_josueespinal_12041171;

import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;

public class Clase implements Serializable{
    private String nombre;
    private ArrayList<String> var = new ArrayList<>();
    private int padre;
    private ArrayList<Clase> hijos = new ArrayList<>();
    private int x;
    private int y;
    private static final long SerialVersionUID = 777L;
    

    public Clase()  {
    }

    public Clase(String nombre, ArrayList<String> var, int padre) {
        this.nombre = nombre;
        this.var = var;
        this.padre = padre;
    }   

    public ArrayList<Clase> getHijos() {
        return hijos;
    }
    
    public void addHijos(Clase clase){
        this.hijos.add(clase);
    }
    
    public void setHijos(ArrayList<Clase> hijos) {
        this.hijos = hijos;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getVar() {
        return var;
    }
    
    public void addVar(String var){
        this.var.add(var);
    }

    public void setVar(ArrayList<String> var) {
        this.var = var;
    }

    public int getPadre() {
        return padre;
    }

    public void setPadre(int padre) {
        this.padre = padre;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Clase " + nombre;
    }
    
    
    
    
}
