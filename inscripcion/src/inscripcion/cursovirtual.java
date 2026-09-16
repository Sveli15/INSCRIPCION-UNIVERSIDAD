package inscripcion;
public class cursovirtual extends curso{
    
    String plataforma;

    public cursovirtual(String plataforma, String nombrecurso, int codcurso, profesor profesor) {
        super(nombrecurso, codcurso, profesor);
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return  nombrecurso +"  " + codcurso + "  " + profesor + " plataforma= " + plataforma;
    }
    
}
