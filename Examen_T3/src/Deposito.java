public class Deposito {
    int capacidad;
    int litros;
    Contenido contenido;

    public Deposito(int capacidad) throws Exception {
        if(capacidad<=0){
            throw new Exception("La capacidad debe ser un numero superior a 0");
        }
        this.capacidad = capacidad;
        this.litros = 0;
    }
    public Deposito(int capacidad, Contenido contenido) throws Exception {
        if(capacidad<=0){
            throw new Exception("La capacidad debe ser un numero superior a 0");
        }
        this.capacidad = capacidad;
        this.contenido = contenido;
        this.litros = 0;
    }

    public boolean estaVacio() {
        return litros == 0;
    }

    public void llenar(int cantidad, Contenido contenido) throws Exception {
        if (this.contenido == null) {
            this.contenido = contenido;
        }
        if (contenido != this.contenido) {
            throw new Exception("El tipo de contenido no coincide con el del deposito");
        }
        if ((this.litros += cantidad) > this.capacidad){
            throw new Exception("Se esta superando la capacidad del deposito");
        }
    }

    public void extraer(int cantidad) throws Exception {
        if (cantidad > this.litros) {
            throw new Exception("No hay suficiente contenido para extraer");
        }
        this.litros -= cantidad;
    }

    public double getPorcentaje(){

        return (double) (litros * 100) /capacidad;
    }

    public void transvasar(Deposito d) throws Exception {
        this.capacidad = d.capacidad;
        this.contenido = d.contenido;
        this.litros = d.litros;

        d.extraer(d.capacidad);
    }

    public void dibujar(int longitud){
        int i, j;
        System.out.printf("%.0f%% |", this.getPorcentaje());
        for (i = 1; i <= Math.round(longitud*(getPorcentaje()/100)); i++) {
            System.out.print("#");
        }
        for (j = 1; j <= longitud-i; j++) {
            System.out.print(".");
        }

        System.out.print("|\n");
    }

    @Override
    public String toString() {
        if (contenido != null) return "Depósito de " + contenido + " (" + litros + "/" + capacidad + " l.)";
        else return "Depósito (" + litros + "/" + capacidad + " l.)";
    }
}


