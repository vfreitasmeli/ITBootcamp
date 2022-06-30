package exercicio3;

public abstract class Animal {
    protected String som;

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public abstract void emitirSom();
}
