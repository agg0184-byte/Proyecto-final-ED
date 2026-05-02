package Hospital;

public class Habitacion {
    private int N_Planta;
    private int N_Habitacion;
    private Paciente Enfermo;

    public Habitacion (int N_Planta, int N_Habitacion)
    {
        this.N_Planta=N_Planta;
        this.N_Habitacion=N_Habitacion;
        this.Enfermo=null;
    }

    //getters
    public int getN_Planta()
    {
        return this.N_Planta;
    }
    public int getN_Habitacion()
    {
        return this.N_Habitacion;
    }
    //setters
    public void setN_Planta(int N_Planta)
    {
        this.N_Planta=N_Planta;
    }
    public void setN_Habitacion(int N_Habitacion)
    {
        this.N_Habitacion=N_Habitacion;
    }

    public Paciente getPaciente()
    {
        return this.Enfermo;
    }

    ////Resto

    public void Agregar_Paciente(Paciente nuevoPaciente)
    {
        this.Enfermo=nuevoPaciente;
    }

    public void Alta_Paciente()
    {
        this.Enfermo=null;
    }

}
