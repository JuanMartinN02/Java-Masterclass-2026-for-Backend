public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String hireDate, double annualSalary) {
        super(hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = (Integer.parseInt(this.getEndDate().substring(6)) <= 2026);
    }

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = (Integer.parseInt(this.getEndDate().substring(6)) <= 2026);
    }

    public SalariedEmployee(double annualSalary) {
        this.annualSalary = annualSalary;
        this.isRetired = (Integer.parseInt(this.getEndDate().substring(6)) <= 2026);
    }

    @Override
    public double collectPay() {
        if (!isRetired){
            return (annualSalary * 0.75);
        }
        return annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public boolean isRetired() {
        return isRetired;
    }

    public void setRetired(boolean retired) {
        isRetired = retired;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }
}
