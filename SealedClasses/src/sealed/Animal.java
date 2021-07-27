package sealed;

/**
 * Solo las subclases permitidas pueden extender de la clase animal
 * Esto tambien se aplica para las interfaces, podriamos crear una interfaz para un service
 * y permitir que solo x subclases la puedan implementar
 */
public abstract sealed class Animal permits Dog, Cat {

    public abstract void eat();

}
