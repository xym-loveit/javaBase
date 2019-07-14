package com.xym.javabase.lesson7;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * java.util
 *
 * @author xym
 * @create 2019-07-14 20:47
 */
public class UtilDemo {
    public static void main(String[] args) {

        //testDate();
        //testCalendar();
        //testRandom();
        //testArrayList();
        //testLinkList();
        //searchArrayListConst();
        //searchLinkedListConst();
        //searchVectorConst();
        //testMap();


    }

    private static void testMap() {
        HashMap<String, String> hashMap = new HashMap<>();
        //可以放null键值对
        hashMap.put(null, null);
        //HashMap<String, Student> hashMap = new HashMap<>();
        List<Student> list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(new Student("name " + i, i, i % 2 == 0 ? "女" : "男"));
        }

        //  {女=[Student{name='name 0', age=0, sex=女}, Student{name='name 2', age=2, sex=女}, Student{name='name 4', age=4, sex=女},
        //            Student{name='name 6', age=6, sex=女}, Student{name='name 8', age=8, sex=女}]


        //男=[Student{name='name 1', age=1, sex=男}, Student{name='name 3', age=3, sex=男},
        // Student{name='name 5', age=5, sex=男}, Student{name='name 7', age=7, sex=男},
        // Student{name='name 9', age=9, sex=男}]}

        //男女分组
        //System.out.println(list);
        Map<String, List<Student>> collect = list.stream().collect(Collectors.groupingBy(Student::getSex));
        System.out.println(collect.get("男"));
        System.out.println(collect.get("女"));

    }

    /**
     * 测试arraylist查询元素的用时
     */
    private static void searchLinkedListConst() {
        long start = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(String.valueOf(i));
        }
        System.out.println(linkedList.contains("55555"));
        long end = System.currentTimeMillis();
        System.out.println(end - start + " millms");
    }

    /**
     * 测试arraylist查询元素的用时
     */
    private static void searchVectorConst() {
        long start = System.currentTimeMillis();
        Vector<Integer> vector = new Vector<>();
        for (int i = 0; i < 100000; i++) {
            vector.add(i);
        }
        System.out.println(vector.contains(55555));
        long end = System.currentTimeMillis();
        System.out.println(end - start + " millms");
    }


    /**
     * 测试arraylist查询元素的用时
     */
    private static void searchArrayListConst() {
        long start = System.currentTimeMillis();
        ArrayList<String> arrayList = new ArrayList<>(100);
        for (int i = 0; i < 100000; i++) {
            arrayList.add(String.valueOf(i));
        }
        System.out.println(arrayList.contains("55555"));
        long end = System.currentTimeMillis();
        System.out.println(end - start + " millms");
    }

    private static void testLinkList() {
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
        }
        System.out.println(list);
        list.addFirst("first");
        System.out.println(list);
        list.addLast("last");
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        //同removeFirst，删除第一个元素
        list.pop();
        System.out.println(list);
        //得到第一个元素
        System.out.println(list.peek());
        System.out.println(list);
        list.offer("offer");
        System.out.println(list);
        System.out.println(list.isEmpty());


    }

    private static void testArrayList() {
        //静态数组
        int[] array = new int[]{1, 2};
        array[0] = 100;
        array[1] = 200;
        //java.lang.ArrayIndexOutOfBoundsException: 2
        //array[2] = 300;

        //动态数组
        List<Object> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        System.out.println(list);
        //修改
        list.set(1, 100);
        System.out.println(list);
        System.out.println(list.contains(9));
        System.out.println(list.contains(99));
        System.out.println(list.get(1));
        System.out.println(list.subList(1, 8));
        //插队,添加
        list.add(1, 1000);
        System.out.println(list);
        System.out.println("size=" + list.size());
        Integer[] ints = new Integer[11];
        //动态数组转为静态数组
        list.toArray(ints);
        String s = Arrays.toString(ints);
        System.out.println(s);
        //删除指定索引元素
        list.remove(1);
        System.out.println(list);
        //使用for循环
        System.out.println("get element");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        //使用迭代器
        System.out.println("\niterator get element");
        Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        //使用for each
        System.out.println("\nfor each");
        for (Object o : list) {
            System.out.print(o + " ");
        }
    }

    private static void testRandom() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            System.out.print(random.nextInt(20) + " ");
        }
        System.out.println();
        for (int i = 0; i < 100; i++) {
            System.out.print(random.nextBoolean() + " ");
        }
        System.out.println();
        //        //for (int i = 0; i < 100; i++) {
        //        //    System.out.print(random.nextLong()+ " ");
        //        //}
        //int流，1.8  stream------------lambda语法
        //random.ints().limit(20).forEach((int i) -> System.out.print(i + " "));
        //System.out.println(new Random(100).nextLong());
        //lambda
    }

    private static void testCalendar() {
        Calendar calendar = Calendar.getInstance();
        //年
        System.out.println(calendar.get(Calendar.YEAR));
        //月,加一转为中国月份
        System.out.println(calendar.get(Calendar.MONTH) + 1);
        //日
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        //小时
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        //分钟
        System.out.println(calendar.get(Calendar.MINUTE));
        //秒
        System.out.println(calendar.get(Calendar.SECOND));
        //calendar.add(Calendar.DAY_OF_MONTH, -1);
        //calendar.add(Calendar.MONTH, -1);
        calendar.add(Calendar.MINUTE, 30);
        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(format.format(calendar.getTime()));
    }

    private static void testDate() {
        System.out.println(new Date());
        //SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
        //格式化日期
        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String dataStr = format.format(new Date());
        System.out.println(dataStr);

        try {
            Date date1 = format.parse("2019年07月14日 20:59:21");
            Date date2 = format.parse("2019年07月07日 20:59:21");
            System.out.println(date2.getYear());
            //都可以比较日期前后
            System.out.println(date1.before(date2));
            System.out.println(date2.compareTo(date1));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
