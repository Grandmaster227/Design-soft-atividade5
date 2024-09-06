public class Cliente {
    private String name;
    private String CPF;


    public Cliente(String name, String CPF) {
        this.name = name;
        this.CPF = CPF;
    }

    public String getNome() {
        return name;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF= CPF;
    }

    public void setName(String name) {
        this.name = name;
    }


}
