import com.OooOO0OO;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/**
 * Created by qtfreet00 on 2017/3/14.
 */
public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException {
//        String s=qtfreet00.encode("你好啊");
//        System.out.println(s);
//
//        System.out.println(OooOOoo0oo("C586AD91D9DDC192CB8AB2B3"));

        String s = OooOO0OO.OooOOoo0oo(new byte[]{-125, -19, -92, -121, -62, -70, -42, -22, -93, 112, 94, 88, 95, 95, 7, -123, -23, -92, -45, -71, -2}, "fe9be13f531746bca463a81316150cd2");
        System.out.println(s);

    }

    public static String OooOOoo0oo(byte[] str, String key) {
        return "";
    }

    public static final String DEFAULT_KEY = "qtfreet";
    private static final String hexString = "0123456789ABCDEF";

    public static String OooOOoo0oo(String str) {
        int i;
        ByteArrayOutputStream baos = new ByteArrayOutputStream(str.length() / 2);
        for (i = 0; i < str.length(); i += 2) {
            baos.write((hexString.indexOf(str.charAt(i)) << 4) | hexString.indexOf(str.charAt(i + 1)));
        }
        byte[] b = baos.toByteArray();
        int len = b.length;
        int keyLen = DEFAULT_KEY.length();
        for (i = 0; i < len; i++) {
            b[i] = (byte) (b[i] ^ DEFAULT_KEY.charAt(i % keyLen));
        }
        return new String(b);
    }


}
