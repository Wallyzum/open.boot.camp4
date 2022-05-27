public class Cliente extends Persona{
    private double credito;
    public Cliente (){};
    public Cliente (int edad, String nombre, int telefono){
        super(edad,nombre,telefono);
    }
    public Cliente (int edad, String nombre, int telefono, double credito){
        super(edad,nombre,telefono);
        this.credito = credito;
    }
    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }


}
