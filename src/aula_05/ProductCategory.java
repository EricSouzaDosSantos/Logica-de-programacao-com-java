package aula_05;

public class ProductCategory {

    private int idProduct;
    private String category;

    public ProductCategory(int idProduct){
        this.idProduct = idProduct;
    }

    public void Category(String name){
        switch (idProduct){
            case 1:
                category = "Eletronico";
                System.out.println(name+" foi categorizado(a) como eletronico");
                break;
            case 2:
                category = "Alimento";
                System.out.println(name+" foi categorizado(a) como Alimento");
                break;
            case 3:
                category = "Vestuário";
                System.out.println(name+" foi categorizado(a) como VEstuario");
                break;
        }
    }
}
