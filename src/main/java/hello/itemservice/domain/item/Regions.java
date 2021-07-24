package hello.itemservice.domain.item;

import lombok.Data;

import java.util.LinkedHashMap;
import java.util.Map;

@Data
public class Regions {

    Map<String, String> regions = new LinkedHashMap<>();

    public Regions() {
        regions.put("SEOUL", "서울");
        regions.put("BUSAN", "부산");
        regions.put("JEJU", "제주");
    }
}
