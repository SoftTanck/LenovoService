package com.softtanck.lenovoservice.test;

/**
 * @author : Tanck
 * @Description : TODO
 * @date 8/10/2015
 */
public interface HardwareTestHelper {


    public static enum TestResult {
        TEST_FAIL,//检测失败
        TEST_INTERRUPT,//检测中断
        TEST_NOT_OK,//有问题
        TEST_OK// 正常
    }

    /**
     * 开始测试 <b>注意:在start前需要手动调用该方法</b>
     *
     * @return
     */
    public abstract TestResult start();
}
