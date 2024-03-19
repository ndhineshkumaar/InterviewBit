import java.util.*;

public class LogReorderer {

    public static String[] reorderLogFiles(String[] logs) {
        List<String> letterLogs = new ArrayList<>();
        List<String> digitLogs = new ArrayList<>();

        for (String log : logs) {
            String[] parts = log.split("-", 2);
            if (Character.isDigit(parts[1].charAt(0))) {
                digitLogs.add(log);
            } else {
                letterLogs.add(log);
            }
        }

        Comparator<String> logComparator = new Comparator<String>() {
            @Override
            public int compare(String log1, String log2) {
                String[] split1 = log1.split("-", 2);
                String[] split2 = log2.split("-", 2);
                String content1 = split1[1];
                String content2 = split2[1];
                int cmp = content1.compareTo(content2);
                if (cmp != 0) {
                    return cmp;
                } else {
                    return split1[0].compareTo(split2[0]);
                }
            }
        };

        Collections.sort(letterLogs, logComparator);

        String[] result = new String[logs.length];
        int i = 0;
        for (String log : letterLogs) {
            result[i++] = log;
        }
        for (String log : digitLogs) {
            result[i++] = log;
        }

        return result;
    }

    public static void main(String[] args) {
        String[] logs1 = {"dig1-8-1-5-1", "let1-art-can", "dig2-3-6", "let2-own-kit-dig", "let3-art-zero"};
        String[] reorderedLogs1 = reorderLogFiles(logs1);
        System.out.println(Arrays.toString(reorderedLogs1));

        String[] logs2 = {"a1-9-2-3-1","g1-act-car","zo4-4-7","ab1-off-key-dog","a8-act-zoo"};
        String[] reorderedLogs2 = reorderLogFiles(logs2);
        System.out.println(Arrays.toString(reorderedLogs2));
    }
}
