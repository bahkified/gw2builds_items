package net.laureate.item.data;

import java.util.List;

public class BuildType {

    private long id = -1;
    @Deprecated
    private String content;

    private CharacterClassType characterClass;

    private WeaponSetType set1;
    private WeaponSetType set2;
    private WeaponSetType underwater1;
    private WeaponSetType underwater2;

    private ArmorSetType armorSet;
    private AccessorySetType accessories;

    private TraitSetType traits;
    private List<SkillType> skills;

    public List<SkillType> getSkills() {
        return skills;
    }

    public void setSkills(List<SkillType> skills) {
        this.skills = skills;
    }

    public TraitSetType getTraits() {
        return traits;
    }

    public void setTraits(TraitSetType traits) {
        this.traits = traits;
    }

    public CharacterClassType getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(CharacterClassType characterClass) {
        this.characterClass = characterClass;
    }

    public WeaponSetType getSet1() {
        return set1;
    }

    public void setSet1(WeaponSetType set1) {
        this.set1 = set1;
    }

    public WeaponSetType getSet2() {
        return set2;
    }

    public void setSet2(WeaponSetType set2) {
        if (characterClass.hasSecondWeaponSet()) {
            this.set2 = set2;
        }
    }

    public ArmorSetType getArmorSet() {
        return armorSet;
    }

    public void setArmorSet(ArmorSetType armorSet) {
        this.armorSet = armorSet;
    }

    public WeaponSetType getUnderwater1() {
        return underwater1;
    }

    public void setUnderwater1(WeaponSetType underwater1) {
        this.underwater1 = underwater1;
    }

    public WeaponSetType getUnderwater2() {
        return underwater2;
    }

    public void setUnderwater2(WeaponSetType underwater2) {
        if (characterClass.hasSecondWeaponSet()) {
            this.underwater2 = underwater2;
        }
    }

    public AccessorySetType getAccessories() {
        return accessories;
    }

    public void setAccessories(AccessorySetType accessories) {
        this.accessories = accessories;
    }

    @Deprecated
    public String getContent() {
        return content;
    }

    @Deprecated
    public void setContent(String content) {
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
