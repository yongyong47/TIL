### 인터페이스란?

자식 클래스가 여러 부모 클래스를 상속받을 수 있다면, 다양한 동작을 수행할 수 있다는 장점을 가지게 될 것이다.

하지만 클래스를 이용하여 다중 상속을 할 경우 메서드 출저의 모호성 등 여러가지 문제가 발생할 수 있어 자바에서는 클래스를 통한 다중 상속은 지원하지 않는다.

하지만 다중 상속의 이점을 버릴 수는 없기에 자바에서는 인터페이스라는 것을 통해 다중 상속을 지원하고 있다.

인터페이스(interface)란 다른 클래스를 작성할 때 기본이 되는 틀을 제공하면서, 다른 클래스 사이의 중간매개 역할까지 담당하는 일종의 추상 클래스를 의미한다.

자바에서는 추상 클래스는 추상 메서드뿐만 아니라 생성자,필드,일반 메서드도 포함할 수 있다.

하지만 인터페이스(interface)는 오로지 추상 메서드와 상수만을 포함할 수 있다.

---

### 인터페이스의 선언

자바에서 인터페이스를 선언하는 방법은 클래스를 작성하는 방법과 같다.

인터페이스를 선언할 때에는 접근 제어자와 함께 interface 키워드를 사용하면 된다.

자바에서 인터페이스는 다음과 같이 선언한다.

---

```java
접근제어자 interface 인터페이스이름 {

    public static final 타입 상수이름 = 값;

    ...

    public abstract 메소드이름(매개변수목록);

    ...

}
```

단, 클래스와는 달리 인터페이스의 모든 필드는 public static final이어야 하며, 모든 메서드는 public abstract이어야 한다.

---

### 인터페이스의 구현

인터페이스는 추상 클래스와 마찬가지로 자신이 직접 인스턴스를 생성할 수는 없다.

따라서 인터페이스가 포함하고 있는 추상 메서드를 구현해 줄 클래스를 작성해야만 한다.

자바에서 인터페이스는 다음과 같은 문법을 통해 구현한다.

---

```java
class 클래스이름 implements 인터페이스이름 { ... }
```

### 예시

---

```java
interface Animal { public abstract void cry(); }

 

class Cat implements Animal {

    public void cry() {

        System.out.println("냐옹냐옹!");

    }

}

 

class Dog implements Animal {

    public void cry() {

        System.out.println("멍멍!");

    }

}

 

public class Polymorphism03 {

    public static void main(String[] args) {

        Cat c = new Cat();

        Dog d = new Dog();

 

        c.cry();

        d.cry();

    }

}
```

> **실행결과**
> 

냐옹냐옹!

멍멍!
