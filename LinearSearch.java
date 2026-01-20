// Name: Razan Mohammed Alturkistani
// ID: 445002494

package linearsearch;

// Java code for linearly search x in arr[]. If x
// is present then return its location, otherwise
// return -1
class LinearSearch {

    // This function returns index of element x in arr[]
    static int search(int arr[], int n, int x) {

        for (int i = 0; i < n; i++) {

            // Return the index of the element if the element
            // is found
            if (arr[i] == x) {
                return i;
            }

        }

        // return -1 if the element is not found
        return -1;

    }

    public static void main(String[] args) {

        int[] arr = {3, 4, 1, 7, 5};

        int n = arr.length;

        // Assigned x to 7 instead of 4
        int x = 7;

        // Changed the variable name throughout the code
        int value = search(arr, n, x);

        if (value == -1) {
            System.out.println("Element is not present in the array");
        } else {
            System.out.println("Element found at position " + value);
        }

    }

}
