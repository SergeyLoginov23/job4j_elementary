package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = 0;
        for (i = 0, j = array.length - 1; i < j;) {
            int sum = array[i] + array[j];
            if (sum == target) {
                return new int[] {i, j};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[0];
    }
}