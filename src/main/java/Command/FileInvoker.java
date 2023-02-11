package Command;

class FileInvoker {
  public Command command;

  public FileInvoker(Command command){
    this.command = command;
  }

  public void excute(){
    command.execute();
  }
}
