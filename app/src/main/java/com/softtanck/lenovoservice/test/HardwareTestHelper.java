package com.softtanck.lenovoservice.test;

import com.softtanck.lenovoservice.ConValue.TestResult;

/**
 * @author : Tanck
 * @Description : TODO
 * @date 8/10/2015
 */
public interface HardwareTestHelper {

    /**
     * ׼���׶� <b>ע��:��startǰ��Ҫ�ֶ����ø÷���</b>
     */
    public void prepare();

    /**
     * ��ʼ����
     *
     * @return
     */
    public TestResult start();

    /**
     * ֹͣ��� <b>ע��:�������û��жϵ�</b>
     *
     * @return
     */
    public TestResult stop();
}
