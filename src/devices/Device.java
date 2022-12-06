public interface Device {
    public String functionality();

    public String description();

    public String get_name(Case word_case, Case capital);

    @Override
    public String toString();

    @Override
    public boolean equals(Object obj);

    @Override
    public int hashCode();

}
