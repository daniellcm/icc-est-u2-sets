package controllers;
import java.util.*;
public class Sets {

    public Sets() {

    }

    public Set<String> construirHashSet() {
        Set<String> palabras = new HashSet<String>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Celular");
        return palabras;

    }

    public Set<String> construirLinkedHashSet() {
        Set<String> palabras = new LinkedHashSet<String>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Celular");
        return palabras;
    }

    public Set<String> construirTreeSet() {
        Set<String> palabras = new TreeSet<String>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Celular");
        return palabras;
    }

    public Set<String> construirTreeSetConComparador() {
        //Implementacion de comparardo, para comparacion especifica
        Comparator<String> comparador = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                //Primero comparamos public int por la longitud
                int resultado = Integer.compare(s1.length(), s2.length());
                //si son iguales en tamaños, comparo alfabeticamente
                if(resultado == 0) {
                    return s1.compareTo(s2);
                }
                return resultado;
            }
        };
        Set<String> palabras = new TreeSet<>(comparador);
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Celular");
        palabras.add("Celulas");
        return palabras;
    }

    //Mismo metodo TreeSetConComparador pero inverso

    public Set<String> construirTreeSetConComparadorInverso() {

        Comparator<String> comparador = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int resultado = Integer.compare(s2.length(), s1.length());
                if(resultado == 0) {
                    return s2.compareTo(s1);
                }
                return resultado;
            }
        };
        Set<String> palabras = new TreeSet<>(comparador);
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Celular");
        palabras.add("Celulas");
        return palabras;
    }

}
