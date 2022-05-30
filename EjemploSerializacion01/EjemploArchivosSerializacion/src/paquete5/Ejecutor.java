package paquete5;

public class Ejecutor {

    public static void main(String[] args) {

        String nombreArchivo = "hospital.data";

        Hospital h1 = new Hospital("Santa María", 75, 20000);
        Hospital h2 = new Hospital("Central", 100, 50700);
        Hospital h3 = new Hospital("Santa Isabela", 64, 24560);

        Hospital[] lista = {h1, h2, h3};

        EscrituraArchivoSecuencial archivo
                = new EscrituraArchivoSecuencial(nombreArchivo);

        for (int i = 0; i < lista.length; i++) {
            archivo.establecerRegistro(lista[i]);
            archivo.establecerSalida();
        }

        archivo.cerrarArchivo();

        LecturaArchivoSecuencial lectura
                = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerHospital();
        System.out.println(lectura);
    }
}
