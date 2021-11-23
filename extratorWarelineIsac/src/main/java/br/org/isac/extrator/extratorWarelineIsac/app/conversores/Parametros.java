package br.org.isac.extrator.extratorWarelineIsac.app.conversores;

import java.util.Arrays;
import java.util.List;

public class Parametros {

	/**
	 * Para cada WAR, deve ser alterado aqui :
	 * UNDIDADE_SCHEDULE > para localizar a hora de executar o agendamento. mesmo para servidores com mais de uma unidade, deve ser informada apenas UMA;
	 * IDS_UNIDADES > Para localizar as undidades que o servidor deve executar. Deve-se incluir todas, no caso de servidor que contenha mais de uma unidade;
	 */
	public static final Integer UNDIDADE_SCHEDULE = 12;
	private static final Integer[] IDS_UNIDADES = {12};
	public static final List<Integer> UNIDADES = Arrays.asList(IDS_UNIDADES);
}
