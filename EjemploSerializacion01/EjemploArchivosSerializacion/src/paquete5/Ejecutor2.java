package paquete5;

import java.util.Scanner;

public class Ejecutor2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombreArchivo = "hospital.data";

        System.out.println("Ingrese un nombre de hospital");
        String a = entrada.nextLine();

        Hospital hospital_buscar;
        EscrituraArchivoSecuencial archivo
                = new EscrituraArchivoSecuencial(nombreArchivo);

        LecturaArchivoSecuencial lectura
                = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerIdentificador(a);
        lectura.establecerHospitalBuscado();
        hospital_buscar = lectura.obtenerHospitalBuscado();
        if (hospital_buscar != null) {
            System.out.println(hospital_buscar);
        } else {
            System.out.println("Hospital no encontrado");
        }
    }
}
