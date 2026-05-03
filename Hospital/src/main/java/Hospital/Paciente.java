package Hospital;

import java.util.Scanner;

public class Paciente extends Persona
{
    private String Enfermedad;
    private String InsurranceType;

    public Paciente (String Nombre, String DNI,int Edad, String enfermedad, String InsurranceType)
    {
        super(Nombre,DNI,Edad);
        this.Enfermedad=Enfermedad;
        this.InsurranceType=InsurranceType;
    }

    public String getEnfermedad()
    {
        return this.Enfermedad;
    }

    public void setEnfermedad(String Enfermedad)
    {
        this.Enfermedad=Enfermedad;
    }

    public void realizarActividad()
    {
        System.out.println("Paseando");
    }

    @Override
    public String toString ()
    {
        return super.toString()+"\n"+
                "Diagnostico: "+this.Enfermedad;
    }

//Code Smell:Switch Statement
    public double calcStationCost(int dias) {
        double base = 100.0;
        switch (this.InsurranceType) {
            case "PRIVATE":
                return (base * dias) * 0.8; // 20% descuento
            case "PUBLIC":
                return (base * dias); // Precio base
            case "VIP":
                return (base * dias) * 1.5; // Servicio premium
            default:
                throw new IllegalArgumentException("Invalid insurrance");
        }
    }

  //Code Smells:Long Method
    public void processPatient()
    {
        Scanner sc = new Scanner(System.in);

        // 1.Data reading
        System.out.println("Enter Patient Name:");
        String name = sc.nextLine();
        System.out.println("Enter DNI:");
        String dni = sc.nextLine();

        // 2. DNI validation
        if (dni.length() != 8) {
            System.out.println("Invalid DNI. Error 404.");
            return;
        }

        // 3. Initial costs
        double baseFee = 50.0;
        System.out.println("Enter Insurance Type (VIP/REGULAR):");
        String insurance = sc.nextLine();
        if (insurance.equals("VIP")) {
            baseFee += 100.0;
        }

        // 4. room assignation
        System.out.println("Searching available room...");
        boolean roomFound = true;
        int roomNumber = 101;

        // 5. tickect imp
        if (roomFound) {
            System.out.println("--- HOSPITAL ADMISSION TICKET ---");
            System.out.println("Patient: " + name);
            System.out.println("Room assigned: " + roomNumber);
            System.out.println("Total to pay: " + baseFee);
            System.out.println("Saving to database... Success.");
        }
    }

}