package net.laureate.item.data;

public class WeaponType {

    public class DamageType {

        private int min;
        private int max;

        /**
         * Average damage
         *
         * @return
         */
        public int getDamage() {
            return max + min / 2;
        }

        public int getMin() { return min; }

        public void setMin(int min) {
            this.min = min;
        }

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }
    }

    private DamageType dmg;
    private StatsType baseStats;
    private SigilType sigil;

    private boolean isTwoHanded;
    private boolean canBeMainhand;
    private boolean canBeOffhand;

    public boolean canBeMainhand() {
        return canBeMainhand;
    }

    public void setCanBeMainhand(boolean canBeMainhand) {
        this.canBeMainhand = canBeMainhand;
    }

    public boolean canBeOffhand() {
        return canBeOffhand;
    }

    public void setCanBeOffhand(boolean canBeOffhand) {
        this.canBeOffhand = canBeOffhand;
    }

    public boolean isTwoHanded() {
        return isTwoHanded;
    }

    public void setTwoHanded(boolean isTwoHanded) {
        this.isTwoHanded = isTwoHanded;
    }
}
