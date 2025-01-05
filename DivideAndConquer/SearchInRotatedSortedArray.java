package DivideAndConquer;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int targetIdx = search(arr, target, 0, arr.length - 1);

        if (targetIdx != -1)
            System.out.println("Target found at index : " + targetIdx);
        else
            System.out.println("Target not found in the array!");
    }

    public static int search(int arr[], int target, int si, int ei) {

        int mid;
        while (si <= ei) {
            mid = si + (ei - si) / 2;

            if (arr[mid] == target)
                return mid;

            // case 1 : left part is sorted
            else if (arr[si] < arr[mid]) {
                if (target >= arr[si] && target <= arr[mid])
                    ei = mid - 1;
                else
                    si = mid + 1;
            }

            // case 2 : right part is sorted
            else {
                if (target >= arr[mid] && target <= arr[ei])
                    si = mid + 1;
                else
                    ei = mid - 1;
            }
        }

        return -1;
    }
}
