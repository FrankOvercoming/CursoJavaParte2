package aplicacoes;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

import entidades.MapsProduto;

public class MapsComProduto {
	
	public static void main(String[] args) {
		
		Map<MapsProduto, Double> prodEstoque = new TreeMap<MapsProduto, Double>();
		prodEstoque.put(new MapsProduto("TV", 3000.00) , 5.00);
		prodEstoque.put(new MapsProduto("Microondas", 450.66), 11.00);
		prodEstoque.put(new MapsProduto("Notebook", 6989.12) , 12.00);
		
		MapsProduto produto = new MapsProduto("TV", 3000.00);
		
		System.out.println("ContainsKey produto: " + prodEstoque.containsKey(produto));
		
		for ( Map.Entry<MapsProduto, Double> mapProds : prodEstoque.entrySet() ) {
			System.out.println(mapProds.getKey() + "," + mapProds.getValue());
			
			
		}
		// Não se pode fazer "for" para Maps diretamente apenas usando
		// keySet() ou entrySet()
		// Regra para Map
		// Regra para Iterator
		// Regra para for no Map
	}
	
	

}
