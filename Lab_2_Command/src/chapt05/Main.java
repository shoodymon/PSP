package chapt05;

import chapt05.invoker.*;
import chapt05.receiver.*;
import chapt05.command.*;

public class Main {
    public static void main(String[] args) {
        int mass[] = {-1, 70, 45, -20, 48, 60, 19};
        /*класс получатель(Receiver)-располагают информацией о способах выполнения операций*/
        ArrayOperation receiver = new ArrayOperation(mass);
        //инициализация команды
        Command operation1 = new MultCommand(receiver);
        Command operation2 = new AddCommand(receiver);
        //класс инициатор (Invoker)-обращается к команде для выполнения запроса
        ManagerCommands manager = new ManagerCommands(operation1);
        manager.exec();
        manager.setManager(operation2);
        manager.exec();
    }
}
