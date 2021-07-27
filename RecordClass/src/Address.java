/**
 * Si utilizamos record podemos definir propiedades y se generaran los getters, equals y hashcode de forma automatica
 * Es importante recordar que los records son una estructura de datos y no podemos modificar las propiedades despues de crearlo
 * por lo que no hay setters
 */
public record Address(String street, String postCode, String town, String country) {

    /**
     * Podemos crear un constructor vacio si dentro de este inicializamos las variables de la clase
     */
    public Address(){
        this("", "", "", "");
    }

    public void printStreet(){
        System.out.println("The street is: " + street);
    }

}
