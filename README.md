# 🧬 Mutant Detection API

🌐 **URL raíz de la API:** [https://e1-mutants.onrender.com](https://e1-mutants.onrender.com)

## 🚀 Cómo utilizar la API
1. **GET** - [Obtener todos los registros cargados](https://e1-mutants.onrender.com/api/v1/humano/mutant)  
   `https://e1-mutants.onrender.com/api/v1/humano/mutant`
   
2. **GET** - [Obtener estadísticas de mutantes](https://e1-mutants.onrender.com/api/v1/humano/mutant/stats)  
   `https://e1-mutants.onrender.com/api/v1/humano/mutant/stats`
   
3. **POST** - [Enviar ADN para validación de mutante](https://e1-mutants.onrender.com/api/v1/humano/mutant)  
   `https://e1-mutants.onrender.com/api/v1/humano/mutant`  
   - Usa **Postman** y envía un ejemplo como los de abajo en el `BODY`.

---

## 🧪 Pruebas Unitarias

### ⚠️ Manejo de Errores

1. **Manejo de errores:**
   - ⛔ **Array vacío**
   - 🔄 **Array de dimensiones NxM** en lugar de NxN
   - 🔢 **Array de números** (con comillas para que sean strings)
   - ❌ **Array nulo**
   - 🚫 **Array NxN de valores nulos**
   - 🅱️ **Letras no válidas** (debe contener solo: "A", "T", "C", "G")

---

## 📋 Ejemplos de ADN

### 🧬 Ejemplos de Mutantes

- **Mutante 1**  
  ```java
  String[] dnaMutant1 = {
      "AAAA", // Secuencia horizontal de A's
      "CCCC", // Secuencia horizontal de C's
      "TCAG",
      "GGTC"
  };
- **Mutante 2**  
  ```java
  String[] dnaMutant2 = {
      "TGAC",
      "AGCC",
      "TGAC",
      "GGTC"
  };
- **Mutante 3**  
  ```java
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
- **Mutante 4**  
  ```java
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
- **Mutante 5**  
  ```java
  String[] dnaNoMutant5 = {
    "AAAA",
    "AAAA",
    "AAAA",
    "AAAA"
  };
### ❌ Ejemplos de No Mutantes
- **Mutante 2**  
  ```java
  String[] dnaNoMutant1 = {
    "AAAT",
    "AACC",
    "AAAC",
    "CGGG"
  };
- **Mutante 2**  
  ```java
  String[] dnaNoMutant2 = {
    "TGAC",
    "ATCC",
    "TAAG",
    "GGTC"
  };
