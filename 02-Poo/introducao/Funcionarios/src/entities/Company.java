package entities;

public class Company extends TaxPayer{
    private Integer numberOfEmployess;

    public Company(){
        super();
    }

    public Company(String name, Double anualIncome, Integer numberOfEmployess) {
        super(name, anualIncome);
        this.numberOfEmployess = numberOfEmployess;
    }

    public Integer getNumberOfEmployess() {
        return numberOfEmployess;
    }

    public void setNumberOfEmployess(Integer numberOfEmployess) {
        this.numberOfEmployess = numberOfEmployess;
    }

    @Override
    public Double tax(){
        Double tax = 1.0;
        if(this.numberOfEmployess > 10) {
            tax = anualIncome * 0.14;
        } else {
            tax = anualIncome * 0.16;
        }



        return tax;
    }
}
