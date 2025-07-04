package controllers;

import java.util.HashSet;
import java.util.Set;

public class Ejercicios {

    public Ejercicios() {
        System.out.println("----- Ejercicio 1 -----");
        System.out.println(tieneDuplicados(new int[]{1, 2, 3, 4, 5}));
        System.out.println(tieneDuplicados(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1, 45}));
        
        System.out.println("----- Ejercicio 2 -----");
        System.out.println(esIsograma("murcielago"));
        System.out.println(esIsograma("camaleon"));

        System.out.println("----- Ejercicio 3 -----");
        String texto = """
                    La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren las ciudades, la IA está presente en casi todos los aspectos de nuestra vida diaria. Sin embargo, este avance también plantea desafíos éticos, sociales y económicos que deben ser cuidadosamente analizados. ¿Estamos preparados para delegar decisiones importantes a sistemas que no poseen conciencia ni empatía?
                    Por otro lado, la IA puede ser una herramienta poderosa en sectores como la salud, la educación y el medio ambiente. Con algoritmos bien entrenados, es posible detectar enfermedades de forma temprana, personalizar la enseñanza o monitorear los ecosistemas en tiempo real. No obstante, es fundamental garantizar que su implementación sea inclusiva, justa y transparente.
                    En resumen, el desarrollo responsable de la inteligencia artificial no solo debe centrarse en la innovación, sino también en el impacto que genera en la humanidad y en el planeta. El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas.""";
                    
        String texto1 = "¡Hola! La programación en Java es muy divertida, sobre todo cuando se entienden los conceptos.";
        String texto2 = "Java es divertido. Aprender programación puede ser un reto, pero también muy gratificante.";
        System.out.println(contarPalabrasUnicas(texto1 ));
        System.out.println(contarPalabrasUnicas(texto2 ));
        System.out.println(contarPalabrasUnicas(texto ));

        System.out.println("----- Ejercicio 4 -----");
        compararTextos(texto1, texto2);
    }

    public boolean tieneDuplicados(int[] numeros) {
        Set<Integer> set = new HashSet<>();
        for (int numero : numeros) {
            if (!set.add(numero)) {
                return true; 
            }
        }
        return false;
    }

    // Ejemplos: 
    // murcielago - true (es isograma)
    // camaleo - false (repite a)

    public boolean esIsograma(String palabra) {
        Set<Character> set = new HashSet<>();
        for (char c : palabra.toCharArray()) {
            if (!set.add(c)) {
                return false; 
            }
        }
        return true; 
    }

    public int contarPalabrasUnicas(String texto) {
        Set<String> palabraUnica = new HashSet<>();
        String[] palabras = texto.split(" ");
        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                palabraUnica.add(palabra); 
            }
        }
        return palabraUnica.size(); 
    }

    public void compararTextos(String texto1, String texto2) {
        Set<String> palabrasTexto1 = obtenerPalabras(texto1);
        Set<String> palabrasTexto2 = obtenerPalabras(texto2);
        Set<String> palabrasComunes = new HashSet<>(palabrasTexto1);
        palabrasComunes.retainAll(palabrasTexto2);
        
        
        
        int palabrasUnicasTexto1 = palabrasTexto1.size();
        int palabrasUnicasTexto2 = palabrasTexto2.size();
        int palabrasUnicasComunes = palabrasComunes.size();
        System.out.println("Texto 1: " + palabrasUnicasTexto1 + " palabras únicas");
        System.out.println("Texto 2: " + palabrasUnicasTexto2 + " palabras únicas");
        
        Set<String> soloTexto1 = new HashSet<>(palabrasTexto1);
        Set<String> soloTexto2 = new HashSet<>(palabrasTexto2);
        soloTexto1.removeAll(palabrasTexto2);
        soloTexto2.removeAll(palabrasTexto1);
        System.out.println("Palabras únicas en común: " + palabrasUnicasComunes);
        double coincidenciaLexica = (double) palabrasUnicasComunes / Math.max(palabrasUnicasTexto1, palabrasUnicasTexto2) * 100;
        System.out.printf("Coincidencia léxica: %.2f%%\n", coincidenciaLexica);
        System.out.println("Solo en texto 1: " + soloTexto1);
        System.out.println("Solo en texto 2: " + soloTexto2);

    }

    private Set<String> obtenerPalabras(String texto) {
        Set<String> palabras = new HashSet<>();
        String[] partes = texto.split("\\W+"); 
        for (String parte : partes) {
            if (!parte.isEmpty()) {
                palabras.add(parte.toLowerCase());
            }
        }
        return palabras;
    }
}