public class main
{
    public static int interpolationSearch(int[] arr, int key)
    {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high && key >= arr[low] && key <= arr[high])
        {
            if (arr[low] == arr[high])
            {
                if (arr[low] == key)
                    return low;
                return -1;
            }

            int pos = low + ((key - arr[low]) * (high - low)) / (arr[high] - arr[low]);

            if (pos < low || pos > high)
                if (key > arr[high])
                    return -1;
                else
                    pos = high;

            if (arr[pos] == key)
                return pos;
            else if (arr[pos] < key)
                low = pos + 1;
            else
                high = pos - 1;
        }

        return -1;
    }


    public static void main(String[] args)
    {
        int[] arr = {10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 25, 26, 28, 29};
        int key = 25;
        int index = interpolationSearch(arr, key);
        if(index != -1)
            System.out.println("Индекс искомого элемента " + index);
        else
            System.out.println("Элемент не найден");
    }
}
