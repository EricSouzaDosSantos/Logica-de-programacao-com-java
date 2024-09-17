package aula_05;

public class Acess {

    private String name;
    private int old;

    public Acess(int old, String name){
        this.old = old;
        this.name = name;
    }

    public void acessControl(){
        if(old >= 18){
            System.out.println(name+" está liberado pois tem mais de 18 anos");
        }else{
            System.out.println(name+" não pode passar pois é menor de 18 anos");
        }
    }

}
