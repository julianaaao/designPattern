## 심플 팩토리
- 공식적인 디자인 패턴이라기보단 프로그래밍 관용구에 가깝다.
- 주요 목적은 객체 생성 과정을 캡슐화하여 클라이언트 코드가 구체적인 클래스와의 결합도를 낮추는 것.
- 클라이언트는 객체 생성 방법을 몰라도 되고, 단순히 팩토리에게 객체 생성을 요청하기만 하면 됨.
- 객체 생성을 전담하는 하나의 팩토리 클래스가 존재.

심플 팩토리의 장단점.

장점 :
- 객체 생성 로직이 하나의 팩토리 클래스에 있어 코드 재사용성이 높음.
- 또한 객체 생성 로직 변경이 필요할 때 팩토리 클래스만 수정하면 되서 유지보수성이 향상됨.
  
단점 :
- 확장성에 제한이 있음. 새로운 객체 유형을 추가하려면 팩토리 클래스를 수정해야함. OCP 위반.
-  객체 생성 로직이 복잡해질수록 팩토리 클래스가 여러 가지 책임을 지게 되어 단일 책임 원칙(SRP)을 위반할 수 있음.

------------------------------------------------------------------------------------------------------------

## 팩토리 메소드

객체 생성을 캡슐화하고, 서브클래스에서 객체 생성 방법을 결정하는 디자인 패턴  
팩토리 메소드 -> 객체를 생성하는 메소드  
이를 구현한 서브클래스가 실체 객체의 생성을 담당.  
OCP 준수.

팩토리 메소드의 장단점.  
장점:
- 유연성. 팩토리 메소드 패턴은 새로운 객체 추가 또는 기존 객체 변경 가능.
- 확장성. 각 서브클래스는 자신만의 객체 생성 로직 구현 가능.
- OCP 준수. 기존 코드 수정 X, 새로운 객체 유형을 추가할 수 있음.

단점:
- 복잡성. 새로운 객체가 추가 될때마다 서브클래스도 추가되며, 구조가 복잡해질 수도 있음.
- 객체 생성 지연. 객체 생성 과정이 복잡할 경우 성능에 영향을 줄 수 있음.

------------------------------------------------------------------------------------------------------------
## 추상 팩토리 패턴

관련된 객체들의 그룹을 생성하기 위한 인터페이스를 제공하는 패턴.  


**추상 팩토리(Abstract Factory)**: 최상위 공장. 객체를 생성하기 위한 메소드의 인터페이스를 선언. 
```java
public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
```

**구체 팩토리(Concrete Factory)**: 서브 공장 클래스. 유형에 맞는 객체를 반환하도록 메소드를 재정의. 
```java
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{ new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
```
**추상 제품(Abstract Product)**: 객체들이 공통으로 가질 인터페이스를 선언. 
````java
public interface Cheese {
    String toString();
}
````
**구체 제품(Concrete Product)**: 추상 제품의 인터페이스를 구현하여 실제 객체를 생성.
````java
public class MozzarellaCheese implements  Cheese {
    @Override
    public String toString() {
        return "MozzarellaCheese";
    }
}
````



추상 팩토리의 장단점.  

장점: 
- 객체를 생성하는 코드를 분리하여 클라이언트 코드와 결합도를 낮출 수 있다.

단정:
- 복잡성. 각 구현체마다 팩토리 객체들을 모두 구현해주어야 하기 때문에 객체가 늘어날때 마다 클래스가 증가하여 코드의 복잡성이 증가한다.
