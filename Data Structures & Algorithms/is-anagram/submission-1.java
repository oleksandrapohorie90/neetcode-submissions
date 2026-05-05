class Solution {
    public boolean isAnagram(String s, String t) {

        char [] chArr1 = s.toCharArray();

        char [] chArr2 = t.toCharArray();

        Arrays.sort(chArr1);
        Arrays.sort(chArr2);

        return Arrays.equals(chArr1, chArr2);

    }
}
