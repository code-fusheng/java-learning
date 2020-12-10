package xyz.fusheng.基础; /**
 * @author: code-fusheng
 * @Date: 2020/11/9 18:26
 */

/**
 * @FileName: KK
 * @Author: code-fusheng
 * @Date: 2020/11/9 18:26
 * @version: 1.0
 * Description: DF
 */

public class KK<T> {

     public void queryInfo(T ... obj){
            if(obj instanceof  String [] ){
                System.out.println("string 数组");
            } else if (obj instanceof Integer[]) {
                System.out.println("int 数组");
         }
     }

    public static void main(String[] args) {

         KK k1 = new KK();
         String[] strArr = {"test1", "test2"};
         k1.queryInfo(strArr);

    }

}
