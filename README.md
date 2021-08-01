# Novedades Java 16

En este repositorio se incluyen varias pruebas con las nuevas caracteristicas de Java 16. Entre ellas se encuentran:

- Record: Puedes crear una clase con getters, equals y hashCode con una linea. Esta nueva funcionalidad está pensada para estructuras de datos que no cambian sus valores
- Sealed: Con esta funcionalidad tendremos mayor control sobre que clases pueden extender o sobre que clases pueden implementar una interfaz
- Stream.toList(): Ahora puedes convertir un stream directamente a una lista de objetos sin necesidad de usar el método Stream.collect(). Pero con la diferencia de que la lista que se crea es inmutable
- PatternMatchingInstanceOf: Con esta nueva funcionalidad cambia la forma de comparar si un objeto es una instancia de una clase en concreto y despues castearla. Ahora puedes castearla a la vez que haces el instanceOf
