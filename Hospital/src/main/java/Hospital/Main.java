package Hospital;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        boolean entra=true;
        Scanner teclado=new Scanner(System.in);
        Habitacion[][] Hospital=new Habitacion[4][5];
        int planta=0;
        int habitacion=0;

        for(int i=0;i<Hospital.length;i++)
        {
            for(int j=0;j<Hospital[i].length;j++)
            {
                Hospital[i][j]=new Habitacion(i,j);
            }
        }
        ///////////menu/////////////////////
        while(entra)
        {
            System.out.println("////////MENU//////");
            System.out.println("1-Muestra paciente");
            System.out.println("2-Agrega paciente");
            System.out.println("3-Quitar paciente");
            System.out.println("4-Realiza actividad");
            System.out.println("5-Mostrar habitaciones vacias");
            System.out.println("6-Muestra habitaciones ocupadas");
            System.out.println("7-FIN");
            System.out.println("INTRODUZCA OPCION");
            int opcion=teclado.nextInt();

            switch(opcion)
            {
                case 1:
                    System.out.println("Introduzca planta: ");
                    planta=teclado.nextInt();
                    System.out.println("Introduzca habitacion: ");
                    habitacion=teclado.nextInt();

                    if(Hospital[planta][habitacion].getPaciente()==null)
                    {
                        System.out.println("No hay paciente.");
                    }
                    else
                    {
                        System.out.println(Hospital[planta][habitacion].getPaciente());
                    }
                    break;
                case 2:
                    for(int i=0;i<Hospital.length;i++)
                    {
                        for(int j=0;j<Hospital[i].length;j++)
                        {
                            if(Hospital[i][j].getPaciente()==null)
                            {
                                System.out.println("Nombre :");
                                String nombre=teclado.next();
                                System.out.println("DNI :");
                                String dni=teclado.next();
                                System.out.println("Edad :");
                                int edad=teclado.nextInt();
                                System.out.println("Diagnostico :");
                                String diagnostico=teclado.next();
                                System.out.println("Insurrance Type :");
                                String Insurrance=teclado.next();

                                Paciente temp=new Paciente(nombre,dni,edad,diagnostico,Insurrance);
                                Hospital[i][j].Agregar_Paciente(temp);
                                j=Hospital[i].length-1;
                                i=Hospital.length-1;
                            }

                            else
                            {
                                if(i==Hospital.length-1  && j==Hospital[i].length-1)
                                {
                                    System.out.println("Hospital completo");
                                }
                            }

                        }

                    }

                    break;
                case 3:
                    System.out.println("Introduzca planta: ");
                    planta=teclado.nextInt();
                    System.out.println("Introduzca habitacion: ");
                    habitacion=teclado.nextInt();

                    if(Hospital[planta][habitacion].getPaciente()==null)
                    {
                        System.out.println("No hay paciente.");
                    }
                    else
                    {
                        Hospital[planta][habitacion].Alta_Paciente();
                    }
                    break;
                case 4:
                    System.out.println("Introduzca planta: ");
                    planta=teclado.nextInt();
                    System.out.println("Introduzca habitacion: ");
                    habitacion=teclado.nextInt();

                    if(Hospital[planta][habitacion].getPaciente()==null)
                    {
                        System.out.println("No hay paciente.");
                    }
                    else
                    {
                        Hospital[planta][habitacion].getPaciente().realizarActividad();
                    }
                    break;
                case 5:
                    for(int i=0;i<Hospital.length;i++)
                    {
                        for(int j=0;j<Hospital[i].length;j++)
                        {
                            if(Hospital[i][j].getPaciente()==null)
                            {
                                System.out.println("Habitación: "+i+"/"+j);
                            }

                        }
                    }
                    break;
                case 6:
                    for(int i=0;i<Hospital.length;i++)
                    {
                        for(int j=0;j<Hospital[i].length;j++)
                        {
                            if(Hospital[i][j].getPaciente()!=null)
                            {
                                System.out.println("Habitación: "+i+"/"+j);
                            }

                        }
                    }
                    break;
                case 7:
                    entra=false;
                    System.out.println("FIN");
                    break;
            }



        }

    }

}
