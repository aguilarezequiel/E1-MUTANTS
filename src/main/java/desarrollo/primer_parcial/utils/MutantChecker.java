package desarrollo.primer_parcial.utils;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MutantChecker {

    private static final int SEQUENCE_LENGTH = 4;
    private static final String VALID_CHARACTERS = "ATCG";

    public boolean isMutant(String[] dna) {
        validateDna(dna);  // Validamos el array de entrada antes de procesar

        int n = dna.length;
        int sequenceCount = 0;

        sequenceCount += countHorizontalSequences(dna, n);
        sequenceCount += countVerticalSequences(dna, n);
        sequenceCount += countDiagonalRightSequences(dna, n);
        sequenceCount += countDiagonalLeftSequences(dna, n);

        // Si encontramos más de una secuencia de 4 letras iguales, es un mutante
        return sequenceCount > 1;
    }

    // Método para validar el ADN antes de procesarlo

    private void validateDna(String[] dna) {
        // 1. Verificar si el array es null
        if (dna == null) {
            throw new IllegalArgumentException("El array de ADN no puede ser null.");
        }

        // 2. Verificar si el array está vacío
        if (dna.length == 0) {
            throw new IllegalArgumentException("El array de ADN está vacío.");
        }

        int n = dna.length;

        // 3. Verificar si el array es NxN
        for (String row : dna) {
            if (row == null) {
                throw new IllegalArgumentException("El array contiene filas null.");
            }
            if (row.length() != n) {
                throw new IllegalArgumentException("El array de ADN no es NxN.");
            }
        }

        // 4. Verificar si contiene caracteres válidos (solo A, T, C, G)
        if (!isValidDna(dna)) {
            throw new IllegalArgumentException("El array contiene caracteres inválidos. Solo se permiten A, T, C, G.");
        }
    }

    // Método para comprobar si las letras en el ADN son válidas
    private boolean isValidDna(String[] dna) {
        return Arrays.stream(dna).allMatch(row ->
                row.chars().allMatch(ch -> VALID_CHARACTERS.indexOf(ch) >= 0)
        );
    }

    // Contar secuencias horizontales
    private int countHorizontalSequences(String[] dna, int n) {
        return (int) Arrays.stream(dna).flatMapToInt(row ->
                IntStream.range(0, n - SEQUENCE_LENGTH + 1).filter(j ->
                        row.charAt(j) == row.charAt(j + 1) &&
                                row.charAt(j) == row.charAt(j + 2) &&
                                row.charAt(j) == row.charAt(j + 3)
                )
        ).count();
    }

    // Contar secuencias verticales
    private int countVerticalSequences(String[] dna, int n) {
        return (int) IntStream.range(0, n).flatMap(j ->
                IntStream.range(0, n - SEQUENCE_LENGTH + 1).filter(i ->
                        dna[i].charAt(j) == dna[i + 1].charAt(j) &&
                                dna[i].charAt(j) == dna[i + 2].charAt(j) &&
                                dna[i].charAt(j) == dna[i + 3].charAt(j)
                )
        ).count();
    }

    // Contar secuencias diagonales hacia la derecha
    private int countDiagonalRightSequences(String[] dna, int n) {
        return (int) IntStream.range(0, n - SEQUENCE_LENGTH + 1).flatMap(i ->
                IntStream.range(0, n - SEQUENCE_LENGTH + 1).filter(j ->
                        dna[i].charAt(j) == dna[i + 1].charAt(j + 1) &&
                                dna[i].charAt(j) == dna[i + 2].charAt(j + 2) &&
                                dna[i].charAt(j) == dna[i + 3].charAt(j + 3)
                )
        ).count();
    }

    // Contar secuencias diagonales hacia la izquierda
    private int countDiagonalLeftSequences(String[] dna, int n) {
        return (int) IntStream.range(0, n - SEQUENCE_LENGTH + 1).flatMap(i ->
                IntStream.range(SEQUENCE_LENGTH - 1, n).filter(j ->
                        dna[i].charAt(j) == dna[i + 1].charAt(j - 1) &&
                                dna[i].charAt(j) == dna[i + 2].charAt(j - 2) &&
                                dna[i].charAt(j) == dna[i + 3].charAt(j - 3)
                )
        ).count();
    }
}
