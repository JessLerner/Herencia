public class Herencia {
    public static void main(String[] args) {
        Cliente Jose=new Cliente();
        Jose.nombre="Jose";
        Jose.edad=54;
        Jose.telefono=1148742235;
        Jose.credito=100000;
        System.out.println("El cliente "+Jose.nombre+" de edad "+Jose.edad+" con telefono numero: "+Jose.telefono+" tiene un credito aprobado de: $"+Jose.credito);

        Trabajador Pedro=new Trabajador();
        Pedro.nombre="Pedro";
        Pedro.edad=28;
        Pedro.telefono=221541224;
        Pedro.salario=120000;
        System.out.println("El empleado "+Pedro.nombre+" de edad "+Pedro.edad+" con telefono numero: "+Pedro.telefono+" tiene un salario de: $"+Pedro.salario);


    }
}
class Persona{
    int edad;
    String nombre;
    int telefono;
}
class Cliente extends Persona{
    int credito;
}
class Trabajador extends Persona{
    int salario;
}