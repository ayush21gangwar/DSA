import java.util.*;
public class intersection {

    public static void main(String[] args) {
        int nums1[] = {23, 36, 96, 78, 55};
        int nums2[] = {78, 45, 19, 73, 55};
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for(int i = 0; i<nums1.length; i++ ) {
            for(int j = 0; j<nums2.length; j++) {
                if(nums1[i]==nums2[j]) {
                    System.out.println(nums2[j]);
                }
            }
        }
    }
}