package utils;

import models.Contacto;

public class ContactoComparator implements java.util.Comparator<Contacto> {
    public int compare(Contacto o1, Contacto o2) {
        // Primerp comparar con el apellido alfabeticamente
        int resultComparacionApellido = o1.getApellido().compareToIgnoreCase(o2.getApellido());

        // Si los apellidos son iguales comparo con el nombre
        if (resultComparacionApellido != 0) {
            return resultComparacionApellido;
        }
        int resultComparacionNombre = o1.getnombre().compareToIgnoreCase(o2.getnombre());
        return resultComparacionNombre;
    }
}
