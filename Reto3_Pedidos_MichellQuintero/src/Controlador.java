
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Cliente;
import vista.FrmMenu;

public class Controlador implements ActionListener {
    
    private FrmMenu view;
    private Cliente model;
    
    public Controlador(FrmMenu view, Cliente model) {
        this.view = view;
        this.model = model;
        this.view.btnCompras.addActionListener(this);
        this.view.btnPersonaNatural.addActionListener(this);
        this.view.btnPersonaJuridica.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        
       /* switch(e.getSource()){
            case this.view.btnCompras:*/
        }
        
        
        
        
    
}
