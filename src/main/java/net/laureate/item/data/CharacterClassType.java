package net.laureate.item.data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;

public enum CharacterClassType {

    WARRIOR("warrior"),
    GUARDIAN("guardian"),
    THIEF("thief"),
    ENGINEER("engineer"),
    RANGER("ranger"),
    ELEMENTALIST("elementalist"),
    NECROMANCER("necromancer"),
    MESMER("mesmer");

    private static final String PROPS = "CharacterClasses.properties";

    private StatsType baseStats;
    private String char_class;
    private boolean hasSecondWeaponSet;

    private Logger logger = LoggerFactory.getLogger(getClass());

    private CharacterClassType(String char_class) {
        this.char_class = char_class;
        setAttributesFromProps();
    }

    private void setAttributesFromProps() {
        try {
            Properties stats = PropertiesLoaderUtils.loadAllProperties(PROPS);

            baseStats = new StatsType();

            baseStats.setPower(Integer.parseInt(stats.getProperty(char_class + ".power")));
            baseStats.setPrecision(Integer.parseInt(stats.getProperty(char_class + ".precision")));
            baseStats.setCondition_damage(Integer.parseInt(stats.getProperty(char_class + ".conditiondamage")));
            baseStats.setToughness(Integer.parseInt(stats.getProperty(char_class + ".toughness")));
            baseStats.setVitality(Integer.parseInt(stats.getProperty(char_class + ".vitality")));
            baseStats.setHealing_power(Integer.parseInt(stats.getProperty(char_class + ".healingpower")));

            hasSecondWeaponSet = Integer.parseInt(stats.getProperty(char_class + ".numweaponsets")) == 2
                    ? true : false;

        } catch(IOException e) {
            logger.debug("Failed to load properties file: " + PROPS + "\n" + e.getMessage());
        } catch(NumberFormatException e) {
            logger.debug("Failed to parse property\n" + e.getMessage());
        }
    }

    public StatsType getBaseStats() {
        return baseStats;
    }

    public boolean hasSecondWeaponSet() {
        return hasSecondWeaponSet;
    }

}
