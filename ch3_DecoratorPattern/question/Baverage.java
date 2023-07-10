package question;

public abstract class Baverage {
    String description = "Unknown Beverage";
    Boolean milk = false;
    Boolean soy = false;
    Boolean mocha = false;
    Boolean whip = false;

    public abstract double cost();
    public String getDescription() {
        return description;
    }

    public Boolean hasMilk() {
        return milk;
    }

    public void setMilk(Boolean milk) {
        this.milk = milk;
    }

    public Boolean hasSoy() {
        return soy;
    }

    public void setSoy(Boolean soy) {
        this.soy = soy;
    }

    public Boolean hasMocha() {
        return mocha;
    }

    public void setMocha(Boolean mocha) {
        this.mocha = mocha;
    }

    public Boolean hasWhip() {
        return whip;
    }

    public void setWhip(Boolean whip) {
        this.whip = whip;
    }
}
