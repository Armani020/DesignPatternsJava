package com.company;

public class OffState implements PrinterState {

    Printer printer;

    public OffState(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void pushPowerButton() {
        System.out.println("Turning on");
        printer.setState(printer.getOnState());
        printer.setPower(true);
    }

    @Override
    public void sendSheets() {
        System.out.println("Please turn on printer");
    }

    @Override
    public void print() {
        System.out.println("Please turn on printer");
    }
}
