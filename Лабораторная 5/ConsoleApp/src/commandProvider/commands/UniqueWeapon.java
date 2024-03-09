package commandProvider.commands;

import spaceMarines.SpaceMarine;
import spaceMarines.Weapon;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


public class UniqueWeapon {

    public static void WeaponCommand(LinkedList<SpaceMarine> collection){
        Map<Weapon,Integer> dict = new HashMap<>();
        dict.put(Weapon.BOLTGUN,0);
        dict.put(Weapon.FLAMER,0);
        dict.put(Weapon.BOLT_RIFLE,0);
        dict.put(Weapon.INFERNO_PISTOL,0);
        dict.put(Weapon.COMBI_PLASMA_GUN,0);
        for (SpaceMarine sp : collection){
            if (sp.getWeaponType() == Weapon.BOLTGUN){
                int newValue = dict.get(Weapon.BOLTGUN) + 1;
                dict.put(Weapon.BOLTGUN,newValue);
            } else if (sp.getWeaponType() == Weapon.FLAMER) {
                int newValue = dict.get(Weapon.FLAMER) + 1;
                dict.put(Weapon.FLAMER,newValue);

            }else if (sp.getWeaponType() == Weapon.BOLT_RIFLE) {
                int newValue = dict.get(Weapon.BOLT_RIFLE) + 1;
                dict.put(Weapon.BOLT_RIFLE,newValue);

            }else if (sp.getWeaponType() == Weapon.INFERNO_PISTOL) {
                int newValue = dict.get(Weapon.INFERNO_PISTOL) + 1;
                dict.put(Weapon.INFERNO_PISTOL,newValue);

            }else if (sp.getWeaponType() == Weapon.COMBI_PLASMA_GUN) {
                int newValue = dict.get(Weapon.COMBI_PLASMA_GUN) + 1;
                dict.put(Weapon.COMBI_PLASMA_GUN,newValue);

            }
        }
        if (dict.get(Weapon.BOLTGUN) > 0){
            System.out.println("Количество оружия BOLTGUN: " + dict.get(Weapon.BOLTGUN));
        }
        if (dict.get(Weapon.FLAMER) > 0){
            System.out.println("Количество оружия FLAMER: " + dict.get(Weapon.FLAMER));
        }
        if (dict.get(Weapon.INFERNO_PISTOL)>0){
            System.out.println("Количество оружия INFERNO_PISTOL: "+ dict.get(Weapon.INFERNO_PISTOL));
        }
        if (dict.get(Weapon.BOLT_RIFLE)>0){
            System.out.println("Количество оружия BOLT_RIFLE: " + dict.get(Weapon.BOLT_RIFLE));
        }
        if (dict.get(Weapon.COMBI_PLASMA_GUN)>0){
            System.out.println("Количество оружия COMBI_PLASMA_GUN: " + dict.get(Weapon.COMBI_PLASMA_GUN));
        }
        if (dict.get(Weapon.COMBI_PLASMA_GUN) == 0 && dict.get(Weapon.FLAMER) == 0 && dict.get(Weapon.BOLTGUN) == 0 && dict.get(Weapon.BOLT_RIFLE) == 0 && dict.get(Weapon.INFERNO_PISTOL) == 0){
            System.out.println("Ни один дозорный не владеет оружием :(");
        }

    }
}
