public class Exercise3 {
    public static void main(String[] args) {
        String sentence = "To be or not to be.";
        //切割成单词数组，按空格分割
        String[] words = sentence.split(" ");
        String result = "";

        for (String word : words) {
            //单词转字符数组
            char[] chars = word.toCharArray();
            //反转字符数组
            int left = 0;
            int right = chars.length - 1;
            while(left < right){
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
            String reversedWord = new String(chars);
            result = result + reversedWord + " ";
        }
        System.out.println("Original: " + sentence);
        System.out.println("Result:   " + result.trim());
    }
}
