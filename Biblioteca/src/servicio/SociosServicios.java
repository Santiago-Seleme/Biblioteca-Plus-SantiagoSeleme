
package servicio;

import javax.swing.JOptionPane;
import modelo.Socios;
import repositorio.BDSocios;

public class SociosServicios{
    private BDSocios baseDatosSocios;
    
    public SociosServicios (){
        this.baseDatosSocios = new BDSocios();
    }
    
    public void crearSocios(){
        String rol = "Socio";
        String nombre = JOptionPane.showInputDialog(null, "Digite el nombre:", "Creacion de socio", 3); 
        String apellido = JOptionPane.showInputDialog(null, "Digite el apellido:", "Creacion de socio", 3);
        String correo = JOptionPane.showInputDialog(null, "Digite el correo electronico:", "Creacion de socio", 3);
        
        Socios nuevoSocio = new Socios(rol,nombre,apellido,correo); // Creamos un nuevo socio
        baseDatosSocios.agregarSocio(nuevoSocio);   // Llamamos al metodo de BDSocios atravez de el objeto creado
        JOptionPane.showMessageDialog(null, "El nuevo socio fue creado con exito");
    }
    
    public void mostrarSocios(){
        baseDatosSocios.mostrarSocios();        
    }
    
    public void editarSocios(){
        //long idSocio =  Long.parseLong(JOptionPane.showInputDialog("Digite el id del socio: "));
        
        String correoSocio = JOptionPane.showInputDialog("Digite el correo del socio: ");
        
        Socios socio = baseDatosSocios.buscarSocioPorCorreo(correoSocio);
        
        if (socio != null){
            
            String nombreNuevo = JOptionPane.showInputDialog(null, "Digite el nuevo nombre:", "Edicion de socio", 3); 
            String apellidoNuevo = JOptionPane.showInputDialog(null, "Digite el nuevo apellido:", "Edicion de socio", 3);
            String correoNuevo = JOptionPane.showInputDialog(null, "Digite el nuevo correo electronico:", "Edicion de socio", 3);
            
            baseDatosSocios.modificarDatosSocio(correoSocio,nombreNuevo,apellidoNuevo,correoNuevo);
            JOptionPane.showMessageDialog(null, "El socio fue editado con exito");
        }
        else{
            JOptionPane.showMessageDialog(null, "El correo no existe en la base de datos");
        }
        
    }
    
    public void eliminarSocio(){
        String correoSocio = JOptionPane.showInputDialog("Digite el correo del socio: ");
        
        Socios socio = baseDatosSocios.buscarSocioPorCorreo(correoSocio);
        
        if (socio != null){
            baseDatosSocios.eliminarASocio(correoSocio);
        }
        else{
            JOptionPane.showMessageDialog(null, "El correo no existe en la base de datos");
        }
    }
    
}

