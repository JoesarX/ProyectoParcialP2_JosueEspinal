package proyectoparcial_josueespinal_12041171;

import java.io.Serializable;
import java.util.Date;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.text.Style;
import javax.swing.text.StyledDocument;

public class Documento implements Serializable{
    private JTextPane panelCodigo;
    private JEditorPane panel;
    private StyledDocument doc;
    private Style style;
    private Date fecha;

    public Documento() {
    }

    public Documento(JTextPane panelCodigo, JEditorPane panel, StyledDocument doc, Style style, Date fecha) {
        this.panelCodigo = panelCodigo;
        this.panel = panel;
        this.doc = doc;
        this.style = style;
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public JTextPane getPanelCodigo() {
        return panelCodigo;
    }

    public void setPanelCodigo(JTextPane panelCodigo) {
        this.panelCodigo = panelCodigo;
    }

    public JEditorPane getPanel() {
        return panel;
    }

    public void setPanel(JEditorPane panel) {
        this.panel = panel;
    }

    public StyledDocument getDoc() {
        return doc;
    }

    public void setDoc(StyledDocument doc) {
        this.doc = doc;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    @Override
    public String toString() {
        return "Documento{" + "panel=" + panel + ", doc=" + doc + ", estilo=" + style + '}';
    }
}
