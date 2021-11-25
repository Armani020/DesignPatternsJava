package com.company;

public class PrintState implements PrinterState {

    Printer printer;

    public PrintState(Printer printer) {
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
        System.out.println("Printer already in use");
    }

    @Override
    public void print() {
        printer.realPrint();
        if (printer.getSheetCount() > 0) {
            printer.setState(printer.getOnState());
        } else {
            printer.setState(printer.getNoPaper());
        }
    }
}
