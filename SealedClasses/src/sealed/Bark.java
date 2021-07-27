package sealed;

/**
 * Al añadir la clase dog nos obliga a implementar los métodos en la clase directamente
 * Solo podremos implementar esta interfaz en la clase Dog
 */
public sealed interface Bark permits Dog {

    public void bark();

}
