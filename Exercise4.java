public class Exercise4 {
    public static void main(String[] args) {
        //密文，可以随便改
        String coded = "G tgsl Qefe.";

        //示例映射，你可以按照作业给的表格修改这两个数组
        char[] codedChars = {'G','t','g','s','l','Q','e','f'};
        char[] realChars  = {'H','h','o','l','l','W','e','l'};

        StringBuilder output = new StringBuilder();

        for(int i = 0; i < coded.length(); i++){
            char c = coded.charAt(i);
            boolean found = false;
            //查找是否在编码表
            for(int k=0; k<codedChars.length;k++){
                if(c == codedChars[k]){
                    output.append(realChars[k]);
                    found = true;
                    break;
                }
            }
            //没找到（空格、.等符号）直接原样放
            if(!found){
                output.append(c);
            }
        }
        System.out.println("Coded: " + coded);
        System.out.println("Decoded: "+ output);
    }
}
