package Hospital;

    public class Public extends Paciente {

        double base=100.00;

        public Public(String nombre, String dni, int edad, String enfermedad) {
            super(nombre, dni, edad, enfermedad);
        }

        @Override
        public double calcStationCost(int dias) {

            return base * dias;
        }
    }

