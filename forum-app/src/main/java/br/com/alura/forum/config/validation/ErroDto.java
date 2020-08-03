package br.com.alura.forum.config.validation;

public class ErroDto {

    private final String campo;
    private final String erro;

    public ErroDto(String campo, String erro) {
        this.campo = campo;
        this.erro = erro;
    }

    public String getCampo() {
        return campo;
    }

    public String getErro() {
        return erro;
    }

}
