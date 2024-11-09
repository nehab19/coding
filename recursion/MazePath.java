package guru.springframework.spring5webapp.recursion;

public class MazePath {

    static void mazePath(int currentRow, int currentColumn, int existingRow, int existingColumn, String ans) {
        if (currentRow == existingRow && currentColumn == existingColumn) {
            System.out.println(ans);
            return;
        }
        if (currentRow > existingRow || currentColumn > existingColumn) {
            return;
        }
        mazePath(currentRow, currentColumn + 1, existingRow, existingColumn, ans + "H");
        mazePath(currentRow+1, currentColumn, existingRow, existingColumn, ans + "V");
       // mazePath(currentRow+1, currentColumn+1, existingRow, existingColumn, ans + "D"); // in case of diagnal
    }

    public static void main(String[] args) {
        mazePath(0, 0, 2, 2, "");
    }
}
