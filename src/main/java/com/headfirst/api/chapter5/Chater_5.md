# 싱글턴 패턴
- 클래스의 인스턴스를 하나만 생성하게 제한하는 디자인 패턴
- 생성된 단일 인스턴스로의 전역 접근을 제공


## 멀티스레딩 문제 해결 방법 

### 1. 게으른 초기화(Lazy initialization)

- 필요할 때 인스턴스를 생성
- 메모리 낭비를 줄이고, 초기 로딩 시간을 단축시킴. 
- 멀티스레드 환경에서는 동기화 문제를 해결해야함. 그 중 하나가 synchronized 사용. 

````java
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() { 
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
````
하지만 getInstance 메소드가 자주 호출되는 경우, 매번 동기화 검사를 하므로 성능이 저하될 수 있음.   
이를 해결하기 위한 방법으로 더블 체크 락킹(Double-checked Locking)이 있음.

### 2. 더블 체크 락킹  DCL (Double-checked Locking)
- volatile 키워드는 변수의 값을 모든 스레드에게 즉시 보이게 하여 인스턴스의 상태가 일관성을 유지하도록 함.
- CPU Cashe에 저장된 값이 아닌 Main Memory에서 읽어옴. 
- 자바 5 이상 버전에서만 사용 가능. 
```java
public class Singleton {
    private static volatile Singleton uniqueInstance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (uniqueInstance == null) { // 동기화 없이 null check 
            synchronized (Singleton.class) {
                if (uniqueInstance == null) { // 두 번째 체크
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}

```

### 3. 정적 초기화 (Static initializer) or 이른 초기화(Eager initialization)
- 클래스 로딩 시점에서 인스턴스를 미리 생성함.
```java
public class Singleton {
    private static final Singleton uniqueInstance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return uniqueInstance; //instance는 이미 있으니, 리턴만 하면 됨
    }
}
```
