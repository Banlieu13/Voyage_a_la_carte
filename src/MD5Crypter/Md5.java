

package MD5Crypter;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Commando
 */
public class Md5 {

  	public static String getEncodedPassword(String key) {
	  byte[] uniqueKey = key.getBytes();
	  byte[] hash = null;
	  try {
		hash = MessageDigest.getInstance("MD5").digest(uniqueKey);
	  } catch (NoSuchAlgorithmException e) {
		throw new Error("no MD5 support in this VM");
	  }
	  StringBuffer hashString = new StringBuffer();
	  for ( int i = 0; i < hash.length; ++i ) {
		String hex = Integer.toHexString(hash[i]);
		if ( hex.length() == 1 ) {
		  hashString.append('0');
		  hashString.append(hex.charAt(hex.length()-1));
		} else {
		  hashString.append(hex.substring(hex.length()-2));
		}
	  }
	  return hashString.toString();
	}


  public static boolean testPassword(String clearTextTestPassword,
				   String encodedActualPassword)
				   throws NoSuchAlgorithmException
	{
	String encodedTestPassword = Md5.getEncodedPassword(
					  clearTextTestPassword);

	return (encodedTestPassword.equals(encodedActualPassword));
	}


	public static void main(String[] args) {
		System.out.println(getEncodedPassword("ahmed"));
		try {
			if (testPassword("ahmed", "729f2d8b3d3d9bc07ba349faab7fdf44"))
				System.out.println("Les passwords sont vérifiés");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}
}
    
    
    
  
