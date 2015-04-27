/*
 * make abs?
 * 
 */
package Items;

import battleOptions.AttackBehavior;
import statCard.StatsCard;

/** 
 * @author Bryce Fenske
 */
public class Weapon {
    private String name;
    private StatsCard stats;
    private AttackBehavior atkBhv;
    
//    private DamageType damage;
//    private String description;

    public Weapon(String name, StatsCard stats, AttackBehavior atkBhv) {
        this.name = name;
        this.stats = stats;
        this.atkBhv = atkBhv;
    }

    public String getName() {
        return name;
    }

    public StatsCard getStats() {
        return stats;
    }

    public AttackBehavior getAtkBhv() {
        return atkBhv;
    }
    
}
