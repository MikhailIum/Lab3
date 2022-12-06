public class Helmet implements Parts{

    @Override
    public String get_name(Case word_case, Case capital){
        if (word_case == Case.GENITIVE) {
            if (capital == Case.LOW)
                return "герметического шлема";
            if (capital == Case.HIGH)
                return "Герметического шлема";
        }
        if (word_case == Case.NOMINATIVE) {
            if (capital == Case.LOW)
                return "герметический шлем";
            if (capital == Case.HIGH)
                return "Герметический шлем";
        }
        return "";
    }

    @Override
    public String toString(){
        Components material = new Components("жёсткой ","космопластмассы, окованной нержавеющей сталью.", "no", "no", "сделан из ");
        Window window = new Window("В передней части ", " имеется ", " из небьющегося стекла, ");
        Radiostation radiostation = new Radiostation("внутри же ", "размещена ");

        return get_name(Case.NOMINATIVE, Case.HIGH) + " надевается на голову и " + material + "\n" + window.toString() + radiostation.toString() + "\n";
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
