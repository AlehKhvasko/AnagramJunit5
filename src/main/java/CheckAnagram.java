public class CheckAnagram {
    public boolean isAnagramCheck(String firstWord, String secondWord){
        char[] firstWordChar = removeBlankSpaces(firstWord).toLowerCase().toCharArray();
        char[] secondWordChar = removeBlankSpaces(secondWord).toLowerCase().toCharArray();

        for (char letter:firstWordChar) {
            if (letter < 96){
                return false;
            }
        }

        if (firstWordChar.length != secondWordChar.length || firstWordChar.length < 1){
            return  false;
        }

        char[] anagramWord = new char[removeBlankSpaces(firstWord).length()];

        for (int i = 0; i < firstWordChar.length; i++) {
            for (int j = 0; j < firstWordChar.length; j++) {
                if (firstWordChar[i] == secondWordChar[j]){
                    anagramWord[i] = secondWordChar[j];
                }
            }
        }
        String stringAnagram = String.valueOf(anagramWord);
        return stringAnagram.equals(removeBlankSpaces(firstWord));
    }

    public String removeBlankSpaces(String word){
        return word.replaceAll(" ", "");
    }
}
