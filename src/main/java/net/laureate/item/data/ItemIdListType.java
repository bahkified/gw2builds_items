package net.laureate.item.data;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemIdListType {

    private int[] items;

    public int[] getItems() {
        return items;
    }
}
