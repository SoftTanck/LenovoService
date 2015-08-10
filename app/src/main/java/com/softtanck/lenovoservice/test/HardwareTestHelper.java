package com.softtanck.lenovoservice.test;

import com.softtanck.lenovoservice.ConValue.TestResult;

/**
 * @author : Tanck
 * @Description : TODO
 * @date 8/10/2015
 */
public interface HardwareTestHelper {

    /**
     * 准备阶段 <b>注意:在start前需要手动调用该方法</b>
     */
    public void prepare();

    /**
     * 开始测试
     *
     * @return
     */
    public TestResult start();

    /**
     * 停止检测 <b>注意:可能是用户中断的</b>
     *
     * @return
     */
    public TestResult stop();
}
