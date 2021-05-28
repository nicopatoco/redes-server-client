### 1. ¿Que es un puerto?
> Un puerto es una interfaz a través de la cual se pueden enviar y recibir los diferentes tipos de datos.
La interfaz puede ser de tipo física (hardware) o puede ser a nivel lógico o de software, en cuyo caso se usa frecuentemente el término puerto lógico (por ejemplo, los puertos de redes que permiten la transmisión de datos entre diferentes computadoras).
### 2.¿Como estan formados los endpoints?
> Endpoints:  Cada conexión está formada por  -Una dirección que indica dónde se puede encontrar el punto de conexión (IP). -Un enlace que especifica cómo un se puede comunicar un cliente con el punto de conexión (Puerto). -Un contrato que identifica las operaciones disponibles (Ejemplo /user/123 , obtiene la información del usuario con la ID 123). -Un conjunto de comportamientos que especifican detalles de implementación local del punto de conexión (Este último puede no existir)

### 3. ¿Que es un socket?
> Socket designa un concepto abstracto por el cual dos programas pueden intercambiar cualquier flujo de datos, generalmente de manera fiable y ordenada.
El término socket es también usado como el nombre de una interfaz de programación de aplicaciones (API) para la familia de protocolos de Internet TCP/IP, provista usualmente por el sistema operativo.

### 4. ¿A qué capa del modelo TPC/IP pertenecen los sockets? ¿Porque?
> Pertenece a la capa de transporte, porque se puede ver como la conexión física entre dos equipos. Son una manera de comunicación de bajo nivel.

### 5. ¿Cómo funciona el modelo cliente-servidor con TCP/IP Sockets?
> Modelo Cliente – Servidor:
El cliente es un programa que hace peticiones a otro ordenador, que se denomina servidor. En el caso de la web, el cliente es el navegador, que le pide las páginas web, con su contenido al servidor. El servidor no hace nada por sí solo. Se queda esperando a que llegue un cliente con una petición para atenderle.
> Sockets
La comunicación entre dos programas que están en diferentes máquinas de red, se realiza mediante la utilización de sockets. Son objetos abstractos que implementan toda la funcionalidad para realizar la comunicación entre un cliente y un servidor.
Como cualquier otro “objeto”, los sockets hay que crearlos inicialmente, dándole unos parámetros de configuración. Luego utilizaremos sus métodos para conectarse a otra aplicación a partir de su IP y puerto.

### 6. ¿Cuales son las causas comunes por la que la conexión entre cliente/servidor falle?
> - El cliente utiliza una dirección de host y/o un puerto inválido para conectarse al servidor.
> - El puerto de recepción del servidor está bloqueado o cerrado.
> - El cliente intenta utilizar un endpoint que se encuentra ya en uso por otro.
> - El servidor no se encuentra habilitado y por esto el cliente no puede conectarse al mismo.
> - El servidor intenta enviar datos a un cliente que ya se ha desconectado.


### 7. Diferencias entre sockets UDP y TCP
> Existen dos tipos de sockets, los que utilizan el protocolo de datagramas de usuario o UDP (User Datagram Protocol) y los que utilizan el protocolo de control de la transmisión o TCP (Transmission Control Protocol). 
> * La principal diferencia entre ambos es que el UPD necesita que le entreguemos paquetes de datos que el usuario debe construir, mientras que el TCP admite bloques de datos que serán empaquetados de forma transparente antes de ser transmitidos.
> * Tanto los paquetes de datos UDP como los segmentos TCP pueden perderse. Si un paquete se pierde, el UPD no hace nada. Por lo contrario, si un segmento se pierde, el TCP lo retransmitirá, y este proceso durará hasta que el segmento ha sido correctamente entregado al host receptor, o hasta que se produzca un número máximo de retransmisiones. 
> * En aplicaciones en tiempo real, en el UPD controlamos qué datos viajan en cada paquete, en el TCP no es posible porque el empaquetamiento es automático.
>*  El protocolo TCP es un protocolo de transporte orientado a conexión, mientras que el protocolo UDP no es orientado a la conexión.

### 8. Diferencia entre sync & async sockets
> Los dos son bastante ortogonales. El envío de datos es más o menos asíncrono a través de cualquiera de los métodos. La diferencia solo está en el comportamiento cuando el búfer de salida está lleno: la sincronización se suspende, el asíncrono obtiene un retorno de error de la rutina de envío. La diferencia es más obvia en el lado de recepción. Sincroniza y suspende hasta que los datos estén disponibles. Asynch, obtiene un error de retorno, luego, opcionalmente, recibe una devolución de llamada cuando los datos estén disponibles.





