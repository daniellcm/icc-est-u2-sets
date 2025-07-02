package controllers;

import java.util.Set;
import java.util.TreeSet;

import models.Contacto;
import utils.ContactoComparator;
import utils.ContactoComparatorHash;
import utils.ContactoComparatorTelefono;

public class ContactoController {
    public ContactoController() {
        runTreeContacto();
        runTreeContactoTelefono();
        runTreeContactoHash();
    }

    public void runTreeContacto() {
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparator());
        System.out.println("----- Agenda ordenada por Apellido - Nombre -----");
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Pedro", "Gonzales", "222222222"));
        agenda.add(new Contacto("Pablo", "Lopes", "222222222"));

        for (Contacto contacto : agenda) {
            System.out.println(contacto);
        }
    }

    public void runTreeContactoTelefono() {
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparatorTelefono());
        System.out.println(" ");
        System.out.println("----- Agenda ordenada por Apellido - Nombre - Telefono -----");
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Pedro", "Gonzales", "222222222"));
        agenda.add(new Contacto("Pablo", "Lopes", "222222222"));

        for (Contacto contacto : agenda) {
            System.out.println(contacto);
        }
    }

    public void runTreeContactoHash() {
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparatorHash());
        System.out.println(" ");
        System.out.println("----- Agenda ordenada por HashCode -----");
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Pedro", "Gonzales", "222222222"));
        agenda.add(new Contacto("Pablo", "Lopes", "222222222"));

        for (Contacto contacto : agenda) {
            System.out.println(contacto);
        }
    }
}
