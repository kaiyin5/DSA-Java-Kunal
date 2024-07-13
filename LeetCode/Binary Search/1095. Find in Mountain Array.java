/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int start = 0, end = mountainArr.length() - 1, mid, peak;
        // find the index of the peak
        while (start < end) {
            mid = start + (end - start) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                // ascending side, mid itself isn't the peak
                start = mid + 1;
            } else {
                // descending side, mid itself can be the peak
                end = mid;
            }
        }
        peak = start;
        // the end should be the peak
        // reset the start and check ascending side
        start = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target == mountainArr.get(mid)) {
                return mid;
            }
            if (target > mountainArr.get(mid)) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        // check descending side
        start = peak;
        end = mountainArr.length() - 1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target == mountainArr.get(mid)) {
                return mid;
            }
            if (target < mountainArr.get(mid)) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}