package inscripcion;
public abstract class persona {
    
    int id;
    String nombre;
    int edad;
    String direccion;
    String correo;
    int telefono;

    public persona(int id, String nombre, int edad, String direccion, String correo, int telefono) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "persona: " + "id= " + id + ", nombre= " + nombre + ", edad= " + edad + ", direccion= " + direccion + ", correo= " + correo + ", telefono= " + telefono + '}';
    }
 
   
    }
    
   
    

