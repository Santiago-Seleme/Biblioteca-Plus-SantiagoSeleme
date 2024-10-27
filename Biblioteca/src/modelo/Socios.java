
package modelo;

public class Socios {
    private String rol;
    static Integer contadorSocios = 1;
    private Long idSocios;
    private String nombre;
    private String apellido;
    private String correo;
    
    
    public Socios(){   
    }
    
    public Socios(String rol,String nombre, String apellido, String correo){
        long idSocios = contadorSocios ++;
        this.idSocios = idSocios;
        this.rol = rol;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }

    public long getIdSocios() {return this.idSocios;    }

    public String getRol() {return this.rol;    }

    public void setRol(String rol) {this.rol = rol;    }

    public String getNombre() {return this.nombre;    }

    public void setNombre(String nombre) {this.nombre = nombre;    }

    public String getApellido() {return this.apellido;    }

    public void setApellido(String apellido) {this.apellido = apellido;    }

    public String getCorreo() {return this.correo;    }

    public void setCorreo(String correo) {this.correo = correo;    }

    @Override
    public String toString() {
        return "Id de Socios: " + idSocios + ", Nombre: " 
                + nombre + ", Apellido: " + apellido + ", Correo Electrinico: " + correo;
    }
    
}
