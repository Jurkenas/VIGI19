package enums;

public enum Zemynai {
    EUROPA("europa", "vidutiniu platumu"),
    AZIJA("azija", "vidutiniu platumu"),
    AUSTRALIJA("australija", "tropine"),
    SIAURES_AMERIKA("siaures amerika", "vidutiniu platumu");

    private final String pavadinimas;
    private final String klimatoJuosta;

    Zemynai(String pavadinimas, String klimatoJuosta) {
        this.pavadinimas = pavadinimas;
        this.klimatoJuosta = klimatoJuosta;
    }

    public String pavadinimas() {
        return pavadinimas;
    }

    public String klimatoJuosta(){
        return klimatoJuosta;
    }
}
