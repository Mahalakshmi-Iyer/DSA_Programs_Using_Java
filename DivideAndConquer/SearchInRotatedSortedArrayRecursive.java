package DivideAndConquer;

public class SearchInRotatedSortedArrayRecursive {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;

        int targetIdx = search(arr, target, 0, arr.length - 1);
        if (targetIdx != -1)
            System.out.println("Index of target element is : " + targetIdx);
        else
            System.out.println("Target element does not exist in the array!");
    }

    public static int search(int arr[], int target, int si, int ei) {
        if (si > ei)
            return -1;

        int mid = si + (ei - si) / 2;

        if (arr[mid] == target)
            return mid;

        // mid is on Line 1
        if (arr[si] <= arr[mid]) {
            // case 1 : left of line 1
            if (arr[si] <= target && target <= arr[mid])
                return search(arr, target, si, mid - 1);
            // case 2 : right of line 1
            else
                return search(arr, target, mid + 1, ei);
        }

        // mid is on Line 2
        else {
            // case 3 : right of line 2
            if (arr[mid] <= target && target <= arr[ei])
                return search(arr, target, mid + 1, ei);
            // case 4 : left of line 2
            else
                return search(arr, target, si, mid - 1);
        }
    }
}
