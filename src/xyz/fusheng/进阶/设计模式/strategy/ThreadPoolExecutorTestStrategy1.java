package xyz.fusheng.进阶.设计模式.strategy; /**
 * @author: code-fusheng
 * @Date: 2020/10/25 22:17
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @FileName: ThreadPoolExecutorTestStrategy1
 * @Author: code-fusheng
 * @Date: 2020/10/25 22:17
 * @version: 1.0
 * Description: JDK 中 线程池的策略模式测试
 */

public class ThreadPoolExecutorTestStrategy1 {

    public static void main(String[] args) {

        new ThreadPoolExecutor.AbortPolicy();

        new ThreadPoolExecutor.CallerRunsPolicy();

        new ThreadPoolExecutor.DiscardOldestPolicy();

        new ThreadPoolExecutor.DiscardPolicy();

    }

}
