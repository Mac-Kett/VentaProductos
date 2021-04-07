# VentaProductos responde al siguiente enunciado:

Un comercio dedicado al rubro informático requiere visualizar estadísticas sobre sus operaciones. El lugar se dedica tanto a vender insumos informáticos como a ofrecer servicios pre y post venta.
De los insumos se conoce su nombre, su tipo (periférico, hardware o limpieza), su porcentaje de ganancia y su precio de lista.
De los servicios, podemos encontrar dos tipos:

▪ Servicio de armado: Consta de la cantidad de horas que ocupó el servicio. Para calcular su precio, se multiplican la cantidad de horas del servicio por el valor por hora, el cual es de $250.
▪ Servicio de reparación: Consta de la cantidad de horas que ocupó el servicio y una dificultad (entero entre 1 y 5). Para calcular su precio, se multiplican la cantidad de horas del servicio por el valor por hora, el cual es de $180. Si el nivel de dificultad es mayor a 3, se incrementa el precio en un 25%.
El comercio guarda un historial que contiene tanto los insumos vendidos como los servicios prestados, los cuales son facturables, es decir, deben ser capaces de devolver el monto de facturación, cuyas reglas son:
▪ Para los insumos, se suma su porcentaje de ganancia al precio de lista. Sobre ese valor se suma el IVA.
▪ Para los servicios, se suma la mitad del IVA sobre su precio.
En todos los casos, el IVA es del 21%.
Para sumar un porcentaje sobre un precio, contás con el método estático sumarPorcentaje de la clase Matematica, al cual se le envía un valor monetario y un porcentaje y devuelve un valor double con el porcentaje sumado al precio. Solo debés modelar la clase y el método en UML y utilizarlo donde creas conveniente. No es necesario explotar este método.
Basado en el enunciado descripto, realizá:
A) El diagrama de clases que lo modelice, con sus relaciones, atributos y métodos.
B) El método montoTotalFacturado que devuelva el valor que da nombre al mismo.
C) El método cantServiciosSimples que debe devolver la cantidad de servicios de reparación con nivel de dificultad menor a 2.
