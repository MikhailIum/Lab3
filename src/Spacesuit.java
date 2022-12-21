import java.util.Objects;

public class Spacesuit {
    Jumpsuit jumpsuit;
    Helmet helmet;
    Spaceboots boots;

    public Spacesuit(Jumpsuit jumpsuit, Helmet helmet, Spaceboots boots){
        this.jumpsuit = jumpsuit;
        this.helmet = helmet;
        this.boots = boots;
    }

    @Override
    public String toString(){
        return "Это скафандр! Он состоит из трёх частей: " + jumpsuit.get_name(Case.GENITIVE, Capital.LOW) + ", " + helmet.get_name(Case.GENITIVE, Capital.LOW) + " и " + boots.get_name(Case.GENITIVE, Capital.LOW) + ". "
                + "\n" + jumpsuit.toString() + helmet.toString() + boots.toString() + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spacesuit spacesuit = (Spacesuit) o;
        return Objects.equals(jumpsuit, spacesuit.jumpsuit) &&
                Objects.equals(helmet, spacesuit.helmet) &&
                Objects.equals(boots, spacesuit.boots);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jumpsuit, helmet, boots);
    }


}
