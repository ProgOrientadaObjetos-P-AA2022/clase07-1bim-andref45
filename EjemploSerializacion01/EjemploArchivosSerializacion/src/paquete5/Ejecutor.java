package paquete5;

public class Ejecutor {

    public static void main(String[] args) {

        // nombre del archivo
        String nombreArchivo = "hospital.data";

        Hospital h1 = new Hospital("Santa María", 75, 20000);
        Hospital h2 = new Hospital("Central", 100, 50700);
        Hospital h3 = new Hospital("Santa Isabela", 64, 24560);

        Hospital[] lista = {h1, h2, h3};

        EscrituraArchivoSecuencial archivo
                = new EscrituraArchivoSecuencial(nombreArchivo);

        for (int i = 0; i < lista.length; i++) {
            // establecer el valor del atributo registro
            archivo.establecerRegistro(lista[i]);
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
        }

        archivo.cerrarArchivo();

        LecturaArchivoSecuencial lectura
                = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerListaCalificaciones();
        System.out.println(lectura);
    }
}
