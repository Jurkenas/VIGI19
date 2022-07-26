public enum Kryptis {
    PIETUS("Pietus"),
    RYTAI("Rytus"),
    SIAURE("Šiaurę"),
    VAKARAI("Vakarus");
    private final String iKur;

    Kryptis(String iKur) {
        this.iKur = iKur;
    }

    public String getIKur() {
        return iKur;
    }
}
