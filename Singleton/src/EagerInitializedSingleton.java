public class EagerInitializedSingleton {
    private static String string;
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton("This is EagerInitializedSingleton instance");
    private EagerInitializedSingleton(String string){
        this.string = string;
    }

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }

    public String toString(){
        return string;
    }

}
