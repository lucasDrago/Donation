/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.teste;

import site.Usuario;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.SessaoHibernate;

/**
 *
 * @author aluno
 */
public class testeHibernate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Session sessao = SessaoHibernate.nova();
        Usuario user = new Usuario();
        user.setEmail("sonserina.nao.drago@gmail.com");
        user.setNome_completo("Lucas");
        user.setSenha("123");
        user.setNome_social("Sr_drago");

        System.out.println("SALVANDO USUARIO");
        Transaction tx = sessao.beginTransaction();
        sessao.save(user);
        tx.commit();
        System.out.println("USUARIO SALVO");
        sessao.close();
        System.out.println("SESSAO FECHADA");

        // TODO code application logic here
    }

}
