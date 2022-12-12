public class Backpack implements Device{

    String place;
    String connection;

    public Backpack(String place, String connection){
        this.place = place;
        this.connection = connection;
    }

    @Override
    public String functionality() {
        return "";
    }

    @Override
    public String description() {
        return place + connection + get_name(Case.NOMINATIVE, Case.LOW).toLowerCase();
    }

    @Override
    public String get_name(Case word_case, Case capital) {
        if (word_case == Case.GENITIVE) {
            if (capital == Case.LOW)
                return "ранца";
            if (capital == Case.HIGH)
                return "Ранца";
        }
        if (word_case == Case.NOMINATIVE) {
            if (capital == Case.LOW)
                return "ранец";
            if (capital == Case.HIGH)
                return "Ранец";
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
