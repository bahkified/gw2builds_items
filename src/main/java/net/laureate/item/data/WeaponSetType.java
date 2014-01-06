package net.laureate.item.data;

public class WeaponSetType {

    private WeaponType mainhand;
    private WeaponType offhand;

    public WeaponType getMainhand() { return mainhand; }

    public void setMainhand(WeaponType mainhand) {

        if (!mainhand.canBeMainhand()) {
            throw new UnsupportedOperationException("Weapon "
                    + mainhand + " cannot be used in the mainhand slot!");
        }

        this.mainhand = mainhand;
        if (mainhand.isTwoHanded()) {
            setOffhand(null);
        }
    }

    public WeaponType getOffhand() {
        return offhand;
    }

    public void setOffhand(WeaponType offhand) {

        if (!offhand.canBeOffhand()) {
            throw new UnsupportedOperationException("Weapon "
                    + offhand + " cannot be used in the offhand slot!");
        }

        this.offhand = offhand;
        if (mainhand.isTwoHanded()) {
            setMainhand(null);
        }

    }
}
