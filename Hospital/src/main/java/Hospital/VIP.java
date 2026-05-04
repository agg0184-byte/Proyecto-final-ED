package Hospital;

public class VIP extends Paciente {
    double base=100.00;

    public VIP(String nombre, String dni, int edad, String enfermedad) {
        super(nombre, dni, edad, enfermedad);
    }

    @Override
    public double calcStationCost(int dias) {

        return (base * dias)*1.5;
    }
}
