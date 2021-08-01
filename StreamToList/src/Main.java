import java.util.List;

/**
 * En este ejemplo se probará el nuevo metodo Stream.toList() que se ha introducido
 * Este objeto devolverá una lista inmutable
 * El metodo Steam.collect() usado hasta ahora devolvía una lista que no era inmutable.
 * Hay que tener en cuenta este cambio si después se quisiese modificar la lista
 */
public class Main {

    public static void main(String [] args){
        //Creamos una lista (inmutable)
        var list = List.of(1,2,3,4);

        //Convertimos la lista a un stream
        var stream = list.stream();

        //Volvemos a convertir el stream en una lista para probar el nuevo metodo de stream
        //La nueva lista es una lista inmutable, por lo que no se podrán modificar sus elementos
        var newList = stream.toList();

        System.out.println("Lista original: " + list);
        System.out.println("Nueva lista: " + newList);

    }

}
