public class ProductRating {
    public static void main(String[] args) {
        int[][] feedback = {
            {4, 5, 4}, 
            {3, 5, 3}, 
            {4, 5, 3}, 
            {1, 2, 1}  
        };

        int customersNum = feedback.length;
        int criteriaNum = feedback[0].length; 

        System.out.println("Rating\tProduct\tPackage\tDelivery");

        double[] criteriaAverage = new double[criteriaNum];
        for (int j = 0; j < criteriaNum; j++) {
            double sum = 0;
            for (int i = 0; i < customersNum; i++) {
                sum += feedback[i][j];
            }
            criteriaAverage[j] = sum / customersNum;
            System.out.printf("%.2f\t", criteriaAverage[j]);
        }
        System.out.println("\n");

        // Step 4: Calculate and display average for each customer
        for (int i = 0; i < customersNum; i++) {
            double sum = 0;
            for (int j = 0; j < criteriaNum; j++) {
                sum += feedback[i][j];
            }
            double average = sum / criteriaNum;
            System.out.printf("Customer %d provide the average rating %.2f\n", i + 1, average);
        }
    }
}
