package Hospital;

public class Private extends Paciente {
double base=100.00;
    public Private(String nombre, String dni, int edad, String enfermedad) {
        super(nombre, dni, edad, enfermedad);
    }

    @Override
    public double calcStationCost(int days) {
        return (base * days) * 0.8;
    }
}