

public class Mascotas {
    String Nombre;
    int Vida_promedio;
    String Clase_animal;
    int precio;
    int Cantidad_actual;
    int Cantidad_total;

    venta_max= 50;


    public Mascotas(String Nombre, int Vida_promedio, String Clase_animal,int precio,  int Cantidad_actual, int Cantidad_total ) {

        this.Nombre = Nombre;
        this.Vida_promedio = Vida_promedio;
        this.Clase_animal = Clase_animal;
        this.precio = precio;
        this.Cantidad_actual = Cantidad_actual;
        this.Cantidad_total = Cantidad_total;

    }
    public void ladrar() {
        System.out.println(Nombre + " dice: ¡Guau guau!");

    }








    }





}
