public class Spaceboots extends Boots implements Parts{


    @Override
    public String get_name(Case word_case, Case capital){
        if (word_case == Case.GENITIVE) {
            if (capital == Case.LOW)
                return "космических сапог";
            if (capital == Case.HIGH)
                return "Космических сапог";
        }
        if (word_case == Case.NOMINATIVE) {
            if (capital == Case.LOW)
                return "космические сапоги";
            if (capital == Case.HIGH)
                return "Космические сапоги";
        }
        return "";
    }


    @Override
    public String toString(){
        Components substance = new Components("специального теплоизолирующего ", "вещества.", "no", "no", "подошвы их сделаны из ");

        return get_name(Case.NOMINATIVE, Case.HIGH) + " почти ничем не отличаются от обычных сапог, но " + substance.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.toString().equals(obj.toString());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }


}
