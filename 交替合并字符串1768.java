//si山代码
class Solution {
    public String mergeAlternately(String word1, String word2) {
        //先将字符串转换成字符数组，再用循环将字符数组一一添加到一个新的字符栈里。
        //循环条件是某个最短字符串先循环结束
        int len1 = word1.length();
        int len2 = word2.length();
        Stack<Character> ch = new Stack<Character>();
        char[] ch1 = word1.toCharArray();
        char[] ch2 = word2.toCharArray();
        int temp1 =0;
        int temp2 =0;
        if (len1 <= len2){
            for(int i = 0; len1>0; i++){
                ch.add(ch1[i]);
                ch.add(ch2[i]);
                len1--;
                temp1++;

            }
            for(int i = temp1; temp1<len2; i++,temp1++){ch.add(ch2[i]);}

        }
        else{
            for(int i = 0; len2>0; i++)
            {
                ch.add(ch1[i]);
                ch.add(ch2[i]);
                len2--;
                temp2++;
            }
            for(int i = temp2; temp2<len1; i++,temp2++){ch.add(ch1[i]);}

        }
        StringBuilder sb = new StringBuilder();
        while (!ch.empty()) {
            char cht = ch.pop();
            sb.append(cht);
        }

        String res = sb.reverse().toString();
        return res;
    }

}

//优化后：
class Solution {
    //单指针
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        StringBuilder res = new StringBuilder();
        while (i < word1.length() && i < word2.length()) {
            res.append(word1.charAt(i));
            res.append(word2.charAt(i));
            i++;
        }
        if (i == word1.length()) res.append(word2.substring(i));
        if (i == word2.length()) res.append(word1.substring(i));
        return res.toString();
    }
}
