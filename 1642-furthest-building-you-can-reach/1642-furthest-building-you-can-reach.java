class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> maxB = new PriorityQueue<>(Collections.reverseOrder());
        int i = 0, diff = 0;
        for (i = 0; i < heights.length - 1; i++) {
            diff = heights[i + 1] - heights[i];

            if (diff <= 0) {
                continue;
            }

            bricks -= diff;
            maxB.add(diff);

            if (bricks < 0) {
                bricks += maxB.poll();
                ladders--;
            }

            if (ladders < 0) {
                break;
            }
        }

        return i;
    }
}
//nb=