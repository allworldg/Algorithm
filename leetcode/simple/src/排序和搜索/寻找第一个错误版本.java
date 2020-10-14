//package 排序和搜索;
//
//import com.sun.media.sound.RIFFInvalidDataException;
//
///**
// * @Classname 寻找第一个错误版本
// * @Description TODO
// * @Date 2020/10/5 22:22
// * @Created by 94493
// */
//public class 寻找第一个错误版本 {
//    public int firstBadVersion(int n) {
//        int left = 1;
//
//        while(left<=n){
//            int mid = left+(n-left)/2;
//            if(!isBadVersion(mid)){
//                left = mid+1;
//            } else {
//                n = mid-1;
//            }
//        }
//        return left;
//    }
//}
