class VLine extends VectorObject {
    private int length;

    VLine(int id, int x, int y, int length) {
        super(id, x, y);
        this.length = length;
    }

    @Override
    public void draw(char[][] matrix) {
        int x = this.x;  // Use x directly
        int y = this.y;  // Use y directly

        for (int i = 0; i < length; i++) {
            int xCoord = x;
            int yCoord = y + i;
            if (xCoord >= 0 && xCoord < matrix[0].length && yCoord >= 0 && yCoord < matrix.length) {
                matrix[yCoord][xCoord] = '*';
            }
        }
    }
}