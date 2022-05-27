package paquete5;

import java.util.ArrayList;
import paquete1.Empresa;

/**
 *
 * @author reroes
 */
public class ManejoArrayList4 {

    public static void main(String[] args) {
        Empresa e1 = new Empresa("Amazon", "Bellevue");
        Empresa e2 = new Empresa("Apple", "Los Altos");
        Empresa e3 = new Empresa("Netflix", "Scotts Valley");

        ArrayList<Empresa> emp = new ArrayList<>();
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);

        for (int i = 0; i < emp.size(); i++) {
            System.out.printf("Empresa: %s\n"
                    + "Ciudad: %s\n",
                    emp.get(i).obtenerNombre(),
                    emp.get(i).obtenerCiudad());
            System.out.println("--------------------------------");
        }
    }

}
