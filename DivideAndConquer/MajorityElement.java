package DivideAndConquer;

public class MajorityElement {
    public static void main(String[] args) {
        int arr1[] = { 2, 2, 1, 1, 1, 2, 2 };
        int arr2[] = { 3, 2, 3 };

        int ans1 = majorityElement(arr1);
        int ans2 = majorityElement(arr2);
        System.out.println("Majority element in array 1 : " + ans1);
        System.out.println("Majority element in array 2 : " + ans2);
    }

    public static int majorityElement(int arr[]) {
        // Moore's Voting Algorithm
        int lead = 1, majority = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == majority)
                lead++;
            else {
                if (lead > 0)
                    lead--;
                else {
                    majority = arr[i];
                    lead = 1;
                }
            }
        }
        return majority;
    }
}
