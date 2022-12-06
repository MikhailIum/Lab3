public class Ventilation implements Device{
    String connection;
    String place;

    public Ventilation(String place, String connection){
        this.connection = connection;
        this.place = place;
    }

    @Override
    public String functionality() {
        return "";
    }

    @Override
    public String description() {
        return place + connection + get_name(Case.NOMINATIVE, Case.LOW);
    }

    @Override
    public String get_name(Case word_case, Case capital) {
        if (word_case == Case.GENITIVE) {
            if (capital == Case.LOW)
                return "воздухоочистительного и вентеляционнного устройства";
            if (capital == Case.HIGH)
                return "Воздухоочистительного и вентеляционнного устройства";
        }
        if (word_case == Case.NOMINATIVE) {
            if (capital == Case.LOW)
                return "воздухоочистительное и вентеляционнное устройство";
            if (capital == Case.HIGH)
                return "Воздухоочистительное и вентеляционнное устройство";
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
