class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String show() {
        return "Imie: " + name;
    }
}

class Welder extends Person {
    private int lengthOfService;

    public Welder(String name, int lengthOfService) {
        super(name);
        this.lengthOfService = lengthOfService;
    }

    public String show() {
        return super.show() + ", Staż pracy: " + lengthOfService;
    }
}