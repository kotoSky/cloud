package cn.sky.order.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderDetail {

    private String orderId;

    private Item item = new Item();

}