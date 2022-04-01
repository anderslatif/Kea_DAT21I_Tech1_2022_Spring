package Implementation;

public class ImplementationMain {
    public static void main(String[] args) {
        ImplementThread threadFromThreadOne = new ImplementThread();
        ImplementThread threadFromThreadTwo = new ImplementThread();

        // Calling run would just invoke the method run without creating a new thread
        threadFromThreadOne.start();
        threadFromThreadTwo.start();

        ImplementRunnable threadFromRunnable = new ImplementRunnable();
        threadFromRunnable.run();
        threadFromRunnable.run();
    }
}
