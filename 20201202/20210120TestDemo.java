/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GaoBo
 * Date: 2021-01-20
 * Time: 8:35
 */
public class TestDemo {


    public static void main9(String[] args) {
        String str = "   ADFERf def fadsa 高  fsadfsaf       ";
        System.out.println(str.toLowerCase());

        String str1 = null;//代表不指向任何对象
        System.out.println(str1.isEmpty());
        String str2 = "";//代表指向的对象什么都没有
        System.out.println(str2.isEmpty());
    }


    public static void main8(String[] args) {
        String str = "abcdef";
        String str2 = str.substring(2,4);//[2,4)
        System.out.println(str2);
    }


    public static void main7(String[] args) {
        String str = "Java30-split#bit";
        String[] strings  = str.split(" |-|#");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }

    public static void main6(String[] args) {
        String str = "192*168*1*1";
        String[] strings  = str.split("\\*");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }

    public static void main5(String[] args) {
        String string = "username=zhangsan&password=123";
        String[] strings = string.split("&",1);
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }

    public static void main4(String[] args) {
        String string = "username=zhangsan&password=123";
        String[] strings = string.split("&");
        for (int i = 0; i < strings.length; i++) {
            String[] stringss = strings[i].split("=");
            //username    zhangsan
            /*for (int j = 0; j < stringss.length; j++) {
                System.out.println(stringss[j]);
            }*/
            System.out.println(stringss[1]);
        }
    }

    public static void main3(String[] args) {
        String str1 = "ababcabcdabcde";
        String string = str1.replaceAll("ab","xx");
        System.out.println(string);
        String string2 = str1.replaceFirst("ab","xx");
        System.out.println(string2);

        String string3 = str1.replace("ab","xx");
        System.out.println(string3);

        CharSequence charSequence = new String();
        Comparable comparable = new  String();

    }

    public static void main2(String[] args) {
        String str1 = "abcddefgh";
        System.out.println(str1.contains("fd"));
        System.out.println(str1.indexOf("dded"));//字符串的匹配算法KMP
        System.out.println(str1.indexOf("dde",2));

        String str2 = "ababcabcd";
        //从后往前找
        System.out.println(str2.lastIndexOf("ab"));
        //从fromindex开始往前找
        System.out.println(str2.lastIndexOf("ab",4));

        System.out.println(str2.startsWith("ab",1));
        System.out.println(str2.endsWith("cd"));
    }
    public static void main1(String[] args) {
        String str1 = "adcd";
        String str2 = "afcd";
        System.out.println(str1.compareTo(str2));
        String str3 = new String("abcd");
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str3);
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println("刘".compareTo("杨"));
    }
}
