package inscripcion;
public class estudiante extends persona {
    
    String carrera;
    int semestre;

    public estudiante(String carrera, int semestre, int id, String nombre, int edad, String direccion, String correo, int telefono) {
        super(id, nombre, edad, direccion, correo, telefono);
        this.carrera = carrera;
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return  nombre + " id =  " + id;
    }
    
   
   
 
  
    }
    

