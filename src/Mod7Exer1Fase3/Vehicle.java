package Mod7Exer1Fase3;

class Vehicle {
    protected String plateNombre;
    protected String plateChar;
    protected String brand;
    protected String color;
    protected String brandRodes;
    protected double diametre;
    
    public Vehicle(String plateNombre, String plateChar, String brand, String color) {
        this.plateNombre = plateNombre;
        this.plateChar = plateChar;
        this.brand = brand;
        this.color = color;
    }
    
    public Vehicle(String brandRodes, double diametre){
        this.brandRodes = brandRodes;
        this.diametre = diametre;
    }
    
    public void setNombre(String plateNombre)throws Exception{
        if(plateNombre.length() == 4){
            this.plateNombre = plateNombre;
        }else{
            throw new Exception();
        }
    }
    
    public String getMatriculaNombre(){
        return  plateNombre;
    } 
    
    public void setLletres(String plateChar) throws Exception{
        if(plateChar.length() == 2 || plateChar.length() == 3){
            this.plateChar = plateChar;
        }else{
            throw new Exception();
        }
    }
    
    public String getMatriculaChar(){
        return plateChar;
    }
        
    public void setMarca(String brand){
        this.brand = brand;
    }
        
    public String getMarca(){
        return brand;
    }
        
    public void setColor(String color){
        this.color = color;
    }
        
    public String getColor(){
        return color;
    }
    
    public void setBrandRodes(String brandRodes){
        this.brandRodes = brandRodes;
    }
    
    public String getBrandRodes(){
        return brandRodes;
    }
    
    public void setDiametre(double diametre) throws Exception{
        if(diametre < 0.4 || diametre > 4){
            throw new Exception();
        }else{
            this.diametre = diametre;
        }
    }
    
    public double getDiametre(){
        return diametre;
    }
}     
        

