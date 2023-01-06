package problem278;

public class Solution278 {

    public final int BAD_VERSION = 4;

    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public boolean isBadVersion(int n) {
        return n >= BAD_VERSION;
    }
}
