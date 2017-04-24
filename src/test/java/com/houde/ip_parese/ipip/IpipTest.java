package com.houde.ip_parese.ipip;

import com.houde.ip_parse.ipip.IP;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/4/24 0024.
 */
public class IpipTest {

    @Test
    public void testIp() {
        String dataPath = IP.class.getClassLoader().getResource("17monipdb.dat").getPath();
        System.out.println(dataPath);
        IP.load(dataPath);
        System.out.println(Arrays.toString(IP.find("192.168.0.1")));
    }
}
