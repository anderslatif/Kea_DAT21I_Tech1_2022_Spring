package PrintingThreads;

public class PrintingThreadMain {
    public static void main(String[] args) {
        PrintingThread printingThreadOne = new PrintingThread("'Good to be here today' said Zaland during Tech class.");
        PrintingThread printingThreadTwo = new PrintingThread("1234567890987654323456789876543212345678987654321234567");
        PrintingThread printingThreadThree = new PrintingThread("!@#$%^&**^%$#@!#$%^&*()_(*&^%$#@#$%^&*(*&^%$#@!@#$%^&*");

        printingThreadOne.start();
        printingThreadTwo.start();
        printingThreadThree.start();
    }
}
