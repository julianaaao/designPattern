# 커맨드 패턴 

- 요청 내역을 객체로 캡슐화 하고, 매개변수로 서로 다른 요청 사항을 정의할 수도 있다. 
- 요청을 큐에 저장하거나 로그로 기록할 수도 있고, 작업 취소(Undo), 작업 다시 실행(Redo)도 가능하다. 

### 커맨드 패턴의 기본 구조

* Command : 
    - 실행될 기능에 대한 인터페이스
    - 실행될 기능을 execute() 로 정의함. 
```java
public interface Command {
    public void execute();
}

```
* ConcreteCommand : 
  - Command 인터페이스를 구현함.
  - 특정 수신자와 연결되어 있음.
```java
public class LightOnCommand implements Command{
    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
```
* Invoker : 
  - Command 객체를 호출하는 역할을 함.
```java
public class RemoteControl {
    Command[] onCommands;
    Command [] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPusheD(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ 리모컨 -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    + "    " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }
}
```
* Receiver :  
  - ConcreteCommand의 기능을 실행하기 위해 사용하는 수신자 클래스
```java
public class Light {
    public Light() {
    }

    public void on() {
        System.out.println("Light is on");
    }

    public void off() {
        System.out.println("Light is off");
    }
}
```