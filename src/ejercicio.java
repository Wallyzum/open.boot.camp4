public class ejercicio {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Armando Paredes");
        cliente1.setEdad(45);
        cliente1.setTelefono(376557874);
        cliente1.setCredito(12542.25);
        System.out.println(cliente1.getNombre() + " de "+cliente1.getEdad() +" años, con credito actual de "+ cliente1.getCredito()+ " dejo como contacto el numero "+ cliente1.getTelefono());
        Cliente cliente2= new Cliente(22, "Jose Perez", 399877542, 15478.55);
        System.out.println(cliente2.getNombre() + " de "+cliente2.getEdad() +" años, con credito actual de "+ cliente2.getCredito()+ " dejo como contacto el numero "+ cliente2.getTelefono());

        Trabajador trabajador1 = new Trabajador();
        trabajador1.setNombre("Armando Paredes");
        trabajador1.setEdad(45);
        trabajador1.setTelefono(376557874);
        trabajador1.setSalario(73854.25);
        System.out.println(trabajador1.getNombre() + " de "+trabajador1.getEdad() +" años, con un salario actual de "+ trabajador1.getSalario()+ " dejo como contacto el numero "+ trabajador1.getTelefono());
        Trabajador trabajador2 = new Trabajador(22, "Jose Perez", 399877542, 85365.25);
        System.out.println(cliente2.getNombre() + " de "+trabajador2.getEdad() +" años, con un salario actual de "+ trabajador2.getSalario()+ " dejo como contacto el numero "+ trabajador2.getTelefono());


    }
}
