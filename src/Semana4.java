import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;
public class Semana4 {
    public static void main(String[] args) {

        //Datos
        String NombredelEstudiante;
        String ApellidodelEstudiante;
        int Edad;
        String CeduladelEstudiante;
        char sexo;
        int PisodelEdificio;
        int NumerodelApartamento;
        double peso;
        boolean EsVistante;
        String EsunAdulto;
        int TotaldeVisitantes = 0;
        int TotaldeEstancia = 0;

        //Captura de Datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante: ");
        NombredelEstudiante = sc.nextLine();

        System.out.println("Ingrese el apellido del estudiante: ");
        ApellidodelEstudiante = sc.nextLine();

        System.out.println("Ingrese la cedula del estudiante: ");
        CeduladelEstudiante = sc.nextLine();

        System.out.println("Ingrese edad del estudiante: ");
        Edad = sc.nextInt();

        System.out.println("Ingrese el sexo del estudiante: ");
        sexo = sc.next().charAt(0);

        System.out.println("Ingrese el peso del estudiante (kg): ");
        peso = sc.nextDouble();

        System.out.println("Ingrese el numero de apartamento del estudiante: ");
        NumerodelApartamento = sc.nextInt();

        System.out.println("Ingrese el piso del estudiante: ");
        PisodelEdificio = sc.nextInt();

        System.out.println("Es Vistante: ");
        EsVistante = sc.nextBoolean();

        if (Edad >= 18) {
            EsunAdulto = "Si";
        } else  {
            EsunAdulto = "No";
        }

        for (int i = 0; i < 7; i++){
            System.out.println("\nVisitantes del dia " + (i+1) );
            System.out.println("Personas que visitaron hoy:");
            int visitasHoy = sc.nextInt();
            TotaldeVisitantes += visitasHoy;
            sc.nextLine();

            System.out.print("Tiempo total de estadía hoy (en minutos): ");
            int TiempodeEstadia = sc.nextInt();
            TotaldeEstancia += TiempodeEstadia;
            sc.nextLine();
        }

        int tpromedio = TotaldeEstancia / 7;

        //Salida de Datos
        System.out.println("\n\n\nNombre del Estudiante: " + NombredelEstudiante);
        System.out.println("Apellido del Estudiante: " + ApellidodelEstudiante);
        System.out.println("Edad del Estudiante: " + Edad + " (Es un Adulto?): " + EsunAdulto);
        System.out.println("Cédula del Estudiante: " + CeduladelEstudiante);
        System.out.println("Sexo del Estudiante: " + sexo);
        System.out.println("Piso del Edificio: " + PisodelEdificio);
        System.out.println("Número del Apartamento: " + NumerodelApartamento);
        System.out.println("Peso del Estudiante: " + peso + "Kg");
        System.out.println("¿Es Visitante?: " + EsVistante);
        System.out.println("---------------------------------------------------");
        System.out.println("El tiempo promedio de visitas es: " + tpromedio + " Minutos ");
        System.out.println("Total de visitas de esta semana: " + TotaldeVisitantes);

    }

}
