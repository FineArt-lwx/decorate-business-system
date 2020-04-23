package com.enums;

import com.finearter.dbs.enums.PayStatus;
import org.junit.Test;

public class EnumTest {

    @Test
    public void testPayStatus(){
        System.out.println(PayStatus.getStatusString(0));

    }
}
