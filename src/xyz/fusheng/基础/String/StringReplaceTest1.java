package xyz.fusheng.基础.String;

/**
 * @FileName: StringReplaceTest1
 * @Author: code-fusheng
 * @Date: 2020/12/9 11:23
 * @Version: 1.0
 * @Description:
 */

public class StringReplaceTest1 {




    public static void main(String[] args) {

        String workCardBase64 = "data:image/jpeg;base64,/9j/4AAQSkZJRgABAQEASABIAAD/4QAwRXhpZgAATU0AKgAAAAgAAQExAAI";

        String newWorkCard = workCardBase64.replace(workCardBase64.substring(0, workCardBase64.indexOf("base64,") + 7), "");

        // String str = "base64,";

        System.out.println(newWorkCard);


    }

}
