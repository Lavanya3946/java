package com.xorkz.Abstraction.Runner;

import com.xorkz.Abstraction.Internal.Army;
import com.xorkz.Abstraction.Internal.RedArmy;
import com.xorkz.Abstraction.Internal.WhiteArmy;

public class ArmyRunner {
    public static void main(String[] args) {
        RedArmy redarmy=new WhiteArmy(500);
        redarmy.protectedBorder();;
        redarmy.useDrone();
        System.out.println(redarmy.toString());


    }
}
