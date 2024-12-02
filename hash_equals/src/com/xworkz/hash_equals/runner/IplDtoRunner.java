package com.xworkz.hash_equals.runner;

import com.xworkz.hash_equals.Dto.IplTeamDto;

public class IplDtoRunner {
    public static void main(String[] args) {
        IplTeamDto iplTeamDto1=new IplTeamDto("RCB",24,"salman",56);
        IplTeamDto iplTeamDto2=new IplTeamDto("RCB",24,"salman",56);

        System.out.println("Ipl1 is equals to ipl2:"+iplTeamDto1.equals(iplTeamDto2));
        System.out.println("Ipl1 hash code:"+iplTeamDto1.hashCode());
        System.out.println("Ipl2 hash code:"+iplTeamDto1.hashCode());

    }
}
