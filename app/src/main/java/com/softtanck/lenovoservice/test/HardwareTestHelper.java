package com.softtanck.lenovoservice.test;

/**
 * @author : Tanck
 * @Description : TODO
 * @date 8/10/2015
 */
public interface HardwareTestHelper {


    public static enum TestResult {
        TEST_FAIL,//���ʧ��
        TEST_INTERRUPT,//����ж�
        TEST_NOT_OK,//������
        TEST_OK// ����
    }

    /**
     * ��ʼ���� <b>ע��:��startǰ��Ҫ�ֶ����ø÷���</b>
     *
     * @return
     */
    public abstract TestResult start();
}
