La feria de las flores celebrada en la ciudad de Medellín en Colombia es un evento que atrae a muchísimos interesados en los autos antiguos debido a su famoso desfile de exposición. Un importante coleccionista tiene como objetivo participar en dicha feria y presenta ante los organizadores su lista de colección. Todos, los Vehículos tienen como atributos Tipo, Placa, velocidad y cantidad de pasajeros.
La feria para el año 2022 ha decidido crear dos categorías de acuerdo al tipo de vehículo y añadir una característica particular para cada una:
La primera categoría es el tipo Comercial que es capaz de transportar una cierta carga límite particular
La segunda categoría es el tipo Particular en la que interesa tener almacenada la información del Color de dicho auto.
  
Procesar Comandos
En la clase Colección, se debe definir la función procesar comandos que realiza las siguientes operaciones:

Agregar vehículo: Opción 1
Se puede añadir un vehículo de tipo comercial con el siguiente comando:

1&Comercial&numeroPasajeros&velocidadMaxima&placa&peso_maximo

Ejemplo:
1&Comercial&2&150&FFF 222&250

Se puede añadir un vehículo de tipo particular con el siguiente comando:
1&Particular&numeroPasajeros&velocidadMaxima&placa&color

Ejemplo:
1&Particular&8&160&EEE 111&Verde

Listar ítems del inventario: Opción 2

Se debe mostrar la frase: “***Colección de vehículos antiguos***” Seguida por los vehículos en el orden en el que fueron agregados.
Si se trata de un vehículo particular se mostrará así. Recuerde que \t implica correr el ítem unos espacios a la derecha:

\tVehiculo Tipo Particular - Placa: FFE 000
\tvelocidad: 180 km/h
\tpasajeros: 4
\tcolor: Rojo

Si se trata de un vehículo comercial se mostrará así:
\tVehiculo Tipo Comercial - Placa: FFF 222
\tvelocidad: 150 km/h
\tpasajeros: 2
\tCarga máxima: 250kg

Salir: Opción 3
Nota: Observe que el único comando que tiene salida es el listar.
 
Ejemplo:
Un ejemplo de ejecución del programa es el siguiente:


Entrada	Salida
1&Particular&4&180&FFE 000&Rojo
1&Particular&2&240&GOK 223&Azul
1&Particular&8&160&EEE 111&Verde
1&Comercial&2&150&FFF 222&250
2
3	

***Colección de vehículos antiguos***
       Vehículo Tipo Particular - Placa: FFE 000
       velocidad: 180 km/h
       pasajeros: 4
       color: Rojo
       Vehículo Tipo Particular - Placa: GOK 223
       velocidad: 240 km/h
       pasajeros: 2
       color: Azul
       Vehículo Tipo Particular - Placa: EEE 111
       velocidad: 160 km/h
       pasajeros: 8
       color: Verde
       Vehículo Tipo Comercial - Placa: FFF 222
       velocidad: 150 km/h
       pasajeros: 2
       Carga máxima: 250kg
