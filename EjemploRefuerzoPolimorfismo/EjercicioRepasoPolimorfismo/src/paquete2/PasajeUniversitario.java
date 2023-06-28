package paquete2;

public class PasajeUniversitario extends PasajeUrbano {

    public PasajeUniversitario(double pasaje) {
        super(pasaje);
    }

    public double getValorPasaje() {
        return valorPasaje;
    }

    public void setValorPasaje(double vP) {
        valorPasaje = vP;
    }

    public double getValorFijo() {
        return valorFijo;
    }

    public void setValorFijo(double vF) {
        valorFijo = vF;
    }

    public Persona getUsuario() {
        return usuario;
    }

    public void setUsuario(Persona u) {
        usuario = u;
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
