import java.util.Set;

import controllers.ContactoController;
import controllers.Sets;

public class App {

    public static void main(String[] args) throws Exception {
        // Sets sets = new Sets();
        // runHashSet(sets);
        // runLinkedHashSet(sets);
        // runTreeSet(sets);
        // runTreeSetConComparador(sets);
        // runTreeSetConComparadorInverso(sets);

        ContactoController contactos = new ContactoController();

    }

    public static void runHashSet(Sets sets) {
        Set<String> palabras = sets.construirHashSet();
        System.out.println("----- HashSets -----");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }

    public static void runLinkedHashSet(Sets sets) {
        Set<String> palabrasLinked = sets.construirLinkedHashSet();
        System.out.println("----- LinkedHashSets -----");
        for (String palabra : palabrasLinked) {
            System.out.println(palabra);
        }
    }

    public static void runTreeSet(Sets sets) {
        Set<String> palabrasTree = sets.construirTreeSet();
        System.out.println("----- TreeSets -----");
        for (String palabra : palabrasTree) {
            System.out.println(palabra);
        }
    }

    public static void runTreeSetConComparador(Sets sets) {
        Set<String> palabrasTreeComparador = sets.construirTreeSetConComparador();
        System.out.println("----- TreeSets con Comparador -----");
        for (String palabra : palabrasTreeComparador) {
            System.out.println(palabra);
        }
    }

    public static void runTreeSetConComparadorInverso(Sets sets) {
        Set<String> palabrasTreeComparador2 = sets.construirTreeSetConComparadorInverso();
        System.out.println("----- TreeSets con Comparador 2 -----");
        for (String palabra : palabrasTreeComparador2) {
            System.out.println(palabra);
        }
    }
}
