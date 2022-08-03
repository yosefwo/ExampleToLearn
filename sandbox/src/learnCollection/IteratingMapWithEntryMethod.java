package learnCollection;

import java.util.HashMap;
import java.util.Map;

public class IteratingMapWithEntryMethod {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("Dan", "03-9516743");
        map.put("Rita", "09-5076452");
        map.put("Leo", "08-5530098");
        map.put("Rita", "06-8201124");
        for (Map.Entry<String,String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + ": " +
                    entry.getValue());

        }
    }
}
