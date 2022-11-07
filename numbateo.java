import java.util.HashMap;

public class numbateo {
    public static void main(String[] args) {

    }

    //1108
    public String defangIPaddr(String address) {
        final StringBuilder s = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.')
                s.append("[.]");
            else
                s.append(address.charAt(i));
        }

        return s.toString();
    }

    //2011
    public int finalValueAfterOperations(String[] operations) {
        int res = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].charAt(1) == '+') res++;
            else res--;
        }
        return res;
    }

    //    2114
    public int mostWordsFound(String[] sentences) {
        int res = 0;
        for (int i = 0; i < sentences.length; i++) {
            res = Math.max(res, (sentences[i].split(" ")).length);
        }
        return res;
    }

    //771
    public int numJewelsInStones(String jewels, String stones) {
        int[] cnt = new int[128];
        for (char c : stones.toCharArray())
            cnt[c]++;
        int res = 0;
        for (char c : jewels.toCharArray())
            res += cnt[c];
        return res;
    }

    //    1678
    public String interpret(String command) {
        StringBuilder res = new StringBuilder(command.length());
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') res.append('G');
            if (command.charAt(i) == '(') {
                if (command.charAt(i + 1) == ')') {
                    res.append('o');
                    i++;
                } else {
                    res.append("al");
                    i = i + 3;
                }
            }
        }
        return res.toString();
    }

    //2325
    public String decodeMessage(String key, String message) {
        StringBuilder res = new StringBuilder();
        key = key.replaceAll(" ", "");
        HashMap<Character, Character> letters = new HashMap<>();
        char original = 'a';
        for (int i = 0; i < key.length(); i++) {
            if (!letters.containsKey(key.charAt(i))) {
                letters.put(key.charAt(i), original++);
            }
        }
        for (int i = 0; i < message.length(); i++) {
            if (letters.containsKey(message.charAt(i))) {
                res.append(letters.get(message.charAt(i)));
            } else {
                res.append(message.charAt(i));
            }
        }
        return res.toString();
    }

    //1221
    public int balancedStringSplit(String s) {
        int res = 0, cnt = 0;
        for (int i = 0; i < s.length(); ++i) {
            cnt += s.charAt(i) == 'R' ? 1 : -1;
            if (cnt == 0) ++res;
        }
        return res;
    }

    //557
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        for (int i = 0; i < str.length; i++) {
            str[i] = new StringBuilder(str[i]).reverse().toString();
        }
        StringBuilder result = new StringBuilder();
        for (String st : str) {
            result.append(st + " ");
        }
        return result.toString().trim();
    }

    //1859
    public String sortSentence(String s) {
        String[] str = s.split(" ");
        String[] res = new String[str.length];
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (String elem : str) {
            i = (int) (elem.charAt(elem.length() - 1) - '0');
            res[i - 1] = elem.substring(0, elem.length() - 1);
        }
        for (i = 0; i < res.length - 1; i++)
            sb.append(res[i]).append(" ");
        sb.append(res[i]);
        return sb.toString();
    }
}
