# Práctica 5. Desarrollo de API REST con Spring Boot

En esta práctica se han conectado dos de los formularios presentes en la página web con sendos endpoints con SpringBoot.

El más básico se encuentran en ``InicioSesion.html``. Consta de dos campos para poder usuario y contraseña. Ambos están validados puesto que no se permite dejarlos en blanco, el correo electrónico debe tener un formato válido y la contraseña es alfanumérica con un mínimo de 10 caracteres y un máximo de 50.
Este formulario permite acceder con cualquier usuario y contraseña que cumpla dichas condiciones.

El otro formulario está en ``CheckInOnline.html`` y consta de 3 campos. Un campo de selección de 2 opciones, y dos campos de texto. De estos, uno solo permite caracteres numéricos puesto que se trata de un ID/Localizador y el otro al tratarse del nombre de un hotel solo permite caracteres alfabéticos y espacios.
En este caso, al contrario que el otro formulario, se ha decidido poner una restricción de manera que el formulario sólo será válido si:

* Opción: Localizador
* Localizador: 037484579
* Hotel: Melia Princesa Madrid

No obstante esto se ha hecho para variar el formato de validación, se podría dejar abierto pero habría que implementar una manera de comprobar que tanto el localizador como el nombre del hotel existen y son válidos, verificándolos con algún tipo de API o base de datos.