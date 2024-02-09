class PtLine extends VectorObject {
    private int bx, by;

    PtLine(int id, int x, int y, int bx, int by) {
        super(id, x, y);
        this.bx = bx;
        this.by = by;
    }

    @Override
    public void draw(char[][] matrix) {
        int x1 = this.x;  // Use x directly
        int y1 = this.y;  // Use y directly
        int x2 = bx;
        int y2 = by;

        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);
        int sx = (x1 < x2) ? 1 : -1;
        int sy = (y1 < y2) ? 1 : -1;
        int err = dx - dy;

        while (true) {
            if (x1 >= 0 && x1 < matrix[0].length && y1 >= 0 && y1 < matrix.length) {
                matrix[y1][x1] = '*';
            }

            if (x1 == x2 && y1 == y2) {
                break;
            }

            int e2 = 2 * err;
            if (e2 > -dy) {
                err -= dy;
                x1 += sx;
            }
            if (e2 < dx) {
                err += dx;
                y1 += sy;
            }
        }
    }
}
