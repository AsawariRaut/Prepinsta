import java.util.*;

public class EquilibriumIndex1
{
    static int equilibrium_index(int array[], int n)
    {
        int sum = 0;
        int leftsum = 0;

        for (int i = 0; i < n; ++i)
            sum = sum + array[i];

        for (int i = 0; i < n; ++i) {
            sum = sum + array[i];

            if (leftsum == sum)
                return i;

            leftsum = leftsum + array[i];
        }

        return -1;
    }

    public static void main(String[] args)
    {
        int arr[] = { 1,2,3,4,5,1,3,2,4 };
        int arr_size = arr.length;
        System.out.print("Equilibrium Index : ");
        System.out.println(equilibrium_index(arr, arr_size));
    }
}