package com.ks_xlm.Common;

import com.fasterxml.jackson.databind.JsonNode;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.apache.commons.lang3.StringUtils;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JWTUtil {

    private static final int DEFAULT_EXPIR_SECONDS = 86400;

    public static boolean validToken(String token , String key){
        if(token == null || key == null) return false;
        try{
            Jwts.parser().setSigningKey(key).parseClaimsJws(token);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public static String generateToken(String uid,String key){
        return generateToken(uid,DEFAULT_EXPIR_SECONDS ,key);
    }

    public static String generateToken(String uid,int seconds, String key){
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("uid", uid);
        Claims claims = Jwts.claims(data);
        String token = Jwts.builder()
                .setClaims(claims)
                .setIssuedAt(new Date())
                .setExpiration(getExpireDate(seconds))
                .signWith(SignatureAlgorithm.HS256, key)
                .compact();
        return token;
    }

    private static Date getExpireDate(int seconds){
        Date now = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(now);
        cal.add(Calendar.SECOND , seconds);
        return cal.getTime();
    }

    public static String getUidByToken(String token){
        if(StringUtils.isBlank(token)){
            return "";
        }
        String[] arr = token.split("\\.");
        if(null != arr && arr.length == 3){
            String json = "";
            try {
                json = new String(Base64Util.decode(arr[1]));
            } catch (Exception e) {
                e.printStackTrace();
            }
            JsonNode node = JsonUtil.getJsonNodeByContent(json);
            if(null != node) {
                return node.get("uid").asText();
            }
        }
        return "";
    }

}
