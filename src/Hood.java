public class Hood implements Device{
    String desc;
    String place;
    String connection;


    public Hood(String desc, String place, String connection){
        this.desc = desc;
        this.connection = connection;
        this.place = place;
    }

    @Override
    public String functionality() {
        return ", раскрывающийся в случае надобности на манер крыльев.";
    }

    @Override
    public String description() {
        return place + connection + desc + get_name(Case.NOMINATIVE, Case.LOW);
    }

    @Override
    public String get_name(Case word_case, Case capital) {
        if (word_case == Case.GENITIVE) {
            if (capital == Case.LOW)
                return "капюшон-парашюта";
            if (capital == Case.HIGH)
                return "Капюшон-парашюта";
        }
        if (word_case == Case.NOMINATIVE) {
            if (capital == Case.LOW)
                return "капюшон-парашют";
            if (capital == Case.HIGH)
                return "Капюшон-парашют";
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
