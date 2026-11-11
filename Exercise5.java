public class Exercise5 {
    public static void main(String[] args) {
        //题目给的10段文本
        String[] paragraphs = new String[10];
        paragraphs[0]="Lose all the weight you want.";
        paragraphs[1]="I can't I must work";
        paragraphs[2]="That would be like a keyword search.";
        paragraphs[3]="This would be Victoria.";
        paragraphs[4]="Join the party.";
        paragraphs[5]="To be or not to be.";
        paragraphs[6]="That is a question to test keyword search.";
        paragraphs[7]="Can you find a needle in a hay stack?";
        paragraphs[8]="This could be the last paragraph, but its not.";
        paragraphs[9]="Ada Lovelace is the worlds first programmer as of 1860.";

        //要搜索的短语，可以修改
        String searchPhrase = "keyword search";

        boolean foundAny = false;

        for(int i = 0; i < paragraphs.length; i++){
            if(paragraphs[i].contains(searchPhrase)){
                System.out.println("✅ Found at index = " + i);
                System.out.println("Paragraph: " + paragraphs[i]);
                System.out.println("--------");
                foundAny = true;
            }
        }

        if(!foundAny){
            System.out.println("❌ Phrase not found in any paragraph.");
        }
    }
}

