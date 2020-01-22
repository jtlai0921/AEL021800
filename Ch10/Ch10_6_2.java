// ��Ƥ���
interface WorkerInterface {
    public void doJob();
}
// ��Ƥ������������O
class Worker {
    public static void execute(WorkerInterface myWorker) {
        myWorker.doJob();
    }
}
// �D���O
public class Ch10_6_2 {
    // �D�{��
    public static void main(String[] args) {
        // �ϥ�Lambda�B�⦡�I�sdoJob()��k 
        Worker.execute(() -> System.out.println("�ϥ�Lambda�B�⦡�I�sdoJob()��k"));
        // �ϥΰΦW���O�өI�sdoJob()��k
        Worker.execute(new WorkerInterface() {
            // �мgdoJob()��k
            public void doJob() {
                System.out.println("�ϥΰΦW���O�өI�sdoJob()��k");
            }
        });
    }
}