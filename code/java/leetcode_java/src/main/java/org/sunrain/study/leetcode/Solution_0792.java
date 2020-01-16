package org.sunrain.study.leetcode;

/**
 * Created by qichao on 2019/11/18.
 * <p>
 * 给定字符串 S 和单词字典 words, 求 words[i] 中是 S 的子序列的单词个数。
 * <p>
 * 示例:
 * 输入:
 * S = "abcde"
 * words = ["a", "bb", "acd", "ace"]
 * 输出: 3
 * 解释: 有三个是 S 的子序列的单词: "a", "acd", "ace"。
 * 注意:
 * <p>
 * 所有在words和 S 里的单词都只由小写字母组成。
 * S 的长度在 [1, 50000]。
 * words 的长度在 [1, 5000]。
 * words[i]的长度在[1, 50]。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/number-of-matching-subsequences
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_0792 {
    public int numMatchingSubseq(String S, String[] words) {
        if (S == null || words == null || words.length == 0) {
            return 0;
        }

        int total = 0;
        for (String str : words) {
            if (isSubsequence(str, S)) {
                total++;
            }
        }

        return total;
    }

    public boolean isSubsequence(String s, String t) {

        if (s == null || t == null) {
            return false;
        }
        int i = 0;
        int indexJ = 0;
        for (; i < s.length(); i++) {
            boolean innerExist = false;
            for (; indexJ < t.length(); indexJ++) {
                if (s.charAt(i) == t.charAt(indexJ)) {
                    innerExist = true;
                    indexJ++;
                    break;
                }
            }
            if (!innerExist) {
                break;
            }
        }

        return i == s.length();
    }
}
