package Arrays;

public class TrappedRainWater {

    public static final int width = 1;

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        int trappedWater = calcTrappedWater(height);
        System.out.println("Total trapped rainwater : " + trappedWater);
    }

    public static int calcTrappedWater(int height[]) {
        int n = height.length;

        // left max boundary array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // right max boundary array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        // calculate water level and trapped water
        int waterLevel, trappedWater = 0;
        for (int i = 0; i < n; i++) {
            waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += (waterLevel - height[i]) * width;
        }

        return trappedWater;
    }
}
