class dooWhile {
    public static void main(String[] args) {
        int row, col, y;
        System.out.println("Multiplication Table");

        row = 1;
        do {
            col = 1;
            do {
                y = row * col;
                System.out.print(y + "\t"); 
                col = col + 1;
            } while (col <= 3);

            System.out.println(); 
            row = row + 1;
        } while (row <= 3);
    }
}
