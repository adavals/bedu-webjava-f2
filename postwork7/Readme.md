# Postwork Sesión 7: Integración de Thymeleaf y Spring Boot
## OBJETIVO
- Colocar un formulario que permita crear nuevas entradas en la agenda de nuestro proyecto.
- Almacenar la información en la memoria de la aplicación.
- Mostrar en la pantalla la lista de personas registradas en la agenda (puede ser en la parte inferior de la pantalla del formulario).
- Validar que todos los datos obligatorios se hayan introducido.
- Mostrar un mensaje de error en caso de que algún dato introducido tenga un formato incorrecto.
## DESARROLLO
1. Se agregó la dependencia ***'Thymeleaf'*** para el manejo de las plantillas
2. Se agregó la dependencia ***'Validation'***  para la validación de los campos del registro y mostrar los errores
3. Se creó la plantilla index con el formulario y un apartado para mostrar los registros guardados
4. Se modificó el controlador para que fuera compatible conn la plantilla.

***Extra: Se agregó un archivo CSS siguiendo los patrones de imágen de Bedu***

#### El proyecto funcionando se ve de la siguiente manera:


https://user-images.githubusercontent.com/118947386/226814466-a316cdb6-2fb9-4e54-99ed-c0cf7e784e88.mp4

