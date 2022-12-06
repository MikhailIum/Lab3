public class Radiostation implements Device{
    String place;
    String connection;

    public Radiostation(String place, String connection){
        this.place = place;
        this.connection = connection;
    }

    @Override
    public String functionality() {
        return " с телефонным устройством, посредством которого можно было переговариваться в безвоздушном пространстве.";
    }

    @Override
    public String description() {
        return place + connection + get_name(Case.NOMINATIVE, Case.LOW);
    }

    @Override
    public String get_name(Case word_case, Case capital) {
        if (word_case == Case.GENITIVE) {
            if (capital == Case.LOW)
                return "радиостанции";
            if (capital == Case.HIGH)
                return "Радиостанции";
        }
        if (word_case == Case.NOMINATIVE) {
            if (capital == Case.LOW)
                return "радиостанция";
            if (capital == Case.HIGH)
                return "Радиостанция";
        }
        return "";

    }

    @Override
    public String toString(){

        return description() + functionality();
    }

    @Override
    public boolean equals(Object obj) {
        return this.toString().equals(obj.toString());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
