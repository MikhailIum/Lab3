public class Battery implements Device{
    String charging_device;


    public Battery(String charging_device){
        this.charging_device = charging_device;
    }

    @Override
    public String functionality() {
        return ", питающая током " + charging_device;
    }

    @Override
    public String description() {
        return get_name(Case.NOMINATIVE, Case.LOW);
    }

    @Override
    public String get_name(Case word_case, Case capital) {
        if (word_case == Case.GENITIVE) {
            if (capital == Case.LOW)
                return "электробатареи";
            if (capital == Case.HIGH)
                return "Электробатарея";
        }
        if (word_case == Case.NOMINATIVE) {
            if (capital == Case.LOW)
                return "электробатарея";
            if (capital == Case.HIGH)
                return "Электробатарея";
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
