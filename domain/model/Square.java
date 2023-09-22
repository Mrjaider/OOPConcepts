package domain.model;

public class Square extends Shape {
    private int width = 0;

    int height = 0;

    public int getWith() {
        return width;
    }

    public void setWidth(int newWidth) {
        if (newWidth >= 0)
            width = newWidth;
    }

    public int getHeight() {
        return getWith();
    }

    public void setHeight(int newHeight) {
        setWidth(newHeight);
    }
}
