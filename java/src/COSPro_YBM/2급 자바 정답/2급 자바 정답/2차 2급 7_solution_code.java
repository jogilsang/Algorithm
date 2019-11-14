class Solution {
    public int solution(int value, String unit) {
        int converted = 0;
        if (unit.equals("C"))
            converted = (int)((value * 1.8) + 32);
        if (unit.equals("F"))
            converted = (int)((value - 32) / 1.8);
        return converted;
    }
}
