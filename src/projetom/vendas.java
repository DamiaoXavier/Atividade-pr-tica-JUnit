/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetom;

/**
 *
 * @author damião Xavier
 */
public class vendas {
    public static int quatidadeProduto;
    public static double precoProduto;
    public static double valorTotal;

    public static int getQuatidadeProduto() {
        return quatidadeProduto;
    }

    public static double getPrecoProduto() {
        return precoProduto;
    }

    public static double getValorTotal(int quantidade, int preco) {
        int valor = quantidade * preco;
        return valorTotal;
    }
}