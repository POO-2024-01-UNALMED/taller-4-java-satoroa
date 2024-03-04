package classroom;

public enum Tipo {
    DISCIPLINAR(10),
    FUNDAMENTACION(20),
    ELECTIVA(30);
    
    private final int codigo;

    Tipo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return this.codigo;
    }
}
