public class ReplaceWithingTemplate {
    public static void main(String[] args) {
        String letter = "Dear <|name|>, lives alot";
        System.out.print(letter.replace("<|name|>","Vibhu"));
    }
}
