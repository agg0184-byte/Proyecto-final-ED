package Hospital;

public abstract class Persona implements IPersona {

    //Atributos
    private String Nombre;
    private String DNI;
    private int Edad;

    // Constructores
    public Persona (String Nombre, String DNI, int Edad)
    {
        this.Nombre=Nombre;
        this.DNI=DNI;
        this.Edad=Edad;
    }
    @Override
    public String getNombre()
    {
        return this.Nombre;
    }
    @Override
    public String getDNI()
    {
        return this.DNI;
    }
    @Override
    public int getEdad()
    {
        return this.Edad;
    }
    @Override
    public void setNombre(String Nombre)
    {
        this.Nombre=Nombre;
    }
    @Override
    public void setDNI(String DNI)
    {
        this.DNI=DNI;
    }
    @Override
    public void setEdad(int Edad)
    {
        this.Edad=Edad;
    }

    public String toString ()
    {
        return "Nombre: "+this.Nombre+"\n"+
                "DNI: "+this.DNI+"\n"+
                "Edad: "+this.Edad;
    }


    public abstract void realizarActividad();

}

