package onlinebookstore.demo;

public class RegularCustomer implements  Discount{


        private double discountRate;

        public RegularCustomer(double discountRate) {
            this.discountRate = discountRate;
        }


        @Override
        public double calculateDiscount(double totalPrice) {
            if (totalPrice > 10) {
                return totalPrice * discountRate / 100;
            } else {
                return 0;
            }
        }


    }

