
public class Main {
    public static void printPascalTriangle(int rowNumber) {
        int[] lastRow = {0, 1, 0};
        printFormattedRow(0, lastRow);
        for (int i = 1; i <= rowNumber; i++) {
            int[] currentRow = new int[i + 3];
            for (int j = 1; j < i + 2; j++) {
                currentRow[j] = lastRow[j - 1] + lastRow[j];
            }
            lastRow = currentRow;
            printFormattedRow(i, lastRow);

        }
    }

    //just the printing
    public static void printFormattedRow(int index, int[] row) {
        System.out.print(index + ": ");
        for (int i = 0; i < index + 1; i++) {
            if (row[i + 1] >= 0) {
                System.out.format("%11d", row[i + 1]);
            } else {
                System.out.print("    *******");
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {
        //checking arguments
        int rowNumber = Integer.parseInt(args[0]);
        assert rowNumber >= 0 :
                "Oh no! There has to be a non-negative number of rows, sorry.";
        printPascalTriangle(rowNumber);
    }
}