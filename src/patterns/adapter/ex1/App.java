package patterns.adapter.ex1;

public class App {
    public static void main(String[] args) {
        VectorGraphicsInterface vectorGraphics = new VectorAdapterFromRaster();
        vectorGraphics.drawLine();
        vectorGraphics.drawSquare();
    }
}
