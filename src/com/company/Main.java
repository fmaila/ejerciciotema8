package com.company;

public class Main {

    public static void main(String[] args) {

        Persona persona=new Persona();
        persona.setEdad(32);
        persona.setNombre("Juan");
        persona.setTelefono(2123456);
        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());


        // write your code here
    }
}

class Persona{

    private int edad;
    private  String nombre;
    private int telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}