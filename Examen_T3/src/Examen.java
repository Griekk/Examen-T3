public class Examen {
    private String titulo;
    private float calificacion;
    private String asignatura;

    public Examen(String titulo, float calificacion) throws Exception {
        if(titulo.isEmpty()){
           throw new Exception("El titulo no puede estar vacio");
        }
        this.titulo = titulo;
        this.calificacion = calificacion;
    }

    public Examen(Examen e) throws Exception {
        if(e.titulo.isEmpty()){
            throw new Exception("El titulo no puede estar vacio");
        }
        this.titulo = e.titulo;
        this.calificacion = e.calificacion;
        this.asignatura = e.asignatura;
    }

    public Examen(String titulo, Examen e) throws Exception {
        if(e.titulo.isEmpty()){
            throw new Exception("El titulo no puede estar vacio");
        }
        this.titulo = titulo;
        this.calificacion = e.calificacion;
        this.asignatura = e.asignatura;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public int redondear(){
        return Math.round(calificacion);
    }

    public boolean estaAprobado(){
        return calificacion>=5;
    }



    @Override
    public String toString() {
        if (asignatura.isEmpty()) {
            return titulo + " - " + calificacion;
        } else {
            return asignatura + " - " + titulo + " - " + calificacion;
        }

    }
}
