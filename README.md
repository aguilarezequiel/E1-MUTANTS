# URL raíz de la API: https://e1-mutants.onrender.com


## Para utilizar la API del proyecto:
	 1- GET  - https://e1-mutants.onrender.com/api/v1/humano/mutant en cualquier navegador para obtener todos los registros cargados
	 2- GET  - https://e1-mutants.onrender.com/api/v1/humano/mutant/stats para obtener el servicio del ratio de mutantes sobre personas escaneadas
	 3- POST - https://e1-mutants.onrender.com/api/v1/humano/mutant (Utilizando POSTMAN y enviando algún ejemplo similar a los de abajo en el BODY) 


# Pruebas Unitarias

## Manejo de Errores
1.	Manejo de errores:
	a.	Recibir un array vacío
	b.	Recibir un array de NxM en vez de un NxN
	c.	Recibir un array de números (entre comillas para que sean string)
	d.	Recibir null
	e.	Recibir un array de NxN de nulls
	f.	Recibir un array de NxN con letras distintas a las propuestas {“B”,”H”}


## Ejemplos
Mutante
A	A	A	A
C	C	C	C
T	C	A	G
G	G	T	C

No Mutante
A	A	A	T
A	A	C	C
A	A	A	C
C	G	G	G

Mutante
T	G	A	C
A	G	C	C
T	G	A	C
G	G	T	C

Mutante
A	A	A	A
A	A	A	A
A	A	A	A
A	A	A	A

No Mutante
T	G	A	C
A	T	C	C
T	A	A	G
G	G	T	C

Mutante
T	C	G	G	G	T	G	A	T
T	G	A	T	C	C	T	T	T
T	A	C	G	A	G	T	G	A
A	A	A	T	G	T	A	C	G
A	C	G	A	G	T	G	C	T
A	G	A	C	A	C	A	T	G
G	A	A	T	T	C	C	A	A
A	C	T	A	C	G	A	C	C
T	G	A	G	T	A	T	C	C


Mutante
T	T	T	T	T	T	T	T	T
T	T	T	T	T	T	T	T	T
T	T	T	T	T	T	T	T	T
T	T	T	T	T	T	T	T	T
C	C	G	A	C	C	A	G	T
G	G	C	A	C	T	C	C	A
A	G	G	A	C	A	C	T	A
C	A	A	A	G	G	C	A	T
G	C	A	G	T	C	C	C	C


