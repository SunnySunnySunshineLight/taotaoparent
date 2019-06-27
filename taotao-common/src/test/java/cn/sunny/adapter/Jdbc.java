package cn.sunny.adapter;

/**
 * @ClassName
 * @Description TODO
 * @Author sunny
 * @Date 2019-6-17 17:09
 * @Version 1.0
 **/
public class Jdbc implements Mysql,Oracle{
    public Mysql mysql;
    public Oracle oracle;
    public Jdbc(){

    }

    public Jdbc(Mysql mysql){
        this.mysql = mysql;
    }

    public Jdbc(Oracle oracle){
        this.oracle = oracle;
    }

    public void connectMysql(){
        System.out.println("Connect to Mysql");
    }

    public void connectOracle(){
        System.out.println("Connect to Oracle");
    }
}
