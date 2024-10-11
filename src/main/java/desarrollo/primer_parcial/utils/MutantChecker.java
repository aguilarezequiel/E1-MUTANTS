package desarrollo.primer_parcial.utils;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MutantChecker {

    public boolean isMutant(String[] dna) {
        int n = dna.length;

        boolean horizontal = checkHorizontal(dna, n);
        boolean vertical = checkVertical(dna, n);
        boolean diagonalRight = checkDiagonalRight(dna, n);
        boolean diagonalLeft = checkDiagonalLeft(dna, n);

        return horizontal || vertical || diagonalRight || diagonalLeft;
    }

    private boolean checkHorizontal(String[] dna, int n) {
        return Arrays.stream(dna).anyMatch(row ->
                IntStream.range(0, n - 3).anyMatch(j ->
                        row.charAt(j) == row.charAt(j + 1) &&
                                row.charAt(j) == row.charAt(j + 2) &&
                                row.charAt(j) == row.charAt(j + 3)
                )
        );
    }

    private boolean checkVertical(String[] dna, int n) {
        return IntStream.range(0, n).anyMatch(j ->
                IntStream.range(0, n - 3).anyMatch(i ->
                        dna[i].charAt(j) == dna[i + 1].charAt(j) &&
                                dna[i].charAt(j) == dna[i + 2].charAt(j) &&
                                dna[i].charAt(j) == dna[i + 3].charAt(j)
                )
        );
    }

    private boolean checkDiagonalRight(String[] dna, int n) {
        return IntStream.range(0, n - 3).anyMatch(i ->
                IntStream.range(0, n - 3).anyMatch(j ->
                        dna[i].charAt(j) == dna[i + 1].charAt(j + 1) &&
                                dna[i].charAt(j) == dna[i + 2].charAt(j + 2) &&
                                dna[i].charAt(j) == dna[i + 3].charAt(j + 3)
                )
        );
    }

    private boolean checkDiagonalLeft(String[] dna, int n) {
        return IntStream.range(3, n).anyMatch(i ->
                IntStream.range(0, n - 3).anyMatch(j ->
                        dna[i].charAt(j) == dna[i - 1].charAt(j + 1) &&
                                dna[i].charAt(j) == dna[i - 2].charAt(j + 2) &&
                                dna[i].charAt(j) == dna[i - 3].charAt(j + 3)
                )
        );
    }
}
