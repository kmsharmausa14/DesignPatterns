package Memento;

public class Client {

  public static void main(String[] args) {
    FileWriterCareTaker fileWriterCareTaker = new FileWriterCareTaker();

    FileWriterUtil fileWriterUtil = new FileWriterUtil("abc.txt");
    fileWriterUtil.write("aa ja re mahi");

    System.out.println(fileWriterUtil);

    fileWriterCareTaker.save(fileWriterUtil);

    fileWriterUtil.write("chala ja mahi");

    System.out.println(fileWriterUtil);

    fileWriterCareTaker.undoToLastSaved(fileWriterUtil);

    System.out.println(fileWriterUtil);
  }
}
