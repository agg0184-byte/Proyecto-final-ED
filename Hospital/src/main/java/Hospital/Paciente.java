package Hospital;

import java.util.Scanner;

public abstract class Paciente extends Persona
{
    private String Enfermedad;

    public Paciente (String Nombre, String DNI,int Edad, String enfermedad)
    {
        super(Nombre,DNI,Edad);
        this.Enfermedad=enfermedad;

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
    public abstract double calcStationCost(int dias);


}