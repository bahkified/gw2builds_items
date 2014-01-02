package net.laureate.item.data;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemType {

    private long id;
    private String name;
    private String description;
    private int level;
    private String type;
    private String rarity;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getLevel() {
        return level;
    }

    public String getType() {
        return type;
    }

    public String getRarity() {
        return rarity;
    }

    @Override
    public String toString() {
        return "ItemType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", level=" + level +
                ", type='" + type + '\'' +
                ", rarity='" + rarity + '\'' +
                '}';
    }
}
