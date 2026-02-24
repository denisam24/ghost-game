class Ghost {

    private int x;
    private int y;
    private int direction = 1;
    private String color;

    public Ghost(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void move(int n) {

        if (color.equals("R")) {
            if (x == n) direction = -1;
            if (x == 1) direction = 1;
            x += direction;
        } else {
            if (y == n) direction = -1;
            if (y == 1) direction = 1;
            y += direction;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColor() {
        return color;
    }
}
