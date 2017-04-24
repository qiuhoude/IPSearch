package com.houde.ip_parse.chunzhen;

import org.junit.Test;

/**
 * Created by Administrator on 2017/4/24 0024.
 */
public class ChunzhenTest {

    @Test
    public void testIp() {
        String IP_FILE = IPSeeker.class.getClassLoader().getResource("qqwry.dat").getPath();
        IPSeeker ip = new IPSeeker(IP_FILE, "");
        //测试IP 58.20.43.13
        String ipS = "118.190.49.243";
        ip.getIPLocation(ipS);
        System.out.println(ip.getIPLocation(ipS).getCountry() + ":" + ip.getIPLocation(ipS).getArea());
    }
}
