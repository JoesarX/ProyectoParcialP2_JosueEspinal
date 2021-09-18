package proyectoparcial_josueespinal_12041171;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class UML implements Serializable{
    private ArrayList<Clase> clases;
    private String codigo;
    private Date fecha;
    private static final long SerialVersionUID = 777L;

    public UML() {
    }

    public UML(ArrayList<Clase> clases, String codigo, Date fecha) {
        this.clases = clases;
        this.codigo = codigo;
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    

    public ArrayList<Clase> getClases() {
        return clases;
    }
    
    public void addClases(Clase clase) {
        this.clases.add(clase);
    }
    
    public void setClases(ArrayList<Clase> clases) {
        this.clases = clases;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "UML{" + "clases=" + clases + ", codigo=" + codigo + '}';
    }
    
}
