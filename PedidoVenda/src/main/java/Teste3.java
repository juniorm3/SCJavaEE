import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.algaworks.pedidovenda.model.Categoria;
import com.algaworks.pedidovenda.model.Produto;

public class Teste3 {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("PedidoPU");
		EntityManager manager = factory.createEntityManager();

		EntityTransaction trx = manager.getTransaction();

		trx.begin();

//		Categoria categoriaPai = new Categoria();
//		categoriaPai.setDescricao("Bebidas");
//		
//		Categoria categoriaFilha = new Categoria();
//		categoriaFilha.setDescricao("Refrigerantes");
//		categoriaFilha.setCategoriaPai(categoriaPai);
//		
//		categoriaPai.getSubCategoria().add(categoriaFilha);
//		
//		manager.persist(categoriaPai);
//		
//		Produto produto = new Produto();
//		produto.setCategoria(categoriaFilha);
//		produto.setNome("Guaraná 2L");
//		produto.setQuantidadeEstoque(10);
//		produto.setSku("GUA00123");
//		produto.setValorUnitario(new BigDecimal(2.21));
//		
//		manager.persist(produto);
		
		trx.commit();
	}

}
