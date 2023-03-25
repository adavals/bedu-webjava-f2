# Postwork Sesión 3: Anotaciones y pruebas unitarias con JUnit

## OBJETIVO
- Crear una prueba dínamica sobre alguna de las operaciones de la calculadora.
- Utilizar JUnit para probar el código.
- Utilizar el método anotado @TestFactory, empleado para crear fábricas de pruebas.
- Ejecutar la prueba al menos 1000 veces, con números distintos.
- Garantizar el resultado exitoso de todas las ejecuciones.

## DESARROLLO
1. Se creó la clase que contiene los métodos de prueba _MathApplicationTest1000_ con la extension _MockitoExtension.class_.
2. Se anotaron los campos a probar con _Mock_.
3. Se creó la @TestFactory con un tipo de retorno Stream.
4. Se creó el método _generate_ con dos datos tipo float.
5. Se creó el Stream con el código dinámico de la prueba.
