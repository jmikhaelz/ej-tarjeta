package mx.banco.operaciones;
import java.util.ArrayList;
import java.util.List;

public class Tarjeta {
    private String Banco;
    private int Tipo;
    private double Saldo;
    private double Limite;
    private List<Compra> HistorialDeCompras;
    private String[] Opciones = {"Credito", "Debito"};

    public Tarjeta(int tipo, double monto) {
        this.Banco = "ONE-LATAM";
        if(tipo<0 && tipo>Opciones.length)
            this.Tipo = 0;
        else
            this.Tipo = tipo;
        this.Saldo = monto;
        this.Limite = monto;
        this.HistorialDeCompras = new ArrayList<>();
    }

    public String getBanco() {
        return Banco;
    }

    public int getTipo() {
        return Tipo;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

    public double getLimite() {
        return Limite;
    }
    
    public List<Compra> getHistorialDeCompras() {
        return HistorialDeCompras;
    }

    public boolean addCompra(Compra articulo){
        if(this.Saldo >= articulo.getCosto()){
            this.Saldo -= articulo.getCosto();
            this.HistorialDeCompras.add(articulo);
            return true;
        }
        return false;
    }

    public void status() {
        System.out.println("===================================");
        System.out.println("        Estado de la Tarjeta       ");
        System.out.println("===================================");
        System.out.println("Banco           : " + Banco);
        System.out.println("Tipo            : " + Opciones[Tipo]);
        
        if (getTipo() == 0) {
            System.out.printf("Credito         : $%.2f\n", Saldo);
        }else{
            System.out.printf ("Saldo           : $%.2f\n", Saldo);
        }
        
        System.out.println("===================================");
    }
    
}