package paquete2;

public class PasajeMenorEdad extends PasajeUrbano {

    public PasajeMenorEdad(double pasaje) {
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
        valorPasaje = valorFijo - (valorFijo * 0.2);
    }

    @Override
    public String toString() {
        return String.format("Tipo de pasaje: Menor de edad\n"
                + "%s",
                super.toString()
        );
    }
}
