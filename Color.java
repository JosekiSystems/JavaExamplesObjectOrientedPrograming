public enum Color {

    ROJO("Rojo"),
    AMARILLO("Amarrillo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    GRIS("Gris"),
    NARANJA("Naranja");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return this.color;
    }
}
