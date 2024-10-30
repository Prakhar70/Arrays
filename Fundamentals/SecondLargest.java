package Fundamentals;

public class SecondLargest {
    public int secondLargestElement(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int ele : nums) {
            if (ele > largest) {
                secondLargest = largest;
                largest = ele;
            } else if (ele > secondLargest && ele != largest) {
                secondLargest = ele;
            }
        }
        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }
}
