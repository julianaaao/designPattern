# 템플릿 메소드 패턴 
- 알고리즘의 단계를 정의하며 일부 단계를 서브클래스에서 구현하도록 할 수 있다.
- 코드 재사옹에 큰 도움이 됨.
- 추상 메소드는 서브클래스에서 구현함. 
- 전략 패턴과 같이 모든 알고리즘을 캡슐화 하는 패턴이지만 전략 패턴은 상속을, 템플릿 메소드 패턴은 구성을 사용함.


Abstract 클래스 :
```java
public abstract class CaffeineBeverageAbstract {

    // 템플릿 메소드. 서브 클래스에서 오버라이드를 막기 위해 final 로 선언
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    // 서브 클래스에서 구현해야 하는 메소드는 abstract 로 선언
    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("물 끓이는 중 ");
    }

    void pourInCup() {
        System.out.println("컵에 따르는 중");
    }
}
```
서브 클래스 : 
```java
public class CoffeeAbstract extends CaffeineBeverageAbstract{

    @Override
    void brew() {
        System.out.println("필터로 커피를 우려내는 중");
    }

    @Override
    void addCondiments() {
        System.out.println("설탕과 우유를 추가하는 중");
    }
}
```
클라이언트 입장에서의 동작
1. tea.prepareRecipe()
2. Abstract 클래스에 구현된 prepareRecipe() 메소드 호출
3. Abstract 클래스에서의 abstract 메소드들은 서브 클래스의 구현에 따름


---

### 템플릿 메서드 Interface 로 구현

1. 생기는 문제점 :    
모든 메소드를 서브클래스에서 구현해야함.

2. 해결 방법 :    
default 를 사용해서 공통 로직 부분은 CaffeineBeverage 인터페이스에서 처리함.


```java
public interface CaffeineBeverage {

    default void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    default void boilWater(){
        System.out.println("물 끓이는 중 ");
    }

    default void pourInCup(){
        System.out.println("컵에 따르는 중");
    }

    void brew();
    void addCondiments();
}

```
서브클래스 : 
```java
public class Coffee implements CaffeinBeverage {

    @Override
    public void brew() {
        System.out.println("필터로 커피를 우려내는 중");
    }

    @Override
    public void addCondiments() {
        System.out.println("설탕과 우유를 추가하는 중");
    }
}
```
