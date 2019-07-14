package com.xym.javabase.lesson6;


/**
 * 描述类作用
 *
 * @author xym
 * @create 2019-07-14 16:45
 */
public class LangDemo {
    public static final String STRING = "abc1d2eA3B3Wf09wes";

    public static void main(String[] args) {
        //testChar01();
        //testString();
        //testStringBuffer();
        //testMath();
        //Object o = new LangDemo();
        //System.out.println(o);

        //System.exit(2);
        //testSystem();
      /*  System.err.println("000000000");
        System.out.println("000000000");*/
    }

    private static void testSystem() {
        System.out.println(System.currentTimeMillis());
        String[] strings = new String[]{"aaa", "bbb", "cccc", "ddd"};
        String[] targetArray = new String[]{"111", "222", "333"};
        System.arraycopy(strings, 1, targetArray, 1, 2);
        for (String s : targetArray) {
            System.out.println(s);
        }
    }

    private static void testMath() {
        System.out.println(Math.max(100, 80));
        System.out.println(Math.min(100, 80));
        System.out.println(Math.PI);
        System.out.println(Math.abs(-100));
        System.out.println("----");
        for (int i = 0; i < 200; i++) {
            System.out.print((int) (Math.random() * 100) + " ");
        }
        System.out.println("----");
    }

    private static void testStringBuffer() {
        String str = "我是";
        String str2 = "中国人";
        String str3 = "我在学习";
        String str4 = "编程";
        System.out.println(str + "--" + str2 + str3 + str4);
        StringBuffer sb = new StringBuffer();
        sb.append(str).append("--").append(str2).append(str3).append(str4);
        sb.insert(0, "111");
        sb.deleteCharAt(4);
        sb.reverse();
        System.out.println(sb);
    }

    private static void testString() {
        //byte[] bytes = new byte[]{95,96,97, 98};
        byte[] str2 = "zhongguo".getBytes();
        byte[] bytes = "中国很强".getBytes();
        String hello = new String("hello");
        String str = new String(str2);
        System.out.println(hello);
        System.out.println(str);
        //System.out.println(new String(str2, 0, 7));
        //System.out.println("-111--");
        //for (byte aByte : bytes) {
        //    System.out.print(aByte);
        //}
        //System.out.println("\n-222--");
        System.out.println(bytes.length);
        System.out.println(new String(bytes, 0, 9));
        //中文在字符串中长度占1个
        char[] chars = new char[]{'A', 'B', '9', '中'};
        System.out.println(new String(chars).length());
        //同样的中文转为byte数组一个中文占用三个长度
        System.out.println("中".getBytes().length);
        System.out.println("aaa".equals("aaa"));
        System.out.println("aaa".equalsIgnoreCase("AaA"));
        //abcdefghijklmn
        System.out.println("a".compareTo("b"));
        System.out.println("a".compareTo("c"));
        System.out.println("z".compareTo("a"));
        System.out.println("z".compareTo("z"));
        System.out.println("abc----------ssdsdsd".startsWith("abc-"));
        System.out.println("abc".endsWith("bc"));
        //System.out.println("abcdefg".indexOf("fgg"));
        System.out.println("abcdefg".lastIndexOf("fg"));
        System.out.println("abcdefg".charAt(4));
        System.out.println("abcedfg".substring(0, 6));
        System.out.println("abcedfgsjdksddjksfjkdfj".substring(3));
        System.out.println("hello".concat("--world"));
        System.out.println("ab1cd2#ef3#gh".replaceAll("[\\d]", "*"));
        System.out.println("ab1cd2#ef3#gh".replace("ef", "---"));
        System.out.println(123 + "     etg    ".trim() + 456);
        System.out.println("abcdefg".toUpperCase());
        System.out.println("ABCDEFG".toLowerCase());
    }

    private static void testChar01() {
        //System.out.println(Character.isDigit('9'));
        //System.out.println(Character.isDigit('0'));
        //System.out.println(Character.isDigit('中'));

        char[] chars = STRING.toCharArray();
        int digitCount = 0;
        int letterCount = 0;
        int upperCaseCount = 0;
        System.out.println(chars.length);
        for (char aChar : chars) {
            //是否数字
            boolean digit = Character.isDigit(aChar);
            boolean letter = Character.isLetter(aChar);
            boolean upperCase = Character.isUpperCase(aChar);
            if (digit) {
                digitCount++;
            } else if (letter) {
                letterCount++;
            }
            if (upperCase) {
                upperCaseCount++;
            }
            System.out.println(aChar + "是否为数字" + digit);

        }
        System.out.println("字符串" + STRING + "里面共有" + digitCount + "数字" + ",字母共有 " + letterCount + "个");
        System.out.println("字符串" + STRING + "里面共有" + upperCaseCount + "个大写字母");
    }

    @Override
    public String toString() {
        System.out.println("------------");
        return this.getClass().getName();
    }
}
