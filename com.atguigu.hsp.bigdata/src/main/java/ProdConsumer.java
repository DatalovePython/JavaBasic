/**
 * @author luzc
 * @date 2020/6/6 17:14
 * @desc �����߳̿��Բ�����ʼֵΪ0��һ������
 * һ��+1��һ��-1.������У�������10�֣�������ʼֵ��Ϊ0
 * <p>
 * 1�����ھ۵����ǰ��
 * 2���ж�+�ɻ�+֪ͨ
 * 3����ֹ�̵߳���ٻ��ѣ�ֻҪ��wait��while�ж�(���߳��̵߳����жϲ�����if��Ҫ��while)
 */
public class ProdConsumer {
    public static void main(String[] args) {
        AirCondition airCondition = new AirCondition();

        new Thread(()->{
            for (int i = 1; i <= 10; i++) {
                try {
                    airCondition.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"A").start();
        new Thread(()->{
            for (int i = 1; i <= 10; i++) {
                try {
                    airCondition.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"B").start();
    }
}

class AirCondition {
    private int num = 0;

    public synchronized void increment() throws InterruptedException {
        //1 �ж�
        if (num != 0) {
            this.wait();
        }
        // 2 �ɻ�
        num++;
        System.out.println(Thread.currentThread().getName()+"\t"+num);
        //3 ֪ͨ
        this.notifyAll();

    }

    public synchronized void decrement() throws InterruptedException{
        //1 �ж�
        if (num == 0) {
            this.wait();
        }
        // 2 �ɻ�
        num--;
        System.out.println(Thread.currentThread().getName()+"\t"+num);
        //3 ֪ͨ
        this.notifyAll();
    }
}