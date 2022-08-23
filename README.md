# TP1-POO2-Figuras

Trabajo Práctico 1 (individual)
El trabajo práctico 1 consiste en desarrollar en Java una aplicación que genere un vector
polimórfico a partir de la lectura de un archivo de texto. El arreglo podrá contener distintos
objetos, los cuales pueden ser círculos, rectángulos o triángulos.
El vector se irá cargando a medida que se lee un archivo de texto figuras.txt cuyo formato
será, en la primera línea, un entero que indica la cantidad de elementos.

cantidad_de_elementos
Y, luego, en cada línea
X numero
o
X numero numero

Donde X puede ser C (Circulo), R (Rectangulo) o T (Triangulo). El número que acompañará a
la letra será de tipo double y representará: el radio (si es un Círculo) o la longitud de la base
y la altura (si es un Rectángulo o un Triángulo).
Por ejemplo:
4
R 5.3 2.1
T 4.1 8
C 3.2
T 5.0 3

La primera línea indica que hay 4 elementos: un Rectángulo con lados 5.3 y 2.1, indicado en
la segunda línea, un Triángulo con base 4.1 y altura 8, en la tercera, un Circulo con radio 3.2,
en la cuarta, y otro Triángulo con base 5 y altura 3, en la última línea.
A medida que se lea el archivo (solo se puede leer una vez) se irán creando los objetos y
colocando en el vector en el mismo orden en que se encuentran en el archivo. Una vez
finalizada la carga, la aplicación deberá ofrecer un menú para:
- Consultar qué objeto hay en determinada posición, indicando sus atributos y su
  superficie.
- Dar de baja el objeto de cierta posición.
- Agregar un nuevo objeto de forma manual (para esto debe verificar si hay espacio
  libre en el vector, de lo contrario, deberá redimensionarlo).
- Listar todos los objetos.
- Indicar la superficie máxima.
- Indicar la superficie mínima.
- Finalizar la aplicación
  Consideraciones
- El archivo está bien formado.
- Los objetos deben pertenecer a clases que heredan de una clase en común: Figura.
- La clase Figura deberá ser abstracta y tener métodos específicos para el uso del
  polimorfismo.
- Las clases herederas deben implementar los métodos: mostrar y superficie.
  Tendremos en cuenta
- Funcionalidad
- Interfaz con el usuario
- Nombres de métodos y variables
- Pre y post condiciones
- Modularización
- Uso correcto del espaciado
- Diagramas UML
  Entrega
  La fecha de entrega límite es el viernes 26 de agosto a las 23.55hs por el campus (se entregan
  los archivos en un solo archivo comprimido, como nombre va el apellido.zip/rar etc).
  Deben entregar:
- Archivos fuente
- Un archivo txt de prueba con 5 o 6 datos
- Diagrama de clases UML (puede ser diagrama por cada clase y otro de relación de
  clases o todo en un solo diagrama)