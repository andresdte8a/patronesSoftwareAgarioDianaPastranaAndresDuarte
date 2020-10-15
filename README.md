# Juego Agario

#Basado en el repo https://github.com/omerbselvi/agario y reestructurado para uso de patrones

Se aplicaron los siguientes patrones de desarrollo:

# Single Responsibility Principle (SRP):

El principio SOLID de responsabilidad unica,  nos pide que cada clase debe tener una unica responsabilidad o razon de cambio, por lo que si estamos programando una clase que se ocupa de diferentes cosas es conveniente partirla en 2 o más clases, esto quiere decir que este principio es una guia, para separar los comportamientos  basandonos en las razones de cambio, si nuestra clase pasa por varios cambios en momentos diferentes entonces se presenta  mas de una responsabilidad o razon de cambio.

- En nuestro proyecto se evidencia como las clases no se mezclan entre si, ni su arquitectura, esto quiere decir que la capa de presentacion no se mezcla con la capa logica.
- Se presenta un bajo numero de métodos publicos, esto quiere decir que presenta bajo nivel de operaciones.
- Bajo nivel de import, no necesita de muchas clases externas, y esto disminuye su responsabilidades.
- Si se agrega otro tipo de vehiculo esto no afecta  las funciones ya implementadas, y esto permite que se reduzca el porcentaje de errores, por cambios realizados.

# Open/Closed Principle (OCP):

Este principio indica que las clases deberían estar abiertas para poder extenderse y cerradas para modificarse.
Dentro del ejercicio se aplica este principio en la clase cargarCombustible, ya que cualquier tipo de vehículo sin la necesidad de hacer modificaciones a la clase, puede hacer uso de esta.

# Interface Segregation Principle (ISP) :

Este principio consiste en que ninguna clase debería depender de métodos que no son utilizados por ella, por esto en la clase CargarCombustible define un comportamiento unico para los vehiculos el cual es cargar combustible sin que ello represente un metodo que no va a ser utilizado por los vehiculos


# KISS (Keep It Simple, Stupid):

Este principio consiste en que basicamente el código debe ser lo mas simple posible ningun patron o principio discute o va en contra de la simplicidad si algo se puede solucionar de la forma mas simple esta es la mejor manera de hacerlo y por ende se debe mantener asi, por eso aqui quisismos implementar de la manera mas simple estos principios donde cargar combustible es propio de todos los vehiculos,pero cada tipo de vehiculo maneja su particularidad (ejes o turbinas).

