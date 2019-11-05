package com.eurder.api.item;
import com.eurder.domain.Item;
import org.springframework.stereotype.Component;

@Component
public class ItemMapper {
    public ItemDto mapToItemDto(Item item) {
        ItemDto itemDto = new ItemDto();
        itemDto.setId(item.getId());
        itemDto.setName(item.getName());
        itemDto.setDescription(item.getDescription());
        itemDto.setPrice(item.getPrice());
        itemDto.setAmountOnStock(item.getAmountOnStock());
        return itemDto;
    }
}