package com.ffwl.concert.service.util;

import java.util.List;

public class DataUtils {
    public static boolean isListAvali(List list) {
        if(list==null||list.size()==0){
            return false;
        }
        return true;
    }
}
