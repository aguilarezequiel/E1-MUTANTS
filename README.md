🧬 Mutant Detection API
🌐 URL raíz de la API: https://e1-mutants.onrender.com

🚀 Cómo utilizar la API:
GET - Obtener todos los registros cargados
https://e1-mutants.onrender.com/api/v1/humano/mutant

GET - Obtener estadísticas de mutantes
https://e1-mutants.onrender.com/api/v1/humano/mutant/stats

POST - Enviar ADN para validación de mutante
https://e1-mutants.onrender.com/api/v1/humano/mutant

Usa Postman y envía un ejemplo como los de abajo en el BODY.
🧪 Pruebas Unitarias
⚠️ Manejo de Errores
Manejo de errores:
⛔ Array vacío
🔄 Array de dimensiones NxM en lugar de NxN
🔢 Array de números (con comillas para que sean strings)
❌ Array nulo
🚫 Array NxN de valores nulos
🅱️ Letras no válidas (debe contener solo: "A", "T", "C", "G")
📋 Ejemplos de ADN
🧬 Ejemplos de Mutantes
Mutante 1
String[] dnaMutant1 = {
    "AAAA", // Secuencia horizontal de A's
    "CCCC", // Secuencia horizontal de C's
    "TCAG",
    "GGTC"
};
Mutante 2
String[] dnaMutant2 = {
    "TGAC",
    "AGCC",
    "TGAC",
    "GGTC"
};
Mutante 3
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
Mutante 4
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
❌ Ejemplos de No Mutantes
No Mutante 1
String[] dnaNoMutant1 = {
    "AAAT",
    "AACC",
    "AAAC",
    "CGGG"
};
No Mutante 2
String[] dnaNoMutant2 = {
    "AAAA",
    "AAAA",
    "AAAA",
    "AAAA"
};
No Mutante 3
String[] dnaNoMutant3 = {
    "TGAC",
    "ATCC",
    "TAAG",
    "GGTC"
};
