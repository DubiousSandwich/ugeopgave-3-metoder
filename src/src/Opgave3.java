public class Opgave3 {



    void main(){

        applyDiscount(500.0,20.0);
        addTax(500.0);
        double finalPrice = calculateFinalPrice(500, 20);
        System.out.println("Slutpris med 20% rabat: " + finalPrice);


    }

    double applyDiscount(double price, double discountPercent){
        discountPercent /= 100;
        price -= price*discountPercent;
        return price;

    }
    double addTax(double price){
        price *= 1.25;
        return price;
    }
    double calculateFinalPrice(double basePrice, double discount){
        double beforeTax = applyDiscount(basePrice, discount);
        double aftertax = addTax(beforeTax);
        return aftertax;

    }

}
