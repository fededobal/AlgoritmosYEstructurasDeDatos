package Parciales.Grafos.Fecha_28_11_2022;

public class Estadio {
    private String nombre;
    private String ciudad;

    public Estadio(String ciudad, String nombre) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }
}
