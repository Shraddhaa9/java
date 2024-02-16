package demo9;

// remove duplicates from a string
public class demo9 {
    public static void removeDupl(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int idx = str.indexOf(c, i + 1);
            if (idx == -1) {
                sb.append(c);
            }
        }

        System.out.println(sb);
    }

    public static void main(String[] args) {
        String str = "programming";

        removeDupl(str);
    }
}
