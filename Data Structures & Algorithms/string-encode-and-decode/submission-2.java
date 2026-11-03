class Solution {

    public String encode(List<String> strs) {
        int n = strs.size();
        String str1 = "";
        String str2 = "";

        for (int i = 0; i < n; i++) {
            String s = strs.get(i);

            if (i != n - 1) {
                str1 = str1 + s.length() + ",";
            } else {
                str1 = str1 + s.length();
            }

            str2 = str2 + s;
        }

        return str1 + "#" + str2;
    }

    public List<String> decode(String str) {
    List<String> res = new ArrayList<>();

    if (str.equals("#")) {
        return res;
    }

    String[] s = str.split("#", 2);
    String[] s1 = s[0].split(",");

    String s2 = s[1];

    int i = 0;

    for (String st : s1) {
        int n = Integer.parseInt(st);
        String newStr = "";

        for (int j = 0; j < n; j++) {
            newStr = newStr + s2.charAt(i);
            i++;
        }

        res.add(newStr);
    }

    return res;
}
}
