/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Items;

import Classes.PlayerClass;

/**
 *
 * @author Bryce Fenske
 */
public abstract class Equipable {
    private PlayerClass classReq[];
    private int levelReq;
    
    public Equipable(PlayerClass[] req, int lreq)
    {
        classReq = req;
        levelReq = lreq;
    }
    
    public int getLevelReq() {
        return levelReq;
    }
    
    public boolean canEquip(PlayerClass p)
    {
        for(PlayerClass r: classReq)
        {
            if(r == p || r == PlayerClass.ALL)
            {
                return true;
            }
        }
        return false;
    }
}
