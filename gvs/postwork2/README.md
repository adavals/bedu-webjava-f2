# POSTWORK 2
## PATRONES DE DISEÑO
### Objetivo
* Resolver un problema utilizando patrones de diseño
* Construir la solución utilizando Gradle
### Instrucciones
Una cadena de helados muy famosa en el país ha solicitado tu ayuda para implementar una nueva versión de su sistema actual. Sus productos disponibles son los siguientes:

* Helado Suave $30
* Con Cobertura $20 extra
* Con Granola $10 extra
* Con Topping $20 extra

El sistema actualmente está diseñado con Programación Orientada a Objetos usando el lenguaje Java y tienen una clase por cada variante de los productos, como se muestra a continuación:
```
class HeladoSuave {
  //...
}

class HeladoSuaveConCobertura {
  // ...
}

class HeladoSuaveConGranola {
  // ...
}

class HeladoSuaveConTopping {
  // ...
}

class HeladoSuaveConCoberturaYToping {
  // ...
}

class HeladoSuaveConToppingYGranola {
  // ...
}

class HeladoSuaveConCoberturaYGranola {
  // ...
}
```
La cadena busca agregar nuevos extras:

* Con Mermelada $10 extra
* Con Galleta $15 extra

La inclusión de estos productos complica el desarrollo del sistema actual debido a que habría que agregar todas las variantes de los productos viejos con los nuevos. Por lo tanto el sistema no es mantenible.

Tú misión será crear la nueva versión del sistema utilizando el patrón Decorador de los patrones estructurales, así como un programa que permita probar la nueva implementación.

### Desarrollo
#### 1. Diseño de aplicación y clases
1. Aplicación con clase main: 
   * Crea el objeto Helado que tiene la implementación del patrón decorador.
   * Llama a los métodos getDescription y getPrice para mostrar las características del helado.
   * Crea los objetos decoradores para agregar características al helado inicial.
   * Llama a los métodos getDescription y getPrice para mostrar las características añadidas al helado.
2. Patrón decorador:
   * Interfaz Helado indicando la implementación de los métodos getDescription y getPrice.
   * Clase HeladoSuave que implementa los métodos base de getDescription y getPrice.
   * DecoradorCobertura, DecoradorGalleta, DecoradorGranola, DecoradorMermelada y DecoradorTopping: Clases que implementan la interfaz Helado y contienen un objeto helado sobre el que 'añaden comportamiento'
   ![Diagrama de patrón decorador](img/Helado_structure.png)

#### 2. Implementación de clases y aplicación
##### 2.1 [Ver código de clases](src/main/java)

##### 2.2 Aplicación.java
```
public class Aplicacion {
    public static void main(String[] args){
        Helado heladoSuave = new HeladoSuave();
        System.out.println("Ya tengo un: " + heladoSuave.getDescription());
        System.out.printf("Por: $ %d \n", heladoSuave.getPrice());

        System.out.println("Le agregamos cobertura... ");
        heladoSuave = new DecoradorCobertura(heladoSuave);
        System.out.println("Ahora tengo un: " + heladoSuave.getDescription());
        System.out.printf("Por: $ %d \n", heladoSuave.getPrice());

        System.out.println("Le agregamos granola... ");
        heladoSuave = new DecoradorGranola(heladoSuave);
        System.out.println("Ahora tengo un: " + heladoSuave.getDescription());
        System.out.printf("Por: $ %d \n", heladoSuave.getPrice());

        System.out.println("Le agregamos topping... ");
        heladoSuave = new DecoradorTopping(heladoSuave);
        System.out.println("Ahora tengo un: " + heladoSuave.getDescription());
        System.out.printf("Por: $ %d \n", heladoSuave.getPrice());

        System.out.println("Le agregamos mermelada... ");
        heladoSuave = new DecoradorMermelada(heladoSuave);
        System.out.println("Ahora tengo un: " + heladoSuave.getDescription());
        System.out.printf("Por: $ %d \n", heladoSuave.getPrice());

        System.out.println("Y le agregamos galleta... ");
        heladoSuave = new DecoradorGalleta(heladoSuave);
        System.out.println("Ahora tengo un: " + heladoSuave.getDescription());
        System.out.printf("Por: $ %d \n", heladoSuave.getPrice());

        System.out.println("...y 200 de nivel de glucosa en sangre");
   }
}
```

#### 3. Resultado
Ejecución de la aplicación
```
Ya tengo un: Helado Suave
Por: $ 30
Le agregamos cobertura...
Ahora tengo un: Helado Suave + Cobertura
Por: $ 50
Le agregamos granola...
Ahora tengo un: Helado Suave + Cobertura + Granola
Por: $ 60
Le agregamos topping...
Ahora tengo un: Helado Suave + Cobertura + Granola + Topping
Por: $ 80
Le agregamos mermelada...
Ahora tengo un: Helado Suave + Cobertura + Granola + Topping + Mermelada
Por: $ 90
Y le agregamos galleta...
Ahora tengo un: Helado Suave + Cobertura + Granola + Topping + Mermelada + Galleta
Por: $ 105
...y 200 de nivel de glucosa en sangre
```

