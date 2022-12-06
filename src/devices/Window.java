public class Window implements Device {
    String place;
    String connection;
    String desc;

    public Window(String place, String connection, String desc){
        this.place = place;
        this.connection = connection;
        this.desc = desc;
    }

    @Override
    public String functionality() {
        return "";
    }

    @Override
    public String description() {
        Helmet helmet = new Helmet();
        return place + helmet.get_name(Case.GENITIVE, Case.LOW) + connection + get_name(Case.NOMINATIVE, Case.LOW) + desc;
    }

    @Override
    public String get_name(Case word_case, Case capital) {
        if (word_case == Case.GENITIVE) {
            if (capital == Case.LOW)
                return "иллюминатора";
            if (capital == Case.HIGH)
                return "Иллюминатора";
        }
        if (word_case == Case.NOMINATIVE) {
            if (capital == Case.LOW)
                return "иллюминатор";
            if (capital == Case.HIGH)
                return "Иллюминатор";
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
