package com.eurder.domain;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ItemRepository {
    private Map<String, Item> itemRepository = new HashMap<>();

    public Item saveItem(Item item){
        itemRepository.put(item.getId(), item);
        return item;
    }
}
