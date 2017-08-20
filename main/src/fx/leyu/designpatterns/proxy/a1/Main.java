package fx.leyu.designpatterns.proxy.a1;

public class Main {
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Alice", "fx.leyu.designpatterns.proxy.a1.Printer");                 
        System.out.println("现在的名字是" + p.getPrinterName() + "。");
        p.setPrinterName("Bob");
        System.out.println("现在的名字是" + p.getPrinterName() + "。");
        p.print("Hello, world.");
    }
}
