class Solution {
    public boolean isIsomorphic(String s, String t) {
        //Check if both the strings are equal
        if(s.length()!=t.length()){
            return false;
        }

        //Create two hash maps to store the mappings from s to t and from t to s
        HashMap<Character, Character> sToT = new HashMap<>();
        HashMap<Character, Character> tToS = new HashMap<>();

        //Iterate through each character in the strings
        for(int i = 0; i<s.length(); i++){
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            //Check if the character in s has already been mapped to a different character in t
            if(sToT.containsKey(charS)){
                if(sToT.get(charS)!=charT){
                    return false;
                }
            }else{
                //If not, then map the character in s to the character in t
                sToT.put(charS, charT);
            }

            //Check if the character in t has been already mapped to a different character in s
            if (tToS.containsKey(charT)){
                if(tToS.get(charT)!=charS){
                    return false;
                }
            }else{
                //If npt then map the character in t to the character in s
                tToS.put(charT, charS);
            }
        }
        //If all the characters are mapped without any confilicts, return true
        return true;
    }
}
