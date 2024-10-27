
package repositorio;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import modelo.Socios;

public class BDSocios {
    private List<Socios> listaSocios;
    
    public BDSocios(){
        this.listaSocios = new ArrayList<>();
        inicializarListaSocios();
    }
    
    //  Intento de base de datos
    private void inicializarListaSocios(){  //Forma parte del constructor
        listaSocios.add(new Socios("Socio", "Santiago", "Seleme", "SantiNatSeleme@gmail.com"));
    }
    
    public void agregarSocio(Socios nuevoSocio){
        listaSocios.add(nuevoSocio);
    }
    
    public void mostrarSocios(){
        for(Socios socio : listaSocios){
            JOptionPane.showMessageDialog(null, socio.toString());
        }
    }
    
    public Socios buscarSocioPorCorreo(String correo){
        for (Socios socio : listaSocios){
            if (socio.getCorreo().equalsIgnoreCase(correo)){
                return socio;
            }
        }
        return null;
    }
    
    //TODO ACA HAY QUE MODIFICAR EL SOCIO, NO CREAR UNO NUEVO
    public void modificarDatosSocio(String socioCorreo,String nombreNuevo,String apellidoNuevo,String correoNuevo) {
        for (Socios socio : listaSocios){
            if (socio.getCorreo().equalsIgnoreCase(socioCorreo)){
                socio.setNombre(nombreNuevo);
                socio.setApellido(apellidoNuevo);
                socio.setCorreo(correoNuevo);
            }
        }
    }

    public boolean eliminarASocio(String socioEliminar) {
        for (Socios socio : listaSocios){
            if (socio.getCorreo().equalsIgnoreCase(socioEliminar)){
                listaSocios.remove(socio);
                return true;
            };
        }
        return false;
    }
    
}
