package de.cwansart.test.maps.with.assertj;

public class Type {

    public static final Type NORMAL = new Type("Normal");
    public static final Type FIGHTING = new Type("Fighting");
    public static final Type GHOST = new Type("Fighting");

    private final String name;

    public Type(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
