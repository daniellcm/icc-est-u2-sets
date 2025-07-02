package utils;

import models.Contacto;

public class ContactoComparatorTelefono implements java.util.Comparator<Contacto> {

    @Override
    public int compare(Contacto o1, Contacto o2) {
        int resApellido = o1.getApellido().compareToIgnoreCase(o2.getApellido());

        if (resApellido != 0) {
            return resApellido;
        }

        int resNombre = o1.getnombre().compareToIgnoreCase(o2.getnombre());
        if (resNombre != 0) {
            return resNombre;
        }

        return o2.getTelefono().compareTo(o1.getTelefono());
    }
}
