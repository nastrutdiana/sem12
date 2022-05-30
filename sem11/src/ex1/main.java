package ex1;

public class main {
    public static void main(String[] args) {
        File file = new File("a", "1", "Bucuresti", "Diana");
        file.print();

        FileSnapshot fileSnapshot = file.createSnapshot();
        VersionControl v = new VersionControl();
        v.addFileSnapshot(fileSnapshot);
        v.listSnapshotList();
        file.setContent("b");
        file.print();
        v.addFileSnapshot(file.createSnapshot());
        file.restoreToSomePoint(fileSnapshot);
        file.print();
    }
}
