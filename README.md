URL raíz de la API: https://e1-mutants.onrender.com


Para utilizar la API del proyecto:
	1- GET  - https://e1-mutants.onrender.com/api/v1/humano/mutant en cualquier navegador para obtener todos los registros cargados
	2- GET  - https://e1-mutants.onrender.com/api/v1/humano/mutant/stats para obtener el servicio del ratio de mutantes sobre personas escaneadas
	3- POST - https://e1-mutants.onrender.com/api/v1/humano/mutant (Utilizando POSTMAN y enviando algún ejemplo similar a los de abajo en el BODY) 


Ejemplos:

Mutante:

1 ------------------------------------------------------------
 
{
    "dna": [
        "ATGCGA",
        "CAGTGC",
        "TTGTAT",
        "AGAAGG",
        "CCCCTA",
        "TCACTG"
    ]
}

2 ------------------------------------------------------------

{
    "dna": [
        "ATGCGA",
        "CAGTGC",
        "TTATAT",
        "AGAAGG",
        "CCCATA",
        "TCACTG"
    ]
}

3 ------------------------------------------------------------

{
    "dna": [
        "ATGCGA",
        "CAGTGC",
        "TTGTGT",
        "AGAAGG",
        "CCCATA",
        "TCACTG"
    ]
}



No-Mutante:

1 ------------------------------------------------------------

{
    "dna": [
        "ATGCGA",
        "CAGTGC",
        "TTGTAT",
        "AGAAGG",
        "CCCATA",
        "TCACTG"
    ]
}

2 ------------------------------------------------------------

{
    "dna": [
        "ATTCGA",
        "CAGTGC",
        "TGGTAT",
        "AGAAGG",
        "CCCATA",
        "TCATAG"
    ]
}

3 ------------------------------------------------------------

{
    "dna": [
        "ATTCGA",
        "CAGTGC",
        "TGGTAT",
        "AGAAGG",
        "CCCATA",
        "CCATTG"
    ]
}
