package com.company;

public class NoPaper implements PrinterState {

    Printer printer;

    public NoPaper(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void pushPowerButton() {
        if (printer.isPower()) {
            printer.setState(printer.getOffState());
            printer.setPower(false);
        } else {
            printer.setState(printer.getOnState());
            printer.setPower(true);
        }
    }

    @Override
    public void sendSheets() {
        System.out.println("Paper not found");
    }

    @Override
    public void print() {
        System.out.println("Paper not found");
    }
}
