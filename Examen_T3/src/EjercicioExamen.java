public class EjercicioExamen {
    public static void main(String[] args) throws Exception {

        Examen e = new Examen("Tema 1", 8.5F);

        System.out.println(e.redondear());
        System.out.println(e.estaAprobado());


    }
}