package br.com.jwt.utils;

import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class Utils {

    public static Key gerarChave() {
        String keyString = "VDIpKUX6DLNfkbuESWV/9LSyYJPHN8zqzkbIL/0D33A="; //”Jefferson” após SHA-256 e EncodeBase64;
        Key key = new SecretKeySpec(keyString.getBytes(), 0, keyString.getBytes().length, "HmacSHA256");
        return key;
    }

    public static Date definirDataDeExpiracao(long tempoEmMinutos) {
        LocalDateTime localDateTime = LocalDateTime.now().plusMinutes(tempoEmMinutos);
        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

}
