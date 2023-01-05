public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Irvin");
        cliente.setEdad(17);
        cliente.setTelefono(809555787);

    }
}
class Persona {
    private String Nombre;
    private int Edad;
    private long Telefono;

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }
    public String getNombre(){
        return this.Nombre;
    }
    public void setEdad(int edad) {
        this.Edad = edad;
    }
    public int setNombre(){
        return this.Edad;
    }

    public void setTelefono(long telefono) {
        this.Telefono = telefono;
    }
    public long getTelefono(){
        return this.Telefono;
    }
}

class Cliente extends Persona{
    private double Credito;

    public void setCredito(double credito) {
        this.Credito = credito;
    }
    public double getCredito(){
        return this.Credito;
    }
}

class Trabajador extends Persona{
    private double Salario;
    public void setSalario(double salario){
        this.Salario = salario;
    }
    public double getSalario(){
        return this.Salario;
    }
}