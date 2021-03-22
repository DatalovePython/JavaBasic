package lock;

import java.util.concurrent.TimeUnit;

/**
 * @author luzc
 * @date 2020/6/6 10:44
 * @desc 8����ʾ
 * 1:��׼���ʣ��ȴ�ӡ�ʼ����Ƕ��ţ����ʼ��ٶ��ţ�
 * 2����ͣ4�����ʼ��������ĸ��ȣ����ʼ��ٶ��ţ�
 * 3: ������ͨsayHello�������ĸ���(��sayHello���ʼ��ٶ���)
 * 4: �����ֻ����ȴ�ӡ�ʼ����Ƕ��ţ����ʼ��ٶ��ţ�
 * 5��������̬������һ���ֻ����ȴ�ӡ�ʼ����Ƕ��ţ����ʼ��ٶ��ţ�
 * 6��������̬�����������ֻ����ȴ�ӡ�ʼ����Ƕ��ţ����ʼ��ٶ��ţ�
 * 7��һ����̬������һ����ͨ������һ���ֻ����ȴ�ӡ�ʼ����Ƕ��ţ����ʼ��ٶ��ţ�
 * 8��һ����̬������һ����ͨ�����������ֻ����ȴ�ӡ�ʼ����Ƕ��ţ����ʼ��ٶ��ţ�
 *
 *
 * ���ľ��ǣ��۲�synchronized ������ʲô����
 * ��һ���߳���ͼ����ͬ�������ʱ�򡣱����Ȼ�øö���������˳������׳��쳣ʱ������ͷŸ���
 * ���syn ��������ͨ�����ϣ���ôsyn ��ס���ǵ�ʱʵ������� ����syn����
 * ���syn �����ھ�̬�����ϣ���ôsyn��ס���������ࡣ����ʵ���������еĶ��󶼻��ܵ�Ӱ��
 * ����syn����ֻ��������syn�������ã�����ͨ��������Ӱ��
 */
public class Lock8Demo5 {
    public static void main(String[] args) throws InterruptedException{
        Phone phone = new Phone();
        Phone phone2 = new Phone();
        new Thread(()->{
            try {
                phone.sendEmail();
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"A").start();

        Thread.sleep(100);

        new Thread(()->{
            try {
                phone2.sendMsg();
//                phone.sayHello();
//                phone.sayHello();
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"B").start();


    }
}

class Phone{
    private static String str = "abc";
    public synchronized void sendEmail() throws Exception{
//        Thread.sleep(4000);
        TimeUnit.SECONDS.sleep(4);
        System.out.println("*********sendEmail");
    }

    public synchronized void sendMsg() throws Exception{
        System.out.println("*********sendMsg");
    }

    public void sayHello() throws Exception{
        System.out.println("*********sayHello");
    }

}
