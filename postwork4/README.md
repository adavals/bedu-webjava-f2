## Postwork Sesión 4: Introducción a Spring Boot 

## OBJETIVO
- Implementar la interface CommandLineRunner.
- Permitir que los usuarios ingresen valores mediante la línea de comandos.
- Establecer los valores como atributos de un objeto de la clase Persona.

## DESARROLLO
1. Se agregó a build.gradle la sentencia para configurar la lectura de entrada de datos desde la consola.
2. Se creó la clase persona con atributos tipo String.
3. Se agregó un constructor vacío y otro que recibe los valores tipo String.
4. Se crearon los getters y setters de los atributos.
5. Con la anotación @Override se sobreescribió _toString_.
6. En la _Application_ del proyecto se implementó _CommandLineRunner_.
7. Dentro del método _run()_ se lee la entrada y se establecen valores de atributos de "Persona".
8. Se imprimen los mensajes en la consola cuando se llama al método.
9. Se creó una nueva instancia de persona con un constructor que recibe atributos.


 ### Evidencia 
 ![Pantalla](Postwork%204.png)
