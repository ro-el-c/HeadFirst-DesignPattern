# 데코레이터 패턴 (Decorator Pattern)

### ch3 데코레이터 패턴

자세한 정리는 [Tistory](https://roel-yomojomo.tistory.com/entry/HeadFirst-decorator-pattern)에 게시하였습니다.

<br>

## 디자인 원칙

### 다섯 번째, OCP(Open-Closed Principle)

> 클래스는 **확장에는 열려** 있어야 하지만 **변경에는 닫혀** 있어야 한다.

<br>

즉, 기존 코드의 변경 없이, 코드를 확장하는 것이다.

<br>

OCP 원칙을 모든 부분에서 준수하려고 하다보면

쓸 데 없이 시간을 낭비할 수 있으며, 필요 이상으로 복잡하고 이해하기 어려운 코드를 만들게 되는 부작용이 발생할 수 있다.

<br>

따라서, 디자인한 것 중에서 바뀔 가능성이 가장 높은 부분을 중점적으로 OCP 원칙을 적용하는 게 좋다.

<br>

데코레이터 패턴으로 OCP 원칙을 준수하는 방법을 알아보자.

<br>

---

## 데코레이터 패턴 (Decorator Pattern)

> 객체가 **추가 요소를 동적**으로 더할 수 있다. 데코레이터를 사용하면 서브클래스를 만들 때보다 훨씬 **유연하게 기능을 확장**할 수 있다.

<br>

### 데코레이터 (decorator)

- 데코레이터의 슈퍼클래스는 자신이 장식하고 있는 객체의 슈퍼클래스와 같다.
- 한 객체를 여러 개의 데코레이터로 감쌀 수 있다.
- 데코레이턴는 자신이 감싸고 있는 객체와 같은 슈퍼클래스를 가지고 있기 때문에, 원래 객체(싸여 있는 객체)가 들어갈 자리에 데코레이터 객체를 넣을 수 있다.
- **데코레이터는 자신이 자식하고 있는 객체에게 특정 행동을 위임하는 일 말고도, 추가 작업을 수행할 수 있다. ⭐️**
- 객체는 언제든지 감쌀 수 있으므로 실행 중에 필요한 데코레이터를 마음대로 적용할 수 있다.

<br>

### 데코레이터 패턴의 구조

#### Component (Interface or Abstract Class)

Component는 직접 쓰일 수도 있고, 데코레이터에 감싸여 쓰일 수도 있다.

#### Decorator (Abstract Class)

Decorator는 자신이 장식하고 있는 객체의 자리에 들어갈 수 있어야 한다.

따라서, Component 클래스를 확장하며, 각 데코레이터는 Component 객체를 포함한다.

- 어떤 Component든 감쌀 수 있도록, ConcreteDecorator의 슈퍼클래스인 Component를 사용한다.

Decorator는 자신이 장식하는 Component와 같은 인터페이스(또는 추상 클래스)를 구현한다.

<br>

#### ConcreteComponent

핵심 기능을 담당한다.

ConcreteComponent에 새로운 행동을 동적으로 추가할 수 있다.

#### ConcreteDecorator

추가 기능을 담당한다.

데코레이터가 감싸고 있는 Component 객체용 인스턴스 변수를 가지고 있다.

- Component의 기능과 Decorator의 기능을 모두 제공한다.
- Component의 상태를 확장할 수 있다.
- 상속보다는 **구성을 활용**한다의 세 번째 디자인 법칙을 지킨다.
- ConcreteDecorator를 추가하므로써, 새로운 기능을 추가할 수 있기 때문에 **OCP 규칙**을 지킬 수 있다.

데코레이터는 새로운 메서드를 추가할 수 있다.

- 하지만, 일반적으로 새로운 메서드를 추가하는 대신 구성 요소에 원래 있던 메서드를 별도의 작업으로 처리하여 새로운 기능을 추가한다.

<img width="813" alt="Untitled 5" src="https://github.com/ro-el-c/HeadFirst-DesignPattern/assets/96233738/5e6def6e-496b-46d3-a435-558d0524a157">

<br><br>

---

## 장단점

### 장점

여러가지 종류가 존재하는 구성 요소에 데코레이터를 감싸서 **핵심 기능과 추가 기능을 분리**할 수 있다.

상속 대신 구성과 위임으로 **유연**하게 새로운 기능을 추가할 수 있다.

- 디자인 원칙 3, 상속보다 구성을 사용한다. 준수

<br>

### 단점

1.

구상 구성 요소(ConcreteComponent)로 특별한 작업을 처리할 때 문제가 생길 수 있다.

데코레이터로 감싸고 나면, **구상 구성 요소를 통해 처리하는 작업에 대한 코드는 제대로 작동하지 않을 수 있다.**

따라서, 구상 구성 요소로 작동하는 코드를 만들어야 할 때는 데코레이터 패턴의 사용을 재고해야 한다.

<br>

2.
관리해야할 객체가 늘어나 실수할 가능성이 높아진다.

실제로는 **팩토리나 빌더 같은 다른 패턴으로 데코레이터를 만들고 사용**한다.

이렇게 하면 데코레이터로 장식된 구성 요소는 캡슐화가 잘 되어 있게 된다.

<br>

3.

**코드**가 필요 이상으로 **복잡**하고 **이해하기 어려워**질 수 있다.

<br>

---

## 데코레이터가 적용된 예: Java I/O

자바 I/O는 데코레이터 패턴으로 만들어졌다.

### 구조도
<img width="793" alt="Untitled 8" src="https://github.com/ro-el-c/HeadFirst-DesignPattern/assets/96233738/505e4423-6de3-428d-9438-ddd0f5c03eaf">

#### Component
InputStream

#### ConcreteComponent
FilterInputStream을 제외한 FileInputStream, ByteArrayInputStream 등

#### Decorator
FilterInputStream

#### ConcreteDecorator
DataInputStream, BufferedInputStream 등
