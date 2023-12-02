package com.solvd.foodDelivery.payment;

public enum StateTax implements TaxCalculator {
    STATE_TAX_7(amount -> amount * 0.07);
    private final TaxCalculator taxCalculator;
    StateTax(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }
    @Override
    public double calculateTax(double totalAmount) {
        return taxCalculator.calculateTax( totalAmount);
    }
}
