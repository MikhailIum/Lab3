public class Components {
    String material;
    String shape;
    String color;
    String connection;
    String description;


    public Components(String material, String shape, String color, String connection, String description){
        this.material = material;
        this.description = description;
        this.shape = shape;
        this.color = color;
        this.connection = connection;
    }

    @Override
    public String toString(){
        String desc = "";
        if (!description.equals("no"))
            desc += description;
        if (!material.equals("no"))
            desc += material;
        if (!shape.equals("no"))
            desc += shape;
        if (!color.equals("no"))
            desc += color + "цвета";
        if (!connection.equals("no"))
            desc += ", соединенных " + connection;

        return desc;
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
