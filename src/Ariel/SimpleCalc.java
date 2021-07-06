package Ariel;

public class SimpleCalc {
    private double firstNum;
    private double secondNum;

    public void setFirstNum(double firstNum) {
        this.firstNum = firstNum;
    }

    public void setSecondNum(double secondNum) {
        this.secondNum = secondNum;
    }

    public double getFirstNum() {
        return this.firstNum;
    }

    public double getSecondNum() {
        return this.secondNum;
    }

    public double getSumValue() {

        System.out.print(firstNum + " + " + secondNum + " = ");
        return firstNum + secondNum;
    }

    public double getDifferenceValue() {

        System.out.print(firstNum + " - " + secondNum + " = ");
        return firstNum - secondNum;
    }

    public double getProductValue() {
        System.out.print(firstNum + " * " + secondNum + " = ");
        return firstNum * secondNum;
    }

    public double getQuotientValue() {

        if(secondNum == 0) {

            System.out.println("Cannot divide by zero");
            return 0;
        }
        System.out.print(firstNum + " / " + secondNum + " = ");
        return firstNum / secondNum;
    }


}
