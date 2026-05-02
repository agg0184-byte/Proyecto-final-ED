package Hospital;

public class Paciente extends Persona
{
    private String Enfermedad;

    public Paciente (String Nombre, String DNI, int Edad, String Enfermedad)
    {
        super(Nombre,DNI,Edad);
        this.Enfermedad=Enfermedad;
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

}