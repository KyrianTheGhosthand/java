import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class numbaone {
    public static void main(String[] args) {

    }

    //    Part1-1
    public static int[] inputAt(int[] arrI, int a, int index) {
        for (int i = 0; i < arrI.length; i++) {
            if (i == index) {
                arrI[i] = a;
                break;
            }
        }
        return arrI;
    }

    //Part1-2
    public static int[] removeAt(int[] arrI, int index) {
        for (int i = 0; i < arrI.length; i++) {
            if (i == index) {
                removeAt(arrI, i);
            }
        }
        return arrI;
    }

    //Part 1-3&4
    public static int[] inputAt(int[] arrI, int[] arrS, int index) {
        int[] res = new int[arrI.length + arrS.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = arrI[i];
            if (i == index) {
                for (int j = 0; j < arrS.length; j++) {
                    res[i + j] = arrS[j];
                    res[i + j + 1] = arrI[i + 1];
                }
            }
        }
        return res;
    }
    public static int[] removeAt(int[] arrI, int[] arrD){
        int[] res = new int[arrI.length];
        for(int i = 0; i < res.length; i++){
            res[i] = arrI[i];
            for(int j: arrD){
                if(i == j){
                    removeAt(res,i);
                    break;
                }
            }
        }
        return res;
    }
//    Part 1-5
//public static int[] insertMany(int[] arrI, Map<Integer, int[]> mapS){
//    int[] res = new int[arrI.length + mapS.size()];
//    for(int i = 0; i < res.length; i++){
//        res[i] = arrI[i];
//        if()
//    }
//    return res;
//}
    //    Aux
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    //    Part2
//    1480
    public int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            res[i] = nums[i] + res[i - 1];
        }
        return res;
    }

    //    1672
    public int maximumWealth(int[][] accounts) {
        int maxcap = 0;
        for (int[] customer : accounts) {
            int current = 0;
            for (int bank : customer) {
                current += bank;
            }
            maxcap = Math.max(maxcap, current);
        }
        return maxcap;
    }

    //412
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                res.add("FizzBuzz");
            } else if (i % 3 == 0) {
                res.add("Fizz");
            } else if (i % 5 == 0) {
                res.add("Buzz");
            } else {
                res.add(String.valueOf(i));
            }
        }
        return res;
    }

    //1342
    public int numberOfSteps(int num) {
        int c = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            c++;
        }
        return c;
    }

    //876
    public ListNode middleNode(ListNode head) {
        ArrayList<ListNode> array = new ArrayList<>();

        int length = 0;
        while (head != null) {
            array.add(head);
            head = head.next;
            length++;
        }
        return array.get(length / 2);
    }

    //    383
    public boolean canConstruct(String ransomNote, String magazine) {
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);

            int matcher = magazine.indexOf(c);
            if (matcher == -1) {
                return false;
            }
            magazine = magazine.substring(0, i) + magazine.substring(i + 1);
        }
        return true;
    }

    //    Part3
    //    1929
    public int[] getConcatenation(int[] nums) {
        int[] res = new int[2 * nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i];
            res[i + nums.length] = nums[i];
        }
        return res;
    }

    //1920
    public int[] buildArray(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[nums[i]];
        }
        return res;
    }

    //1512
    public int numIdenticalPairs(int[] nums) {
        int[] count = new int[102];

        for (int num : nums) {
            count[num]++;
        }

        int totalCount = 0;
        for (int i : count) {
            totalCount += ((i) * (i - 1)) / 2;
        }

        return totalCount;
    }

    //1528
    public String restoreString(String s, int[] indices) {
        StringBuilder res = new StringBuilder(s);
        for (int i = 0; i < indices.length; ++i)
            res.setCharAt(indices[i], s.charAt(i));
        return res.toString();
    }

    //1572
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            sum += mat[i][i] + mat[i][n - i - 1];
        }
        if (mat.length % 2 != 0) {
            sum -= mat[n / 2][n / 2];
        }
        return sum;
    }

    //1979
    public int findGCD(int[] nums) {
        int max = 0;
        int min = 1001;

        // Find the min and max from array
        for (int e : nums) {
            max = Math.max(max, e);
            min = Math.min(min, e);
        }
        return gcd(min, max);
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    //    561
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for (int i = 0; i < nums.length; i += 2) {
            res += nums[i];
        }
        return res;
    }

    //905
    public int[] sortArrayByParity(int[] nums) {
        for (int i = 0, j = 0; j < nums.length; j++) {
            if (nums[j] % 2 == 0) {
                int tmp = nums[i];
                nums[i++] = nums[j];
                nums[j] = tmp;
            }
        }
        return nums;
    }

    //75
    public void sortColors(int[] nums) {
        int p1 = 0, p2 = nums.length - 1, index = 0;
        while (index <= p2) {
            if (nums[index] == 0) {
                nums[index] = nums[p1];
                nums[p1] = 0;
                p1++;
            }
            if (nums[index] == 2) {
                nums[index] = nums[p2];
                nums[p2] = 2;
                p2--;
                index--;
            }
            index++;
        }
    }

    //713
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k == 0) return k;
        int count = 0;
        int prod = 1;
        for (int i = 0, j = 0; j < nums.length; j++) {
            prod *= nums[j];
            while (i <= j && prod >= k) {
                prod /= nums[i++];
            }
            count += j - i + 1;
        }
        return count;
    }
}
