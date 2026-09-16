package inscripcion;
public class profesor extends persona {
    
    String departamento;

    public profesor(String departamento, int id, String nombre, int edad, String direccion, String correo, int telefono) {
        super(id, nombre, edad, direccion, correo, telefono);
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "profesor " + nombre  + "  ";
    }

 
}
