public class Pet {
    private String name;

    public Pet(String n){
        name = n;
    }

    //this method is to be defined in child classes.
    public abstract String speak();
}
