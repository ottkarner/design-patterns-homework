package task1;

public class StringBuilderDemo {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("This is").append(" a");
        stringBuilder
                .append(" StringBuilderrrrrr")
                .deleteCharAt(stringBuilder.length() - 1)
                .deleteCharAt(stringBuilder.lastIndexOf("r"))
                .delete(stringBuilder.length() - 3, stringBuilder.length())
                .insert(0, "Info: ")
                .append("!")
                .insert(stringBuilder.length() - 1, " object")
                .replace(stringBuilder.indexOf("T"), stringBuilder.indexOf("T") + 1, "t")
                .append(" -> " + stringBuilder.hashCode())
                .replace(stringBuilder.indexOf("!"), stringBuilder.indexOf("!") + 1, "");

        System.out.println(stringBuilder);
    }

}
