public class employee {
    private String name;
    private String nif;

    public employee() {
        this.name = "";
        this.nif = "";
    }

    public employee(final String name, final String nif) {
        this.name = name;
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "name: " + this.name + ", nif: " + this.nif;
    }
}
