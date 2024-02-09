class Rectangle extends VectorObject {
    private int xLen, yLen;

    Rectangle(int id, int x, int y, int xLen, int yLen) {
        super(id, x, y);
        this.xLen = xLen;
        this.yLen = yLen;
    }

    @Override
    public void draw(char[][] matrix) {
        int x = this.x;  // Use x directly
        int y = this.y;  // Use y directly

        for (int i = 0; i < yLen; i++) {
            for (int j = 0; j < xLen; j++) {
                int xCoord = x + j;
                int yCoord = y + i;
                if (xCoord >= 0 && xCoord < matrix[0].length && yCoord >= 0 && yCoord < matrix.length) {
                    matrix[yCoord][xCoord] = '*';
                }
            }
        }
    }
}
