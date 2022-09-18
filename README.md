La feria de las flores celebrada en la ciudad de Medell�n en Colombia es un evento que atrae a much�simos interesados en los autos antiguos debido a su famoso desfile de exposici�n. Un importante coleccionista tiene como objetivo participar en dicha feria y presenta ante los organizadores su lista de colecci�n. Todos, los Veh�culos tienen como atributos Tipo, Placa, velocidad y cantidad de pasajeros.
La feria para el a�o 2022 ha decidido crear dos categor�as de acuerdo al tipo de veh�culo y a�adir una caracter�stica particular para cada una:
La primera categor�a es el tipo Comercial que es capaz de transportar una cierta carga l�mite particular
La segunda categor�a es el tipo Particular en la que interesa tener almacenada la informaci�n del Color de dicho auto.
��
Procesar Comandos
En la clase Colecci�n, se debe definir la funci�n procesar comandos que realiza las siguientes operaciones:

Agregar veh�culo:�Opci�n 1
Se puede a�adir un veh�culo de tipo comercial con el siguiente comando:

1&Comercial&numeroPasajeros&velocidadMaxima&placa&peso_maximo

Ejemplo:
1&Comercial&2&150&FFF 222&250

Se puede a�adir un veh�culo de tipo particular con el siguiente comando:
1&Particular&numeroPasajeros&velocidadMaxima&placa&color

Ejemplo:
1&Particular&8&160&EEE 111&Verde

Listar �tems del inventario:�Opci�n 2

Se debe mostrar la frase: �***Colecci�n de veh�culos antiguos***� Seguida por los veh�culos en el orden en el que fueron agregados.
Si se trata de un veh�culo particular se mostrar� as�. Recuerde que \t implica correr el �tem unos espacios a la derecha:

\tVehiculo Tipo Particular - Placa: FFE 000
\tvelocidad: 180 km/h
\tpasajeros: 4
\tcolor: Rojo

Si se trata de un veh�culo comercial se mostrar� as�:
\tVehiculo Tipo Comercial - Placa: FFF 222
\tvelocidad: 150 km/h
\tpasajeros: 2
\tCarga m�xima: 250kg

Salir:�Opci�n 3
Nota:�Observe que el �nico comando que tiene salida es el listar.
�
Ejemplo:
Un ejemplo de ejecuci�n del programa es el siguiente:


Entrada	Salida
1&Particular&4&180&FFE 000&Rojo
1&Particular&2&240&GOK 223&Azul
1&Particular&8&160&EEE 111&Verde
1&Comercial&2&150&FFF 222&250
2
3	

***Colecci�n de veh�culos antiguos***
������ Veh�culo�Tipo Particular - Placa: FFE 000
������ velocidad: 180 km/h
������ pasajeros: 4
������ color: Rojo
������ Veh�culo�Tipo Particular - Placa: GOK 223
������ velocidad: 240 km/h
������ pasajeros: 2
������ color: Azul
������ Veh�culo Tipo Particular - Placa: EEE 111
������ velocidad: 160 km/h
������ pasajeros: 8
������ color: Verde
������ Veh�culo�Tipo Comercial - Placa: FFF 222
������ velocidad: 150 km/h
������ pasajeros: 2
������ Carga m�xima: 250kg
