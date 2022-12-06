public abstract class Boots{


    protected String get_name(Case word_case){
        if (word_case == Case.GENITIVE)
            return "обычных сапог";
        if (word_case == Case.NOMINATIVE)
            return "Обычные сапоги";
        return "";
    }

    @Override
    public String toString(){
        return "Обычные сапоги";
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
