public class Flashlight implements Device{
    String place;
    String connection;


    public Flashlight(String place, String connection){
        this.place = place;
        this.connection = connection;
    }

    @Override
    public String functionality() {
        return "";
    }

    @Override
    public String description() {
        return get_name(Case.NOMINATIVE, Case.LOW) + connection + place;
    }

    @Override
    public String get_name(Case word_case, Case capital) {
        if (word_case == Case.GENITIVE) {
            if (capital == Case.LOW)
                return "электрического фонаря";
            if (capital == Case.HIGH)
                return "Электрического фонаря";
        }
        if (word_case == Case.NOMINATIVE) {
            if (capital == Case.LOW)
                return "электрический фонарь";
            if (capital == Case.HIGH)
                return "Электрический фонарь";
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
