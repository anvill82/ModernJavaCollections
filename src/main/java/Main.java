public class Main {

    private static String reverse(String word) {

        StringBuilder stringBuilder = new StringBuilder(word.length());

        for (int i = 0, j = word.length() - 1; i < word.length(); i++, j--) {
            stringBuilder.append(word.charAt(j));
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("abcdefghijklmnopqrstuvwxyz"));
    }
}
