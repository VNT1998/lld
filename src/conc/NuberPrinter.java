package conc;

public class NuberPrinter implements  Runnable{
    private  int numberToPrint;
    NuberPrinter(int numberToPrint){
        this.numberToPrint = numberToPrint;
    }
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName() + " Number " + this.numberToPrint);
    }
}
