public class Trabajador extends Persona{
    private double salario;
    public Trabajador(){};
    public Trabajador (int edad, String nombre, int telefono){
        super(edad,nombre,telefono);
    }
    public Trabajador (int edad, String nombre, int telefono, double credito){
        super(edad,nombre,telefono);
        this.salario = credito;
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
