# 어댑터 패턴
- 특정 클래스 인터페이스를 클라이언트에서 요구하는 다른 인터페이스로 변환하는 용도로 쓰임.
- 클라이언트는 호출 결과를 받아도 중간에 어댑터가 있는지 모른다.
- 어댑터 패턴을 구현하는 두 가지 방법 : 


### 1. 객체 어댑터 (Object Adapter) : 
- 구성(composition) 사용. 
- 어댑터 클래스가 타켓 인터페이스를 구현하고, 어댑터가 변환할 객체를 내부적으로 가지고 있음.  

**예시 :**

```java
public class TurkeyAdapter implements Duck {
    Turkey turkey;  // 어댑터가 감쌀 Turkey 객체

    // 생성자에서 Turkey 객체를 받아서 이를 사용함. 
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    // Duck 인터페이스의 quack() 메소드를 구현하지만 실제로는 Turkey의 gobble() 메소드를 호출
    public void quack() {
        turkey.gobble();
    }

    // Duck 인터페이스의 fly() 메소드를 구현하지만 실제로는 Turkey의 fly() 메소드를 여러 번 호출 (칠면조는 짧은 거리만 날 수 있기 때문)
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}

```
**특징 :** 
- 더 높은 유연성과 확장성. Turkey 하위 클래스(ex. WildTurkey) 도 같이 사용 가능. 
- 기존 클래스 수정할 필요 없이 어댑터를 통해 변경 가능. 
- 다중 상속을 지원하지 않는 언어(Java)에서 유용함. 

### 2. 클래스 어댑터 (Class Adapter) :

- 상속(inheritance) 사용. 
- 어댑터 클래스가 타켓 인터페이스와 어댑터가 변환할 클래스를 동시에 상속받음. 

**예시 :**
```java
public class TurkeyAdapter extends WildTurkey implements Duck {
    public void quack() { // Duck 인터페이스의 quack() 메소드 구현
        gobble(); // 상속받은 WildTurkey의 gobble() 메소드 호출
    }

    public void fly() { // Duck 인터페이스의 fly() 메소드 구현
        for (int i = 0; i < 5; i++) {
            super.fly(); // 상속받은 WildTurkey의 fly() 메소드 호출
        }
    }
}
```

**특징 :**
- 제한된 유연성. 변환할 객체를 상속받아야 하므로, 하나의 구체적인 클래스(WildTurkey)만 어댑터로 사용할 수 있음. 
- Java에서는 클래스를 하나만 상속받을 수 있으므로, 재사용성이 낮고 제한적임. 


----
# 퍼사드 패턴 (Facade Pattern)
- 복잡한 서브시스템에 대한 간단한 인터페이스를 제공하는 구조적 디자인 패턴

### 구성 요소

#### 1. 퍼사드 : 클라이언트가 사용할 수 있는 단순한 인터페이스를 정의. 

```java
public class HomeTheaterFacade {
    Amplifier amp;
    Tuner tuner;
    StreamingPlayer player;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp,
                            Tuner tuner,
                            StreamingPlayer player,
                            Projector projector,
                            TheaterLights lights,
                            Screen screen,
                            PopcornPopper popper){
            this.amp = amp;
            this.tuner = tuner;
            this.player = player;
            this.projector = projector;
            this.lights = lights;
            this.screen = screen;
            this.popper = popper;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setStreamingPlayer(player);
        amp.setSurroundSound();
        amp.setVolume(5);
        player.on();
        player.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        player.stop();
        player.off();
    }
}
```

#### 2. 서브시스템 클래스들 : 퍼사드가 감싸고 있는 복잡한 클래스들. 클라이언트에서 직접 사용 가능하지만, 퍼사드를 통해 사용하는게 더 간단함. 

```java
public class Amplifier {
    public void on(){
        System.out.println(description + " on");
    }

    public void off(){
        System.out.println(description + " off");
    }
}
```
이 외에 Tuner, Screen 등등 

#### 3. 클라이언트 : 퍼사드를 통해 서브시스템을 이용하는  클래스 

```java
public class HomeTheaterTestDrive{

    public static void main(String[] args) {
        Amplifier amp = new Amplifier("Amplifier");
        Tuner tuner = new Tuner("AM/FM Tuner", amp);
        StreamingPlayer player = new StreamingPlayer("Streaming Player", amp);
        Projector projector = new Projector("Projector", player);
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");


        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, player, projector, lights, screen, popper);

        homeTheater.watchMovie("Harry Potter");
        homeTheater.endMovie();
    }
}
```

### 퍼사드 패턴의 장단점

**장점 :** 
- 서브시스템 사용의 간소화. 
- 결합도 감소.

**단점 :** 
- 퍼사드 클래스에 너무 많은 기능이 추가되면, 단일 책임 원칙을 위반할 수 있음.

----
### 최소 지식 원칙 (Principle of Least Knowledge) or 디미터 법칙 (Law of Demeter)
객체들이 다른 객체에 대해 가능한 적게 알아야 한다는 원칙.  
객체 간의 결합도를 줄여 시스템을 더 유연하고 유지보수하기 쉽게 만들기 위해 사용됨.  
퍼사드는 클라이언트가 서브시스템의 내부 구조에 대해 알지 않고도 그 기능을 사용할 수 있게 복잡한 서브시스템을 감싸는 단순한 인터페이스를 제공.  
클라이언트와 서브시스템 간의 결합도를 줄이고, 시스템의 변경에 대한 영향을 최소화함.   