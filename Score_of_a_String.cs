/*
https://leetcode.com/problems/score-of-a-string/description/
*/
public class Solution {
    public int ScoreOfString(string s) {
        int suma = 0;

        for (int i = 1; i < s.Length; i++) {
            suma += Math.Abs(s[i] - s[i - 1]);
        }

        return suma;
    }
}