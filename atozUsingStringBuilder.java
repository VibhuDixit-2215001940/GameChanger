public class atozUsingStringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<26;i++){
            char ch = (char)('a'+i);
            builder.append(ch+" ");
        }
        System.out.println(builder.toString());//a b c d e f g h i j k l m n o p q r s t u v w x y z 
    }
}
