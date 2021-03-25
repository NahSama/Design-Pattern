public class LazyInitilizedSingleton {

    private static LazyInitilizedSingleton instance;

    private LazyInitilizedSingleton(){

    }

    public static LazyInitilizedSingleton getInstance(){

        if(instance == null){
            instance = new LazyInitilizedSingleton();
        }

        return instance;
    }

    public String toString(){
        return "This is LazyInitializedSingleton instandce";
    }
}
