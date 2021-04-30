import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Mr Fu
 * @version 1.0
 *
 *
 *<P>
 * lambda 表达式在list中的常规应用：<P>
 * 1、forEach()遍历输出
 *
 * <P>
 * 2、map() 便利取值
 *
 * <p>
 * 3、fitter() 过滤器
 *
 * @PackageName PACKAGE_NAME
 * @ProjectName lambda-stu
 * @ClassName demo1
 * @Email fudaopin@gamil.com
 * @date 2021/4/26 下午2:49
 * @Description lambda 表达式在 list 中的常规应用
 */
public class LambdaListDemo1 {


    List<String> list = Arrays.asList("hello ", "word", "nice", "to", "meet", "you", "!");

    /**
     * lambda List 操作
     *
     * <p>
     * list 利用stream().forEach()遍历输出list内容;
     */
    @Test
    public void listLambdaList() {
        list.forEach(string -> {
            System.out.print(" " + string);
        });
    }

    /**
     * lambda List 操作
     *
     * <p>
     * list 利用map()处理List
     */
    @Test
    public void listLambdaMap() {

        List<String> list2 = list.stream().peek(System.out::println).collect(Collectors.toList());

        list2.forEach(System.out::println);
    }


    /**
     * lambda List 操作
     *
     * <p>
     * list 利用 fiter() 处理 List
     */
    @Test
    public void listLambdaFitter() {
        List<String> list3 = list.stream().filter(string -> !string.equals("!")).collect(Collectors.toList());

        System.out.println(list3);
    }

}


