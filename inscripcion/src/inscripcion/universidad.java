package inscripcion;
public class universidad  {
    public static void main(String[] args) {
    
     int inscritos = 0;
    estudiante estudiante1 = new estudiante(
   
    "ING software",
    3,
    1,
    "Elisa",
    19,
    "Las palmitas",
    "elisa.santana@gmail.com",
    642145620
    );
    inscritos++;
     estudiante estudiante2 = new estudiante(
   
    "Arquitectura",
    3,
    2,
    "Alicia",
    19,
    "Las palmitas",
    "alicia.santana@gmail.com",
    642145520
    );
    inscritos++;
     estudiante estudiante3 = new estudiante(
   
    "Psicologia",
    5,
    3,
    "Mario",
    21,
    "la villa",
    "mario.borrego@gmail.com",
    645216256
    );
    inscritos++; 
     estudiante estudiante4 = new estudiante(
   
    "ING software",
    6,
    4,
    "Alfonso",
    22,
    "el sol",
    "alfonso.durazo@gmail.com",
    645145530
    );
   inscritos++; 
    profesor profe1 = new profesor(
   
    "Informatica",
    1,
    "Benavides",
    55,
    "cuchilla",
    "benavides.lurinso@gmail.com",
    645225530
    );
    
     profesor profe2 = new profesor(
   
    "Arquitectura",
    2,
    "Fausto",
    36,
    "la villa",
    "fausto.lopez@gmail.com",
    645166530
    );
     
     profesor profe3 = new profesor(
   
    "psicologia",
    3,
    "luis",
    22,
    "Mapulio",
    "luis.luisito@gmail.com",
    645525530
    );
 
    cursopresencial curso1 = new cursopresencial(
    
    425,
    "Base de datos",
    1232,
    profe1
    
    );
    
    cursopresencial curso2 = new cursopresencial(
    
    562,
    "Salud mental",
    1652,
    profe3
    
    );
    
    cursopresencial curso3 = new cursopresencial(
    
    548,
    "Uso basico de Sketchup",
    1645,
    profe2
    
    );
    
    cursovirtual cursov1 = new cursovirtual(
    
    "Google meet",
    "programacion",
    6859,
    profe1
    
    );
    
     cursovirtual cursov2 = new cursovirtual(
    
    "Google meet",
    "photoshop",
    9874,
    profe2
    
    );
     
    cursovirtual cursov3 = new cursovirtual(
    
    "Google meet",
    "psicologia1",
    6544,
    profe3
    
    );
    
    inscripcion<cursopresencial> inscripcion1 = new inscripcion<>(curso1);
    inscripcion1.inscribirestudiante(estudiante1);
    inscripcion1.inscribirestudiante(estudiante4);
   
    
    inscripcion<cursopresencial> inscripcion2 = new inscripcion<>(curso2);
    inscripcion2.inscribirestudiante(estudiante3);
    
    
    inscripcion<cursopresencial> inscripcion3 = new inscripcion<>(curso3);
    inscripcion3.inscribirestudiante(estudiante2);
    
    
    inscripcion<cursovirtual> inscripcion4 = new inscripcion<>(cursov1);
    inscripcion4.inscribirestudiante(estudiante1);
    inscripcion4.inscribirestudiante(estudiante4);
    
    inscripcion<cursovirtual> inscripcion5 = new inscripcion<>(cursov2);
    inscripcion5.inscribirestudiante(estudiante2);
   
    inscripcion<cursovirtual> inscripcion6 = new inscripcion<>(cursov3);
    inscripcion6.inscribirestudiante(estudiante3);
    
      System.out.println("TOTAL DE ESTUDIANTES INSCRITOS: "+ inscritos);
    
    inscripcion1.mostrarinscritos();
    inscripcion2.mostrarinscritos();
    inscripcion3.mostrarinscritos();
    inscripcion4.mostrarinscritos();
    inscripcion5.mostrarinscritos();
    inscripcion6.mostrarinscritos();
    
  
  
    }
    
    }
    