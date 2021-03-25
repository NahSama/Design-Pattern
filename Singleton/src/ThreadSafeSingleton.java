public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){

    }

    public static synchronized ThreadSafeSingleton getInstance(){

        if(instance == null){
            instance = new ThreadSafeSingleton();
        }

        return instance;
    }

    public static ThreadSafeSingleton getInstanceSynchronizedBlock(){

        //if statement just use one time if multi threads acdess it, -> lock the whole class
        if(instance == null){
            synchronized (ThreadSafeSingleton.class){
                if(instance == null){
                    instance = new ThreadSafeSingleton();
                }
            }
        }

        return instance;
    }

    public String toString(){
        return "This is ThreadSafeSingleton instance";
    }
}
