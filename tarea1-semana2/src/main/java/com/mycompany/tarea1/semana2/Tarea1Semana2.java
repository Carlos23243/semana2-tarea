#abstracción#
abstract class Animal {
 
    public abstract String hacerSonido();
}

class Perro extends Animal {
    @Override
    public String hacerSonido() {
        return "Guau";
    }
}

class Gato extends Animal {
    @Override
    public String hacerSonido() {
        return "Miau";
    }
}

public class EjemploAbstraccion {
    public static void main(String[] args) {
        Animal[] mascotas = { new Perro(), new Gato() };
        for (Animal a : mascotas) {
            System.out.println(a.hacerSonido());
        }
    }
}
#encapsulación#

class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    public double obtenerSaldo() {
        return saldo;
    }
}

public class EjemploEncapsulacion {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(100);
        cuenta.depositar(50);
        System.out.println("Saldo actual: " + cuenta.obtenerSaldo());
    }
}



#herencia#

class Persona {
    protected String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String saludar() {
        return "Hola, soy " + nombre;
    }
}

class Estudiante extends Persona {
    public Estudiante(String nombre) {
        super(nombre);
    }

    public String estudiar() {
        return nombre + " está estudiando.";
    }
}

public class EjemploHerencia {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Carlos");
        System.out.println(estudiante.saludar());
        System.out.println(estudiante.estudiar());
    }
}

#polimorfismo#

class Ave {
    public String hablar() {
        return "Chirp chirp";
    }
}

class Loro extends Ave {
    @Override
    public String hablar() {
        return "Hola!";
    }
}

class Canario extends Ave {
    @Override
    public String hablar() {
        return "Pío pío";
    }
}

public class EjemploPolimorfismo {
    public static void main(String[] args) {
        Ave[] aves = { new Loro(), new Canario() };
        for (Ave ave : aves) {
            System.out.println(ave.hablar());
        }
    }
}

