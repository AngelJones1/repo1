package people;

public class BeijingPeople extends People {
    @Override
    public void averageHeight() {
        height=172.5;
        System.out.println("北京人的平均身高："+height+"厘米");
        //重写public void averageHeight()方法, 输出:"北京人的平均身高:172.5厘米"
    }

    @Override
    public void averageWeight() {
        weight=70;
        System.out.println("北京人的平均体重:"+weight+"公斤");
    }

    //重写public void averageWeight()方法,输出:"北京人的平均体重:70公斤"
    public void beijingOpera() {
        System.out.println("花脸、青衣、花旦和老生");
    }

    public void chinaGongfu() {
        System.out.println("中国功夫");
    }
}
