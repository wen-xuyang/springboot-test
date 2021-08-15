package com.example.demo;
public class 许愿机 {
    long 被召唤的次数 = 1;

    public void 初始化() {
        System.out.println("我是万能的许愿机，今天终于重见天日，无论多么离谱的愿望，我都可以实现。");}
    public void 实现愿望(许愿者 wisher) {
        try {
            System.out.println("我是许愿机，这是我第" + 被召唤的次数++ + "次帮人们实现愿望。");
            System.out.println("根据隐私保护的规定，我不可以询问许愿者的信息，就连名字也不可以。");
            System.out.println("那就废话少说,开始许愿吧。");
            wisher.使用许愿机(this);
        } catch (Throwable e) {
            //原以为抛出来的是exception，仔细一看原来是error，
            启动自毁程序();
            System.out.println(e.toString());
        }}
    void 启动自毁程序() {
        System.out.println("竟然有我无法实现的愿望，这真是太离谱了！");
        System.out.println("毁灭吧，我累了。");};
    public static void main(String[] args) {
        许愿机 许愿机 = new 许愿机();
        许愿机.初始化();
        陷入爱恋的许愿者 大雄 = new 陷入爱恋的许愿者("大雄", null);
        陷入爱恋的许愿者 静香 = new 陷入爱恋的许愿者("静香", 大雄);
        大雄.爱慕的人 = 静香;
        大雄.使用许愿机(许愿机);}
}
interface 许愿者 {
    void 说出愿望();
    void 使用许愿机(许愿机 许愿机);
}
class 陷入爱恋的许愿者 implements 许愿者 {
    public String 姓名;
    public 陷入爱恋的许愿者 爱慕的人;
    public 陷入爱恋的许愿者(String 姓名, 陷入爱恋的许愿者 爱慕的人) {
        this.姓名 = 姓名;
        this.爱慕的人 = 爱慕的人;}
    @Override
    public void 说出愿望() {
        System.out.println("我是" + 姓名 +",  "+ "我想实现" + 爱慕的人.姓名 + "的愿望！");}
    @Override
    public void 使用许愿机(许愿机 许愿机) {
        说出愿望();
        许愿机.实现愿望(爱慕的人);}
}
