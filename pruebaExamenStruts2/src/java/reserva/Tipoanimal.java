package reserva;



/**
 * Tipoanimal generated by hbm2java
 */
public class Tipoanimal  implements java.io.Serializable {


     private Integer id;
     private String animal;

    public Tipoanimal() {
    }

    public Tipoanimal(String animal) {
       this.animal = animal;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getAnimal() {
        return this.animal;
    }
    
    public void setAnimal(String animal) {
        this.animal = animal;
    }




}


