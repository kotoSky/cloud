package cn.sky.item.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item {

    private Long id;

    private String title;

    private String pic;

    private String desc;

    private Long price;

}