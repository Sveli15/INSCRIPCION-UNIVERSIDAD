package inscripcion;

import java.util.ArrayList;

public class inscripcion<T extends curso> implements inscrip{

    T curso;
    public inscripcion(T curso) {
    this.curso = curso;
}
    ArrayList<estudiante> estudiantes = new ArrayList<>();
    
    @Override
    public void inscribirestudiante(estudiante e) {
        estudiantes.add(e);
 
    }

    @Override
    public void removerestudiante(estudiante e) {
    estudiantes.remove(e);
    }

    @Override
    public void mostrarinscritos() {
  

        System.out.println(curso);
        
        for(estudiante e: estudiantes){   
            System.out.println(e); 
           System.out.println("-------------------------------");    
        }
        
    }

    @Override
    public void cursosdisponibles() {
    }

    
}
