
package incioAplicacion;

import javax.swing.JOptionPane;
import servicio.SociosServicios;

public class RunApp {
    
    public static void main(String[] args) {
        SociosServicios servicio = new SociosServicios();       
        
        int seleccione = 1;
        //Llamamos a la funcion que muestra el titulo de la gestion de socios
            mostrarTituloAplicacion();
        do {          
            // Inicializo un arreglo de tipo String con los valores de las opciones de la gestion de socios
            String[] opciones = inicializarArregloOpcionesSocios();

            int seleccion = seleccionarOpcionSocio(opciones);

            if (seleccion == 0){//Ver socios
                servicio.mostrarSocios();
            }
            else if (seleccion == 1){//Crear socio
                servicio.crearSocios();
            }
            else if (seleccion == 2){//Eliminar socio
                servicio.eliminarSocio();
            }
            else if (seleccion == 3){//Editar socio
                servicio.editarSocios();
            }
            
            
            // Inicializo un arreglo de tipo String con los valores de las opciones de continuar o no el programa
            String[] finSiNo = inicializarArregloSiNO();
            
            seleccione = seleccionarOpcionFin(finSiNo);
            
        } while (seleccione == 1);
        
    }
    
    // Inicio del programa
    public static void mostrarTituloAplicacion(){
        JOptionPane.showMessageDialog(null, "Bienvenido a Gestion de Socios", "Socios", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static String[] inicializarArregloOpcionesSocios(){
        return new String[]{
            "Ver Socios", "Crear socio", "Eliminar Socio", "Editar Socio"
        };
    }
    
    public static int seleccionarOpcionSocio(String [] opciones){
        return JOptionPane.showOptionDialog(null, "Seleccione una opcion:", "Seleccion Gestion de Socios", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
    }
    
    
    // Para el final del programa
    public static String [] inicializarArregloSiNO() {
        return new String[] {"Si","No"};
    }
    
    public static int seleccionarOpcionFin(String [] opciones){
        return JOptionPane.showOptionDialog(null, "Finalizar programa.", "Que desea hacer?", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones);
    }
    
}
