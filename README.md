# learnJVMdemo
学习JVM过程中的一些demo程序，这些demo程序是为了更好的理解jvm的原理及运行。

1、TestStackFrame.java是通过对java代码利用javap或者jclasslib阅读class文件的信息，观察线程运行时栈的变化，利用断点进入debug模式，观察进栈和出栈的栈帧和局部变量表的变化
2、TestPlusPlus.java是通过分析i++和++i产生的字节码，来分析i++和++i的区别。二者的区别就在于inc 1 by 1指令和iload_1的先后顺序。++i是inc 1 by 1指令在前，iload_1指令顺序在后。I++是iload_1指令顺序在前，inc 1 by 1指令在后。
3、OperatorStackTest.java是为了观察线程运行时栈帧中的操作数栈和局部变量表的变化（线程运行时，有一个线程栈，每一个方法的调用都对应了线程栈中的一个栈帧，一个栈帧中包括局部变量表、操作数栈、动态链接、方法返回地址、一些附加信息）。
4、AnalyseJClassLib.java是为了分析jclasslib插件反编译出的class文件信息的具体结构
