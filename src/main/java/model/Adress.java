package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Adress {

    private String city;
    private String street;
    private String zipCode;
    private String neighborhood;
    private String uf;

    public Adress(APIZipcodeQuery APIZipcodeQuery) {
        this.city = APIZipcodeQuery.localidade();
        this.street = APIZipcodeQuery.logradouro();
        this.zipCode = APIZipcodeQuery.cep();
        this.neighborhood = APIZipcodeQuery.bairro();
        this.uf = APIZipcodeQuery.uf();
    }

    @Override
    public String toString() {
        return "**** Adress ****" + "\n" +
                "city: " + this.city +
                ", street: " + this.street +
                ", zipCode: " + this.zipCode +
                ", neighborhood: " + this.neighborhood +
                ", uf: " + this.uf;
    }
}
