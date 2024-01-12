class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int near_x = Math.max(x1, Math.min(x2,xCenter));
        int near_y = Math.max(y1,Math.min(y2,yCenter));
        int dist_x = near_x - xCenter;
        int dist_y = near_y - yCenter;
        int dist = (dist_x*dist_x) + (dist_y*dist_y);
        return (dist <= (radius*radius));
    }
}
//nb=