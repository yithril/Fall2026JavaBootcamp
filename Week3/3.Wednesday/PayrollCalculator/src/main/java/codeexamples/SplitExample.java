package codeexamples;

public class SplitExample {
    public static void main(String[] args) {
        String row = "10|Dana Wyatt|52.5|12.50";

        String[] brokenUpRow = row.split("\\|");

        System.out.println(brokenUpRow[2]);
    }
}
