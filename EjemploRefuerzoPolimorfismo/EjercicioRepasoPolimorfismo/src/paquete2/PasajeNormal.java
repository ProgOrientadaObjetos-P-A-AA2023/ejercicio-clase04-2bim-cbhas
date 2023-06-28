package paquete2;

public class PasajeNormal extends PasajeUrbano {

    public PasajeNormal(double pasaje) {
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
        valorPasaje = valorFijo;
    }

    @Override
    public String toString() {
        return String.format("Tipo de pasaje: Normal\n"
                + "%s",
                super.toString()
        );
    }
}
