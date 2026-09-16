package inscripcion;
public class cursopresencial extends curso{
    
    int aula;    

    public cursopresencial(int aula, String nombrecurso, int codcurso, profesor profesor) {
        super(nombrecurso, codcurso, profesor);
        this.aula = aula;
    }

    @Override
    public String toString() {
        return "Curso " + nombrecurso + " " + codcurso + "  " + profesor + " aula= " + aula;
    }


    
}
