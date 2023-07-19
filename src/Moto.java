import java.util.ArrayList;

public class Moto extends Veiculo{
    private int id;
    private String placa;
    private String cilindrada;

    public static ArrayList<Moto> motos = new ArrayList<Moto>();
   
    public Moto(
        int id,
        String nome,
        String placa, 
        String cilindrada
    ){
        super(id, nome);
        this.placa = placa;
        this.cilindrada = cilindrada;

        motos.add(this);
    }

    public int getId(){
        return id;
    }
    public int setId9(int id){
        return this.id = id;
    }

    public String getPlaca(){
        return placa;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public String getCilindrada(){
        return cilindrada;
    }
    
    public void setCilindrada(String cilindrada){
        this.cilindrada = cilindrada;
    }
    
    public static Moto getMoto(int id) throws Exception{
        for(Moto moto : motos){
            if(moto.getId() == id){
                return moto;
            }
        }
        throw new Exception ("Moto não encontrado");
    }

    public static void removeMoto(int id) throws Exception{
        Moto moto = getMoto(id);
        motos.remove(moto);
    }

    @Override 
    public String toString() {
        return "Id: " + super.getId() + "\n"
        + "Nome: " + super.getNome() + "\n"
        + "Placa: " + this.getPlaca() + "\n"
        + "Cilindrada: " + this.getCilindrada() + "\n";
    }
}