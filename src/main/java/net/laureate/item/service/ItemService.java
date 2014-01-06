package net.laureate.item.service;

import net.laureate.item.data.ItemIdListType;
import net.laureate.item.data.ItemType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ItemService {

    // TODO: move to properties file
    private static final String ITEM_DETAIL_URL = "https://api.guildwars2.com/v1/item_details.json?item_id=";
    private static final String ALL_ITEMS_URL = "https://api.guildwars2.com/v1/items.json";

    private static ItemIdListType all_items_by_id;

    /**
     * Get the details of an item by specifying the item's ID number.
     *
     * @param id
     * @return
     */
    public ItemType getItemById(long id) {

        RestTemplate template = new RestTemplate();
        ItemType item = template.getForObject(ITEM_DETAIL_URL + id, ItemType.class);

        return item;
    }

    /**
     * Get a list of all item IDs. The list of items is cached on first retrieval.
     *
     * @return
     */
    public ItemIdListType getAllItemIds() {

        if (all_items_by_id == null) {
            RestTemplate template = new RestTemplate();
            all_items_by_id = template.getForObject(ALL_ITEMS_URL, ItemIdListType.class);
        }

        return all_items_by_id;
    }

}
