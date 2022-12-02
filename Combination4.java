//case 4
//not allowed
//multiple inheritance

class Demo
{
    int i;
    void fun()
    {}
}

class Hello extends Demo
{
    int i;
    void fun()
    {}
}

class Marvellous extends Demo, Hello
{

}