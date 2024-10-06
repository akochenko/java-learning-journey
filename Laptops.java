public class Laptops {

    public static void main(String[] args) {
        String[] brands = {"Sony", "HP", "Dell", "Acer"};
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] price = {3200, 2700, 2900, 2100};
        int[][] sales = {
            {15, 12, 13, 45, 34, 32, 22, 12, 10, 12, 18, 20},
            {34, 43, 33, 23, 32, 33, 23, 23, 21, 34, 23, 30},
            {23, 45, 43, 32, 12, 12, 33, 12, 34, 35, 40, 42},
            {12, 23, 23, 44, 23, 23, 23, 23, 24, 23, 33, 35}
        };

        int totalRevenue = 0;
        int highestOverallSales = 0;
        int highestOverallMonthIndex = 0;

        for (int i = 0; i < 4; i++) {
            int total = 0;
            int revenue = 0;
            int highest = 0;
            int lowest = Integer.MAX_VALUE;
            int highinx = 0;
            int lowinx = 0;

            for (int n = 0; n < 12; n++) {
                total += sales[i][n];

                if (sales[i][n] > highest) {
                    highest = sales[i][n];
                    highinx = n;
                }
                if (sales[i][n] < lowest) {
                    lowest = sales[i][n];
                    lowinx = n;
                }
            }

            revenue = total * price[i];
            totalRevenue += revenue;

            System.out.println("The total number of laptops sold by " + brands[i] + " is " + total + ", the total revenue is " + revenue);
            System.out.println("The lowest number of laptops sold by " + brands[i] + " is " + lowest + " in " + months[lowinx]);
            System.out.println("The highest number of laptops sold by " + brands[i] + " is " + highest + " in " + months[highinx]);
            System.out.println(" ");
        }

        // Identify the month with the highest overall sales
        for (int monthIndex = 0; monthIndex < months.length; monthIndex++) {
            int totalMonthlySales = 0;

            for (int brandIndex = 0; brandIndex < brands.length; brandIndex++) {
                totalMonthlySales += sales[brandIndex][monthIndex];
            }

            if (totalMonthlySales > highestOverallSales) {
                highestOverallSales = totalMonthlySales;
                highestOverallMonthIndex = monthIndex;
            }
        }

        System.out.println("The total revenue earned by the company is " + totalRevenue);
        System.out.println("The month with the highest overall sales is: " + months[highestOverallMonthIndex]);
    }
}
