public class Main {
    public static void main(String[] args){
        //Use eagerInitialzedSingleton instance
        EagerInitializedSingleton eagerInitializedSingletonInstance = EagerInitializedSingleton.getInstance();
        System.out.println(eagerInitializedSingletonInstance);

        //Use of LazyInitilizedSingleton instance
        LazyInitilizedSingleton lazyInitilizedSingletonInstance = LazyInitilizedSingleton.getInstance();
        System.out.println(lazyInitilizedSingletonInstance);

        //Use of LazyInitilizedSingleton instance
        ThreadSafeSingleton threadSafeSingletonInstance = ThreadSafeSingleton.getInstanceSynchronizedBlock();
        System.out.println(threadSafeSingletonInstance);
    }
}
