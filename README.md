<<<<<<< HEAD
# prog2.2024.practico02

Consigna: tomando como contexto la consigna del TP 1 realizar lo siguiente:

1. Luego de clonar el repo crear una nueva Branch protection rule con las siguientes especificaciones
   
    a. Branch name pattern -> main
   
    b. Tildar SOLAMENTE "Require a pull request before merging" y "Do not allow bypassing the above settings"

2. Reutilizando las clases del TP 1 se harán las siguientes modificaciones:
   
    a. Agregar la interface Cocinable, sólo se puede cocinar con los objetos que implementen esta interface
   
    b. Agregar la interface Despensable, esto permitirá generar una clase nueva Utensilio para agregar a las recetas los utensilios a usarse. Ahora en la despensa no habrá sólo ingredientes, sino todos aquellos objetos que sean Despensable's
   
    c. Convertir los arreglos usados en el TP anterior en colecciones. Sugerencia, para acceder a los Ingrediente's que están en la Despensa más rápidamente cambiar el arreglo de Ingrediente's de la despensa por un Map de Despensable's donde la clave sea un string con el nombre del objeto.
   
    d. Agregar la interface Reutilizable para los Utensilio's que tenga el atributo vidaUtil que se irá consumiendo a medida que sea utilizado para cocinar
   
    e. Cambiar las recetas para agregar los Utensilio's usados, cada receta además de disminuir el stock de la Despensa, debería verificar si en la Despensa están los utensilios necesarios para la cocina y el servicio CocinaService debe disminuir el tiempo de vidaUtil del utensilio usado
   
    f. Agregar una excepción propia VidaUtilInsuficiente para el caso que el tiempo de vida restante no alcance para cocinar
   
    g. Agregar una excepción propia StockInsuficiente para el caso que la Despensa no tenga el Ingrediente suficiente para la receta
   
    h. Agregar un servicio DespensaService que se encargue de las verificaciones de stock y tiempo de vida útil antes de cocinar, también agregar un método renovarUtensilios que permita "resetear" el tiempo de vita útil de los Utensilio's inutilizables
   
    i. Tratar de usar stream's donde sea posible
=======
# prog2.2024.practico01

Consigna
Realizar cada item en una branch diferente, cada branch debe partir de la anterior sin necesidad de hacer merge previamente.

1. Crear la entidad Ingrediente con los atributos nombre y cantidad. Hacer constructores, getter, setter y sobrecargar toString(). Hacer una clase que contenga main que cree Ingrediente's y los muestre por pantalla
2. Agregar a la entidad Ingrediente el método sacar() que permita disminuir la cantidad del Ingrediente verificando que haya una cantidad suficiente para ser sacada. Además crear una entidad Despensa que tenga un arreglo de Ingrediente. Implementar el método addIngrediente para agregar un Ingrediente a la despensa. Implementar el método getIngrediente que me permita sacar una cantidad determinada del Ingrediente sin eliminarlo de la despensa. Hacer una clase que contenga main que verifique el funcionamiento de lo solicitado.
3. Implementar una clase Receta que tenga los atributos tiempoCoccion y el atributo ingredientes como arreglo de Ingrediente y el atributo preparacion. Esta será la clase base para otras clases que se agregarán como por ejemplo HuevoDuro que tendrá en el arreglo 2 ingredientes (huevo y agua), tiempo de coccion 10 minutos y en preparación poner un huevo en agua hirviendo durante 10 minutos. Construir al menos 3 clases heredadas con recetas diferentes Hacer una clase que contenga main que pruebe lo solicitado
4. Crear una entidad Chef que contenga los atributos nombre y estrellasMichelin, hacer los constructores, setter, getters y sobrecargar toString. Agregar una clase CocinaService que la usará el Chef para preparar alguna de las recetas implementadas. Primero el Chef debe verificar que tiene los Ingrediente's necesarios para preparar la receta, si no los tiene deberá mostrar el mensaje que no alcanzan los ingredientes de la despensa y mostrar cuánto falta de los ingredientes necesarios. En el caso de que alcancen deberá mostrar la preparación y la cantidad de Ingrediente's que quedan en la despensa al final de la preparación. No es necesaria la interacción del usuario, pero se debe construir un escenario que nos muestre la salida teniendo en cuenta todas las posibilidades.
>>>>>>> TP1/ejercicio-4
