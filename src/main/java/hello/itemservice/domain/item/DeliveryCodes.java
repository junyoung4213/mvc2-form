package hello.itemservice.domain.item;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class DeliveryCodes {

    List<DeliveryCode> deliveryCode = new ArrayList<>();

    public DeliveryCodes() {
        deliveryCode.add(new DeliveryCode("FAST", "빠른 배송"));
        deliveryCode.add(new DeliveryCode("NORMAL", "일반 배송"));
        deliveryCode.add(new DeliveryCode("SLOW", "느린 배송"));
    }
}
