public class EjercicioDeposito {
    public static void main(String[] args) throws Exception {
        Deposito d = new Deposito(100, Contenido.ACEITE);

        d.llenar(16, Contenido.ACEITE);

        System.out.println(d.estaVacio());

        d.extraer(10);

        System.out.println(d.getPorcentaje());

        d.dibujar(10);

    }
}
