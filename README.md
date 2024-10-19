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
String[] dnaMutant1 = {
    "AAAA", // Secuencia horizontal de A's
    "CCCC", // Secuencia horizontal de C's
    "TCAG",
    "GGTC"
};


No Mutante
String[] dnaNoMutant1 = {
    "AAAT",
    "AACC",
    "AAAC",
    "CGGG"
};


Mutante
String[] dnaMutant2 = {
    "TGAC",
    "AGCC",
    "TGAC",
    "GGTC"  
};


Mutante
String[] dnaNoMutant2 = {
    "AAAA",
    "AAAA",
    "AAAA",
    "AAAA"  
};


No Mutante
String[] dnaNoMutant3 = {
    "TGAC",
    "ATCC",
    "TAAG",
    "GGTC"  
};


Mutante
String[] dnaMutant3 = {
    "TCGGTGATA", 
    "TGATCCTTT", 
    "TACGAGTGA", 
    "AAATGTACT", 
    "ACGAGTGCT", 
    "AGACACTAG", 
    "GAACTCCAA", 
    "ACTACGACC", 
    "TGAGTATCC"
};



Mutante
String[] dnaMutant4 = {
    "TTTTTTTTT", // Secuencia horizontal de T's
    "TTTTTTTTT", 
    "TTTTTTTTT", 
    "TTTTTTTTT", 
    "CCGACCATG", 
    "GGCACTCCA", 
    "AGGACACTA", 
    "CAAAGGCAT", 
    "GCAGTCCCC"  // Secuencia vertical de C's
};


