package paquete2;

public class PasajeUniversitario extends PasajeUrbano {

    public PasajeUniversitario(double pasaje) {
        super(pasaje);
    }

    @Override
    public void establecerValorPasaje() {
        valorPasaje = valorFijo - (valorFijo * 0.3);
    }

    @Override
    public String toString() {
        return String.format("Tipo de pasaje: Universitario\n"
                + "%s",
                super.toString()
        );
    }
}
