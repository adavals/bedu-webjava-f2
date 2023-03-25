## Postwork Sesión 5: Java Beans y la Inversión de Control (IoC) en Spring Boot 

## OBJETIVO
- Validar que el número de teléfono solo contenga caracteres válidos.
- Validar que el número de teléfono contenga 10 dígitos.
- Eliminar caracteres no numéricos.
- Formatear el número de la siguiente manera: (##)-####-####.
- Separar las validaciones en dos clases servicio.
- Las clases servicio deben ser inyectadas en la clase principal.

## DESARROLLO
1. Se crearon las dos clases servicio: FormateadorTelefono y ValidadorTelefono.
2. Se decoraron ambas clases con la anotación **@Service**.
3. En la clase _ValidadorTelefono_ se establecieron dos métodos: _isValido_ (valida caracteres válidos) y _limpiaNumero_ (elimina caracteres no válidos).
5. En la clase _FormateadorTelefono_ se estableció el método _formatea_ para dar formato: (##)-####-####.
7. En _Application_ se implemento la interfaz **CommandLineRunner** para leer la entrada del usuario.
8. Con **@Autowired** se usa la inyección de dependencias en _Application_ para obtener instancias de los servicios.
9. Con la estructura de control _if_ se utilizan los servicios para validar la entrada del usuario y crear una nueva "Persona". 

 ### Evidencia 
 ![Pantalla](Poswork5%20evidencia.png)
