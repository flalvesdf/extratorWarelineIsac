package br.org.isac.extrator.extratorWarelineIsac.app.conversores;

import java.util.Arrays;
import java.util.List;

public class Parametros {

	/**
	 * INSTRUCOES PARA GERAR O ARQUIVO .WAR PARA CADA UNIDADE
	 * 
	 * Para cada WAR, deve ser alterado nesta classe :
	 * 
	 * 1) UNDIDADE_SCHEDULE:
	 * Para localizar a hora de executar o agendamento. Mesmo para servidores com mais de 
	 * uma unidade, deve ser informada apenas UMA;
	 * 
	 * 2) IDS_UNIDADES:
	 * Para localizar as undidades que o servidor deve executar. 
	 * Deve-se incluir todas, no caso de servidor que contenha mais de uma unidade;
	 * 
	 * Observação:
	 * 
	 * 1) Para gerar o arquivo WAR de uma determinada unidade, deve alterar também
	 * o arquivo application.properties, descomentando apenas a linha referente a 
	 * unidade que se deseja gerar o arquivo WAR;
	 * 2) Alterar o arquivo pom.xml: 
	 * - na tag <artifactId> com o indicador da unidade no formato
	 * unidade-CODIGO DA UNIDADE. Exemplo: <artifactId>unidade-01</artifactId>
	 * - na tag <name> com o indicador da unidade no formato
	 * unidade-CODIGO DA UNIDADE. Exemplo: <name>unidade-01</name>
	 * 
	 */
	public static final Integer UNDIDADE_SCHEDULE = 1;
	private static final Integer[] IDS_UNIDADES = {1};
	public static final List<Integer> UNIDADES = Arrays.asList(IDS_UNIDADES);
}
