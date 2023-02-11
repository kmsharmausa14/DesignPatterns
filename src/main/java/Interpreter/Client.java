package Interpreter;

public class Client {
  InterpreterContext interpreterContext;

  public Client(InterpreterContext interpreterContext){
    this.interpreterContext = interpreterContext;
  }

  public String interpret(String str){
    Expression expression;

    if(str.contains("Hexadecimal"))
      expression = new IntToHexadecimalExpression(Integer.valueOf(str));
    else if(str.contains("Binary"))
      expression = new IntToBinaryExpression(Integer.valueOf(str));
    else
      return str;
    return expression.interpret(interpreterContext);
  }

  public static void main(String[] args) {
    String str1 = "28 in binary";
    String str2 = "28 in hexadecimal";

    Client client = new Client(new InterpreterContext());
    System.out.println(client.interpret(str1));
    System.out.println(client.interpret(str2));
  }
}
