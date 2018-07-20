/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algostuff;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author joel.eze
 */
public class Encrypt {
    public String harden(String unencryptedString){
        String base64EncryptedString = "";
        try{
            MessageDigest md = MessageDigest.getInstance("md5");
	byte[] digestOfPassword = md.digest(unencryptedString.getBytes("utf-8"));
	byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);

	for (int j = 0, k = 16; j < 8;) {
		keyBytes[k++] = keyBytes[j++];
	}

	SecretKey secretKey = new SecretKeySpec(keyBytes, "DESede");
	Cipher cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");
	cipher.init(Cipher.ENCRYPT_MODE, secretKey);

	byte[] plainTextBytes = unencryptedString.getBytes("utf-8");
	byte[] buf = cipher.doFinal(plainTextBytes);
	//byte[] base64Bytes = Base64.encodeBase64(buf);
	//base64EncryptedString = new String(base64Bytes);
        }catch(Exception e){
            
        }
	

	return base64EncryptedString;
}
}
