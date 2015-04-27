/*
 * make abs?
 * should character have a damage type for attack or just use the weapons and scale w/attributes?
 * 
 * provide overloaded constructors for different points of character creation
 * level up pass in new char? how to handle level up?
 * 
 * have attack/defense behaviors at character level? that way accessible higher up.
 */
package Character;

import Classes.PlayerClass;
import DTnCAobs.DamageType;
import Items.Weapon;
import battleOptions.AttackBehavior;
import battleOptions.DefendBehavior;
import statCard.StatsCard;

/**
 *
 * @author Bryce Fenske
 */
public class Character {
    
    private PlayerClass pClass; //change this for monster class?
    private int currentHp;
    private int level;
    private String name;
    private StatsCard stats;
    private Weapon weap;
    private DefendBehavior defBhv; //will replace with armor or sheild or some such, probably change constructor

    public PlayerClass getPlayerClass() {
        return pClass;
    }

    public DefendBehavior getDefBhv() {
        return defBhv;
    }
    
//    private CharAttributes attr;
//    private DamageType resist;

    public Character(PlayerClass pClass, String name, StatsCard stats, Weapon weap, DefendBehavior defBhv) {
        this(pClass, name, stats, weap, defBhv, /* stats hp?*/ 9000, 1);
    }
    
    public Character(Character ch)
    {
        this(ch.getPlayerClass(), ch.getName(), ch.getStats(), ch.getWeap(), ch.getDefBhv(), ch.getCurrentHp(), ch.getLevel());
    }

    public Character(PlayerClass pClass, String name, StatsCard stats, Weapon weap, DefendBehavior defBhv, int currentHp, int level) {
        this.pClass = pClass;
        this.currentHp = currentHp;
        this.level = level;
        this.name = name;
        this.stats = stats;
        this.weap = weap;
        this.defBhv = defBhv;
    }

    public Character(PlayerClass pClass, String name) { //Character creation constructer
        //this()
        this.pClass = pClass;
        this.name = name;
        
    }
    
    
    
    public StatsCard getStats()
    {
        return stats.clone();
    }
    
    public int getLevel() {
        return level;
    }
    
//    public CharAttributes getAttr() {
//        return attr;
//    }

//    public DamageType getResist() {
//        return resist;
//    }

    public Weapon getWeap() {
        return weap;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public AttackBehavior getAtkBhv() {
        return weap.getAtkBhv();
    }
    
    
    public String getName() {
        return name;
    }
    
//    public Character(CharAttributes attr, DamageType resist, Weapon weap, String name) {
//        this(attr, resist, weap, name, 1);
//    }
//    
//    public Character(CharAttributes attr, DamageType resist, Weapon weap, String name, int lvl) {
//        this.attr = attr;
//        this.resist = resist;
//        this.weap = weap;
//        this.name = name;
//        this.currentHp = attr.getHp();
//        this.level = lvl;
//    }
//    
//    public Character(Character ch)
//    {
//        this(ch.getAttr(), ch.getResist(), ch.getWeap(), ch.getName(), ch.getLevel());
//    }

    
}
