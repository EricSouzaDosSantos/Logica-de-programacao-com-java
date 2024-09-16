package Aula_02;

public class rectangle {

    private float width;

    private float height;

    public rectangle(){

    }
    public float CalcAreaRetangulo(){
        float area = width * height;
        return area;
    }
    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
}
