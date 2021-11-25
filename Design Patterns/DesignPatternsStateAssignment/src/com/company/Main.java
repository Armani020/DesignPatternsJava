package com.company;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(2);

        System.out.println(printer);
        System.out.println("");

        printer.pushPowerButton(); // turning on printer

        System.out.println(printer);
        System.out.println("");

        printer.sendSheets(); // printing 1 page
        printer.print();

        System.out.println("");

        printer.sendSheets(); // printing 2 page
        printer.print();

        System.out.println(printer);
        System.out.println("");

        printer.sendSheets(); // trying to print 3 page without paper
        printer.print();

        System.out.println("");
        System.out.println(printer);
        System.out.println("");

        printer.pushPowerButton(); // turning off printer
        System.out.println(printer);
        System.out.println("");

        printer.sendSheets(); // trying to print 3 page with off printer
        printer.print();
    }
}
