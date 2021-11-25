package com.company;

public class Printer {

    PrinterState onState;
    PrinterState offState;
    PrinterState printState;
    PrinterState noPaper;

    PrinterState state = offState;
    boolean power = false;
    int sheetCount = 0;

    public Printer(int sheetCount) {
        onState = new OnState(this);
        offState = new OffState(this);
        printState = new PrintState(this);
        noPaper = new NoPaper(this);
        this.sheetCount = sheetCount;
        if (sheetCount > 0) {
            state = offState;
        } else {
            state = noPaper;
        }
    }

    public void pushPowerButton() {
        state.pushPowerButton();
    }

    public void sendSheets() {
        state.sendSheets();
        state.print();
    }

    public void print() {
        state.print();
    }

    void realPrint() {
        System.out.println("Starting of printing");
        if (sheetCount != 0) {
            sheetCount -= 1;
        }
    }

    public PrinterState getOnState() {
        return onState;
    }

    public void setOnState(PrinterState onState) {
        this.onState = onState;
    }

    public PrinterState getOffState() {
        return offState;
    }

    public void setOffState(PrinterState offState) {
        this.offState = offState;
    }

    public PrinterState getPrintState() {
        return printState;
    }

    public void setPrintState(PrinterState printState) {
        this.printState = printState;
    }

    public PrinterState getNoPaper() {
        return noPaper;
    }

    public void setNoPaper(PrinterState noPaper) {
        this.noPaper = noPaper;
    }

    public PrinterState getState() {
        return state;
    }

    public void setState(PrinterState state) {
        this.state = state;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public int getSheetCount() {
        return sheetCount;
    }

    public void setSheetCount(int sheetCount) {
        this.sheetCount = sheetCount;
    }

    @Override
    public String toString() {
        return "Printer" + " paper count=" + sheetCount + " power=" + power;
    }
}
