package br.com.caelum.eats.dto;

import java.math.BigDecimal;

import br.com.caelum.eats.model.ItemDoCardapio;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ItemDoCardapioDto {

	private Long id;
	private String nome;
	private String descricao;
	private BigDecimal preco;
	private BigDecimal precoPromocional;

	public ItemDoCardapioDto(ItemDoCardapio item) {
		this(item.getId(), item.getNome(), item.getDescricao(), item.getPreco(), item.getPrecoPromocional());
	}

}
