public class Jumpsuit implements Parts{

    @Override
    public String get_name(Case word_case, Case capital){
        if (word_case == Case.GENITIVE) {
            if (capital == Case.LOW)
                return "космического комбинезона";
            if (capital == Case.HIGH)
                return "Космического комбинезона";
        }
        if (word_case == Case.NOMINATIVE) {
            if (capital == Case.LOW)
                return "космический комбинезон";
            if (capital == Case.HIGH)
                return "Космический комбинезон";
        }
        return "";
    }

    private String contains(){
        Components connection = new Components("космопластмассой ", "no", "серебристого ", "no", "гибкой воздухонепроницаемой ");
        Components ring = new Components("металлических ", "колец ", "no", "no", "no");
        Components slab = new Components("no", "пластин", "no", connection.toString(), "no");
        return get_name(Case.NOMINATIVE, Case.HIGH) + " сделан из " + ring.toString() + "и " + slab.toString() + ". ";
    }

    private String installed(){
        Backpack backpack = new Backpack("На спине " + get_name(Case.GENITIVE, Case.LOW), " имеется ");
        Ventilation ventilation = new Ventilation(", в котором ", "размещены ");
        Flashlight flashlight = new Flashlight("на груди.", ", который укреплён ");
        Battery battery = new Battery(flashlight.toString());
        Hood hood = new Hood("автоматический складной ", "Над ранцем ", "размещен ");

        return backpack.toString() + ventilation.toString() + ", а также " + battery + "\n" + hood + "\n";
    }

    @Override
    public String toString(){

        return contains() + "\n" + installed();
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
