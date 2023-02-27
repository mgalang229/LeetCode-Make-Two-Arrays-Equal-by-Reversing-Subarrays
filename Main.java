class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int max = 0;
        for (int i = 0; i < target.length; i++) {
            max = Math.max(max, Math.max(target[i], arr[i]));
        }
        int[] freq1 = new int[max+1], freq2 = new int[max+1];
        Arrays.fill(freq1, 0);
        Arrays.fill(freq2, 0);
        for (int i = 0; i < target.length; i++) {
            freq1[target[i]]++;
            freq2[arr[i]]++;
        }
        for (int x = 1; x <= max; x++) {
            if (freq1[x] != freq2[x]) {
                return false;
            }
        }
        return true;
    }
}
