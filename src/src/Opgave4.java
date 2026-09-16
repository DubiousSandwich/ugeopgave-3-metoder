public class Opgave4 {

    void main(){

        int[] numbers = {45, 67, 23, 89, 34, 56, 78};
        double average = calculateAverage(numbers);
        int max = findMax(numbers);
        int min = findMin(numbers);
        int aboveAverage = countAboveAverage(numbers);

        System.out.println(average);
        System.out.println(max);
        System.out.println(min);
        System.out.println(aboveAverage);

    }

    double calculateAverage(int[] numbers){
        double sum = 0;
        for (int number:numbers){
            sum+= number;
        }
        double average = sum / numbers.length;
        return average;
    }

    int findMax(int[] numbers){
        int max = numbers[0];
        for (int number : numbers) {
            if (max < number) {
                max = number;
            }
        }
        return max;
    }

    int findMin(int[] numbers){
        int min = numbers[0];
        for (int number : numbers) {
            if (min > number) {
                min = number;
            }
        }
        return min;
    }

    int countAboveAverage(int[] numbers){
        double average = calculateAverage(numbers);
        int count = 0;
        for (int number : numbers) {
            if (number > average) {
                count++;
            }
        }
        return count;
    }

}
