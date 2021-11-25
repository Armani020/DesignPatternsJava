package com.company;

public class OnState implements PrinterState {

    Printer printer;

    public OnState(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void pushPowerButton() {
        System.out.println("Shutting down printer");
        printer.setState(printer.getOffState());
        printer.setPower(false);
    }

    @Override
    public void sendSheets() {
        System.out.println("Sending data to printer");
    }

    @Override
    public void print() {
        System.out.println("Starting");
        printer.setState(printer.getPrintState());
    }
}
