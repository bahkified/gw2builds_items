package net.laureate.item.data;

public class ArmorType {

    private int armor_value;
    private ArmorPrefix prefix;
    private ArmorRune rune;

    public ArmorPrefix getPrefix() {
        return prefix;
    }

    public void setPrefix(ArmorPrefix prefix) {
        this.prefix = prefix;
    }

    public ArmorRune getRune() {
        return rune;
    }

    public void setRune(ArmorRune rune) {
        this.rune = rune;
    }

    public int getArmorValue() {
        return armor_value;
    }

    public void setArmorValue(int armor_value) {
        this.armor_value = armor_value;
    }
}
