package com.eurder.api.item;

import com.eurder.domain.Item;
import com.eurder.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping (path = "items")
public class ItemController {
    private ItemService itemService;
    private ItemMapper itemMapper;

    @Autowired
    public ItemController(ItemService itemService, ItemMapper itemMapper) {
        this.itemService = itemService;
        this.itemMapper = itemMapper;
    }

    @PostMapping (consumes = "application/json", produces = "application/json")
    @ResponseStatus (HttpStatus.CREATED)
    public ItemDto createItem(@RequestBody CreateItemDto createItemDto){
        return itemMapper.mapToItemDto(itemService.saveItem(new Item(createItemDto.getName(), createItemDto.getDescription(),
                createItemDto.getPrice(), createItemDto.getAmountOnStock())));
    }
}
