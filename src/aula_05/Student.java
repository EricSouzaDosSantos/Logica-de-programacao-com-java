package aula_05;

public class Student {

    private String name;

    private int note;

    public Student(String name, int note){
        this.name = name;
        this.note = note;
    }

    public void Situation(){
        if(note >= 7){
            System.out.println("Parabéns "+name+" você foi aprovado");
        }else if(note > 5 && note < 7){
            System.out.println("Infelizmente você ficou de recuperação "+name);
        }else{
            System.out.println(name+" foi retido(a)");
        }
    }
}
