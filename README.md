# JAVA设计模式练习


## 创建型模式

### 工厂模式 Factory Pattern
![images](https://img-blog.csdnimg.cn/e1e1dc57a117425fa55cf88e0a3b5d3c.png)
```$xslt
工厂方法模式（Factory Method），定义一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到其子类。
```

### 简单工厂模式 Simple Factory Pattern
![images](https://img-blog.csdnimg.cn/e1e1dc57a117425fa55cf88e0a3b5d3c.png)
```$xslt
简单工厂方法模式（Factory Method），定义一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到其子类。
```

### 抽象工厂模式  Abstract Factory Pattern
![images](https://img-blog.csdnimg.cn/23195737cac74acb978ee5160e5398e5.png)
```
抽象工厂模式（Abstract Factory），提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。

举例：
为了方便和之前的工程模式作比较，还是采用简单计算器的例子，不过在实现运算功能的时候，由于数字的类型不同，
比如int、float、double等，可能会产生不同的结果，所以需要扩展出多个类型的运算类。下面用抽象工厂模式实现加法、除法运算。
```

### 建造者模式 Builder Pattern
![images](https://img-blog.csdnimg.cn/3af056c14ae445c2b9208b277a61f1a6.png)
```$xslt
建造者模式（Builder），将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。

使用建造者模式的情景：
主要是用于创建一些复杂的对象，这些对象内部构建间的建造顺序通常是稳定的，但对象内部的构建通常面临着复杂的变化。

建造者模式的好处就是使得建造代码与表示代码分离，由于建造者隐藏了该产品是如何组装的，所以若需要改变一个产品的内部表示，只需要再定义一个具体的建造者就可以了。

举例：
当玩一个角色扮演类的游戏时，通常都需要创建一个角色，可以选择男性或女性，生成人物的打扮和武器也会根据选择的性别发生变化，
但是男性和女性单独创建的流程都是固定不变的，即所有男性的打扮、武器都是固定的，这个生成角色的过程就可以用建造者模式实现。代码如下：
```
 
### 单例模式 Singleton Pattern
![images](https://img-blog.csdnimg.cn/4f12187b8a3e4661b1942e9a66fec688.png)
```
单例模式（Singleton），是一种常用的软件设计模式。在它的核心结构中只包含一个被称为单例的特殊类。通过单例模式可以保证系统中一个类只有一个实例
```

### 原型模式 Prototype Pattern
![images](https://img-blog.csdnimg.cn/cdfa806c275e42809cbd5fa731886986.png)
```
原型模式（Prototype），用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
Java当中，提供了Cloneable接口，实现了这个接口表示这个类支持被复制。如果一个类没有实现这个接口但是调用了clone()方法，Java编译器将抛出一个CloneNotSupportedException异常。
```


## 结构型模式 

### 适配器模式 Adapter Pattern
![images](https://img-blog.csdnimg.cn/a7ad07ac4c0b4a45968b4a004e4e76a6.png)
```$xslt
适配器模式（Adapter），将一个类的接口转换成客户希望的另外一个接口。Adapter模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。

在软件开发中，系统的数据和行为都正确，但接口不符时，我们应该考虑用适配器，目的是使控制范围之外的一个原有对象与某个接口匹配。
适配器模式主要应用于希望复用一些现存的类，但是接口又与复用环境要求不一致的情况。

举例：
姚明刚进入NBA时，英语不好，听不懂教练的安排，由于NBA大部分都是美国选手，因此不能要求教练用中文，所以需要一个翻译来讲教练的指挥
翻译成中文。这个翻译就相当于是一个适配器，外籍选手就是需要适配的类，懂英语的选手是目标所期待的类。
```
 
### 桥接模式 Bridge Pattern
![images](https://img-blog.csdnimg.cn/6aa7e13a0b104350924badb19d5ab3f7.png)
```$xslt
桥接模式 （Bridge），在软件系统中，某些类型由于自身的逻辑，它具有两个或多个维度的变化，那么如何应对这种“多维度的变化”？这就要使用桥接模式
```

### 命令模式 Command Pattern
![images](https://img-blog.csdnimg.cn/eb74b4adccc9403b994a67ebf8f25f96.png)
```$xslt
命令模式 （Command ），“行为请求者”与“行为实现者”通常呈现一种“紧耦合”。但在某些场合，比如要对行为进行“记录、撤销/重做、事务”等处理，
这种无法抵御变化的紧耦合是不合适的。
在这种情况下，如何将“行为请求者”与“行为实现者”解耦？将一组行为抽象为对象，实现二者之间的松耦合。这就是命令模式

1.降低对象之间的耦合度。 
2.新的命令可以很容易地加入到系统中。 
3.可以比较容易地设计一个组合命令。 
4.调用同一方法实现不同的功能 

举例：
某灯具厂商欲生产一个灯具遥控器，该遥控器具有 7 个可编程的插槽，每个插槽都有开关按钮，对应着一个不同的灯。利用该遥控器能够统一控制房间中该厂商所有品牌灯具的开关，现采用 Command（命令）模式实现该遥控器的软件部分
``` 

### 组合模式 Composite Pattern
![images](https://img-blog.csdnimg.cn/febb7610b4df426487b19199eb77d559.png)
```$xslt
组合模式（Composite），将对象组合成树形结构以表示‘部分-整体’的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性。

举例：
一个企业做大后，会在全国各地开分公司，总公司有人力资源部和财务部，分公司也有自己的人力资源部和财务部，
分公司下还可以有办事处，办事处也有自己的人力资源部和财务部，但是人力资源部和财务部并没有下属的机构。
这种场景就可以用组合模式来实现公司组织架构的展示。
``` 

### 装饰模式 Decorator Pattern
![images](https://img-blog.csdnimg.cn/27d3257ee78c42a68ffdcc620ee33ef1.png)
```$xslt
装饰模式（Decorator），动态地给一个对象添加一些额外的职责，就增加功能来说，装饰模式比生成子类更为灵活。

装饰模式的基础有4个类：

Componet类：定义了一个对象接口，可以给这些对象动态地添加职责。
ConcreteComponent类：定义了一个具体的对象，也可以给这个对象添加一些职责。
Decorator类：装饰抽象类，继承了Component类，从外类来扩展Component类的功能，但对于- Component类来说，是无需知道Decorator的存在的。
ConcreteDecorator类：具体的装饰对象，起到给Component添加职责的功能。实际上会有多个装饰对象。
```

### 外观模式 Facade Pattern
![images](https://img-blog.csdnimg.cn/c8f11f8af92d4064bd2c2c4c03664b03.png)
```$xslt
外观模式（Facade），为子系统中的一组接口提供一个一致的界面，定义一个高层接口，这个接口使得这一子系统更加容易使用。

举例：
现在很多人都喜欢点外卖，点外卖的流程很简单，你只需要选择了想吃的东西，然后等着外卖小哥送货上门就可以了，
至于外卖软件怎么通知店家，中间店家怎么做菜，做完后怎么分配骑手的过程都不需要你操心，这个流程就可以用外观模式来实现。
```
 
### 享元模式 Flyweight Pattern
![image](https://img-blog.csdnimg.cn/329ea4b4d7b24b1b82aa79aead4f6785.png)
```$xslt
享元模式 （Flyweight）它使用共享物件，用来尽可能减少内存使用量以及分享资讯给尽可能多的相似物件；它适合用于只是因重复而导致使用无法令人接受的大量内存的大量物件。
通常物件中的部分状态是可以分享。常见做法是把它们放在外部数据结构，当需要使用时再将它们传递给享元。
如果一个应用程序使用了大量的对象，而这些对象造成了很大的存储开销的时候就可以考虑是否可以使用享元模式。
例如,如果发现某个对象的生成了大量细粒度的实例，并且这些实例除了几个参数外基本是相同的
，如果把那些共享参数移到类外面，在方法调用时将他们传递进来，就可以通过共享大幅度单个实例的数目。

举例：
我们将创建一个 Shape 接口和实现了 Shape 接口的实体类 Circle。下一步是定义工厂类 ShapeFactory。
ShapeFactory 有一个 Circle 的 HashMap，其中键名为 Circle 对象的颜色。无论何时接收到请求，都会创建一个特定颜色的圆。ShapeFactory 检查它的 HashMap 中的 circle 对象，如果找到 Circle 对象，则返回该对象，否则将创建一个存储在 hashmap 中以备后续使用的新对象，并把该对象返回到客户端。
FlyWeightPatternDemo 类使用 ShapeFactory 来获取 Shape 对象。它将向 ShapeFactory 传递信息（red / green / blue/ black / white），以便获取它所需对象的颜色。
```


### 代理模式 Proxy Pattern
![images](https://img-blog.csdnimg.cn/545d56adde8d40f88263b89cd3b741c9.png)
```$xslt
代理模式（Proxy），为其他对象提供一种代理以控制对这个对象的访问。
代理模式主要有3个类：

Subject类，定义了RealSubject和Proxy的共用接口，这样就在任何使用RealSubject的地方都可以使用Proxy。
RealSubject类，定义Proxy所代表的真实实体。
Proxy类，保存一个引用使得代理可以访问实体，并提供一个与Subject的接口相同的接口，这样代理就可以用来替代实体。
简单来说，就是定义一个接口，里面提供真实对象的各个方法，真实对象与代理类都实现这个接口，并且在代理类中有个真实对象的引用，用来调用真实对象的相关方法。
```

## 行为型模式

### 责任链模式 Chain of Responsibility Pattern
![images](https://img-blog.csdnimg.cn/7988082a67d04a8e9963cbe2fe08f6f1.png)
```$xslt
责任链模式（Chain of Responsibility）是一种设计模式。在责任链模式里，很多对象由每一个对象对其下家的引用而连接起来形成一条链。请求在这个链上传递，直到链上的某一个对象决定处理此请求。
发出这个请求的客户端并不知道链上的哪一个对象最终处理这个请求，这使得系统可以在不影响客户端的情况下动态地重新组织和分配责任。

举例：
学校规定参加校招的同学必须要请假，且要有相关人员的签字，三天以下需辅导员签字、三到七天需要系主任签字，一个星期以上需要院长签字，更多的则需要校长签字！
```
 
### 中介者模式 Mediator Pattern
![images](https://img-blog.csdnimg.cn/18c2903821f840a7a37e789031a2513c.png)
```$xslt
中介者模式（Mediator）也叫中介者模式，是由GoF提出的23种软件设计模式的一种。Mediator模式是行为模式之一，在Mediator模式中，
类之间的交互行为被统一放在Mediator的对象中，对象通过Mediator对象同其他对象交互，Mediator对象起着控制器的作用。
```

### 解释器模式 Interpreter Pattern
![image](https://img-blog.csdnimg.cn/5aa1b39296694905a2470ec1272f6e50.png)
```$xslt
解释器模式（Interpreter） 意图：给定一个语言，定义它的文法表示，并定义一个解释器，这个解释器使用该标识来解释语言中的句子。
主要解决：对于一些固定文法构建一个解释句子的解释器。
何时使用：如果一种特定类型的问题发生的频率足够高，那么可能就值得将该问题的各个实例表述为一个简单语言中的句子
。这样就可以构建一个解释器，该解释器通过解释这些句子来解决该问题。 如何解决：构件语法树，定义终结符与非终结符。
``` 

### 备忘录模式 Memento Pattern
![image](https://img-blog.csdnimg.cn/e1a8d9e88fa94df199bee11b937bfef0.png)
```$xslt
备忘录（Memento），在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可以将该对象恢复到原先保存的状态。

举例：
比如玩单机游戏，一般打大boss前，或者需要下线了，都会把当前的状态保存一份，避免打boss死亡或者角色数据丢失，这个就可以用备忘录模式来实现。
``` 
 
### 观察者模式 Observer Pattern
![image](https://img-blog.csdnimg.cn/1b1abaae851d447cb688430adb4c953a.png)
```$xslt
观察者模式（Observer），又叫做发布-订阅（Publish/Subscribe）模式，定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。
这个主题对象在状态发生变化时，会通知所有观察者对象，使他们能够自动更新自己。

举例：
在工作的时候，如果老板不在，有的人可能会放松一下，看看新闻或者看看股票。这个时候需要有个人时刻观察老版的动向，
如果老板回来了，就通知大家一声，让大家赶紧开始工作。
```
 
### 状态模式 State Pattern
![image](https://img-blog.csdnimg.cn/6ab7cd1e19794d6d90ecc299bdfbcd22.png)
```$xslt
状态模式（State），当一个对象的内在状态改变时允许改变其行为，这个对象看起来像是改变了其类。

状态模式主要解决的是当控制一个对象状态转换的条件表达式过于复杂时的情况。把状态的判断逻辑转移到表示不同状态的一系列当中，
可以把复杂的判断逻辑简化。当然，如果这个状态判断很简单，那就没必要使用“状态模式”了。

举例：
在公司工作工作一天，每个阶段的工作状态都不同，比如上午会比较精神，中午困了需要休息，下午休息完后又有精神了，
但是到了晚上如果加班很晚，就会很累，加班到凌晨可能就会在单位休息了。由于判断比较多，就可以用状态模式来实现。
```

 
 ### 策略模式 Strategy Pattern
![image](https://img-blog.csdnimg.cn/57d0af3f74974a638bcf306aa44aaac5.png)
```$xslt
策略模式（Strategy），定义了一系列的算法，并将每一个算法封装起来，而且使它们还可以相互替换。策略模式让算法独立于使用它的客户而独立变化。
```

### 迭代器模式 Iterator Pattern
![image](https://img-blog.csdnimg.cn/37acb4e0d8b142baaec3040ab32172a2.png)
```$xslt
迭代器模式（Iterator），提供一种方放顺序访问一个聚合对象中各个元素，而又不暴露该对象的内部表示。

当你需要访问一个聚集对象，而且不管这些对象是什么都需要遍历的时候，你就应该考虑用迭代器模式。当你需要对聚集有多种方式遍历时，也可以考虑使用迭代器模式。

简单来说，迭代器一般都是和集合同时出现的，只要定义了一个集合，一般都需要提供一个迭代器用来遍历集合内的元素。先举例一个自定义的集合和他的迭代器：
1.定义抽象迭代器类，一般都需要得到开始对象、下一个对象、是否遍历完、获取当前遍历到的集合内的元素
2.抽象集合类，拥有一个创建迭代器的抽象方法，添加元素，获取集合的元素个数，以及获取集合中某个元素的方法
3.抽象集合类的实现类
4.抽象迭代器的实现类
```
 

### 模板模式 Template Pattern
![image](https://img-blog.csdnimg.cn/d0aab20fe7324f8eb6d2f83b3b52a225.png)
```$xslt
模板方法模式（Template），定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
    
举例：
现在有很多体育运动都是计时运动，比如篮球、足球等，都需要在比赛开始时计时，等时间到后停止比赛，
但是中间的比赛方式各不相同。展示每种比赛的流程就可以用模板模式来实现。
```
 
### 访问者模式 Visitor Pattern
![image](https://img-blog.csdnimg.cn/75cb233f40004d34bdbf93f0db3f6bdb.png)
```$xslt
1.Visitor 抽象访问者角色，为该对象结构中具体元素角色声明一个访问操作接口。该操作接口的名字和参数标识了发送访问请求给具体访问者的具体元素角色，
这样访问者就可以通过该元素角色的特定接口直接访问它。 2.ConcreteVisitor.具体访问者角色，实现Visitor声明的接口。
3.Element 定义一个接受访问操作(accept())，它以一个访问者(Visitor)作为参数。
4.ConcreteElement具体元素，实现了抽象元素(Element)所定义的接受操作接口。
5.ObjectStructure结构对象角色，这是使用访问者模式必备的角色。它具备以下特性
能枚举它的元素；可以提供一个高层接口以允许访问者访问它的元素；如有需要，可以设计成一个复合对象或者一个聚集（如一个列表或无序集合。

1、 一个对象结构包含很多类对象，它们有不同的接口，而你想对这些对象实施一些依赖于其具体类的操作。
2、需要对一个对象结构中的对象进行很多不同的并且不相关的操作，而你想避免让这些操作“污染”这些对象的类。Visitor模式使得你可以将相关的操作集中起来定义在一个类中。 
3、 当该对象结构被很多应用共享时，用Visitor模式让每个应用仅包含需要用到的操作。
4、定义对象结构的类很少改变，但经常需要在此结构上定义新的操作
。改变对象结构类需要重定义对所有访问者的接口，这可能需要很大的代价。如果对象结构类经常改变，那么可能还是在这些类中定义这些操作较好。
```

### 过滤器模式 Filter、Criteria Pattern
```$xslt

```

### 空对象模式 Null Object Pattern
```$xslt

```

## 	J2EE 模式

### MVC 模式 MVC Pattern
```$xslt

```

### 业务代表模式 Business Delegate Pattern
```$xslt

```

### 组合实体模式 Composite Entity Pattern
```$xslt

```

### 数据访问对象模式 Data Access Object Pattern
```$xslt

```

### 前端控制器模式 Front Controller Pattern
```$xslt

```

### 拦截过滤器模式 Intercepting Filter Pattern
```$xslt

```

### 服务定位器模式 Service Locator Pattern
```$xslt

```

### 传输对象模式 Transfer Object Pattern
```$xslt

```