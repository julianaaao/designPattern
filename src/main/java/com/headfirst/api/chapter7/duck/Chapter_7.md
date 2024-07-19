# 어댑터 패턴
-  호환되지 않는 인터페이스를 가진 클래스들을 함께 작동할 수 있게 해준다.
- 클라이언트는 호출 결과를 받아도 중간에 어댑터가 있는지 모른다.


```java
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    // 생성자에서 Turkey 객체를 받아서 이를 사용함. 
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    // Duck 인터페이스의 quack() 메서드를 구현하지만 실제로는 Turkey의 gobble() 메서드를 호출
    public void quack() {
        turkey.gobble();
    }

    // Duck 인터페이스의 fly() 메서드를 구현하지만 실제로는 Turkey의 fly() 메서드를 여러 번 호출 (칠면조는 짧은 거리만 날 수 있기 때문)
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}

```