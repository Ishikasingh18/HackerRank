

    public static String getSmallestAndLargest(String s, int k) {
        String substring = s.substring(0, k);
        String smallest = substring;
        String largest = substring;
        
        for (int i = 1; i <= s.length() - k; i++) {
            // Create a substring of length 'k'
            substring = s.substring(i, i + k);
                
            // If current substring is lexicographically smaller than 'smallest'
            if (substring.compareTo(smallest) < 0) {
                smallest = substring;
            }
            
            // If current substring is lexicographically larger than 'largest'
            if (substring.compareTo(largest) > 0) {
                largest = substring;
            }
        }
        
        return smallest + "\n" + largest;
    }

