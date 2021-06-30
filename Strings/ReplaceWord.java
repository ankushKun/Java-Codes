public class ReplaceWord {
    public static void main(String[] args) {
        String sentence = "RED BOTTLE IS IN A RED BAG ON A RED CARPET "; // the original sentence
        String r1 = "RED"; // word to be replaced
        String r2 = "GREEN"; // the word to replace with
        int words = 11; // number or words in the sentence
        String[] wordList = new String[words];// array of words in the sentence
        String w = "";// temporary variable to store each word
        int pos = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                wordList[pos] = w;// append the word to the array
                // System.out.println(w);
                w = "";
                pos++;
            } else {
                w = w + sentence.charAt(i);// keep adding characters to create the word
            }
        }
        for (int i = 0; i < wordList.length; i++) {
            if (wordList[i].equals(r1)) {// check if word equals the word to be replaced
                wordList[i] = r2;// repalace the word from the array
            }
        }
        for (int i = 0; i < wordList.length; i++) {
            System.out.print(wordList[i] + " ");// print the sentence
        }
        System.out.println();

    }
}
