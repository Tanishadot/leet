class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        HashMap<Character, Integer> s1Map = new HashMap<>();
        HashMap<Character, Integer> windowMap = new HashMap<>();
        for (char c : s1.toCharArray()) {
            s1Map.put(c, s1Map.getOrDefault(c, 0) + 1);
        }

        int windowSize = s1.length();

        for (int i = 0; i < windowSize; i++) {
            char c = s2.charAt(i);
            windowMap.put(c, windowMap.getOrDefault(c, 0) + 1);
        }

        if (s1Map.equals(windowMap)) {
            return true;
        }
        for (int i = windowSize; i < s2.length(); i++) {
            char add = s2.charAt(i);
            char remove = s2.charAt(i - windowSize);

            
            windowMap.put(add, windowMap.getOrDefault(add, 0) + 1);


            windowMap.put(remove, windowMap.get(remove) - 1);
            if (windowMap.get(remove) == 0) {
                windowMap.remove(remove);
            }

            if (s1Map.equals(windowMap)) {
                return true;
            }
        }

        return false;
    }
}