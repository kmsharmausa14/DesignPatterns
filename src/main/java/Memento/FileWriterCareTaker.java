package Memento;

public class FileWriterCareTaker {
  private Object obj;

  public void save(FileWriterUtil fileWriterUtil){
    this.obj = fileWriterUtil.save();
  }

  public void undoToLastSaved(FileWriterUtil fileWriterUtil){
    fileWriterUtil.returnToLastState(obj);
  }
}
