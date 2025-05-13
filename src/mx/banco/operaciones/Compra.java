package mx.banco.operaciones;

public class Compra implements Comparable<Compra>{
    private String Articulo;
    private double costo;

    public Compra(String articulo, double costo) {
        Articulo = articulo;
        this.costo = costo;
    }

    public String getArticulo() {
        return Articulo;
    }

    public double getCosto() {
        return costo;
    }

    @Override
    public String toString() {
        return Articulo + " \t $" + String.format("%.2f", costo);
    }

    @Override
    public int compareTo(Compra articulo) {
        return this.getArticulo().compareTo(articulo.getArticulo());
    }
}
