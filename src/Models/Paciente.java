/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author julianob
 */
public class Paciente {

    private String nome;
    private String cpf;
    private String telefone;
    private String data;
    private String JaEraPaciente;


    public Paciente(String nome, String cpf, String telefone, String data, String JaEraPaciente) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.data = data;
        this.JaEraPaciente = JaEraPaciente;
       
    }

    public String getJaEraPaciente() {
        return JaEraPaciente;
    }

    public void setJaEraPaciente(String JaEraPaciente) {
        this.JaEraPaciente = JaEraPaciente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
