package com.mercadolindo.factory.voFactory;

import java.util.List;
import java.util.stream.Collectors;

import com.mercadolindo.entity.EnderecoEntity;
import com.mercadolindo.model.EnderecoVo;

public class EnderecoVOFactory {

	public static List<EnderecoVo> converteParaVO(List<EnderecoEntity> enderecos) {
		
		if(!enderecos.isEmpty()) {
			return enderecos.stream().map(EnderecoVOFactory::converteParaVO).collect(Collectors.toList());
		}

		return null;
	}

	public static EnderecoVo converteParaVO(EnderecoEntity endereco) {
		
		EnderecoVo vo = new EnderecoVo();	
		vo.setBairro(endereco.getBairro());
		vo.setCep(endereco.getCep());
		vo.setEnderecoPrincipal(endereco.getFlagEnderecoPrincipal());
		vo.setId(endereco.getId());
		vo.setIdMunicipio(endereco.getId());
		vo.setNomeRua(endereco.getRua());
		vo.setNumeroCasa(endereco.getNumero());
		
		return vo;
	}

}
