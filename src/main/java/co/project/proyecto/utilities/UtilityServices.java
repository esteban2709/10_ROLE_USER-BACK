package co.project.proyecto.utilities;

import java.util.HashMap;

public class UtilityServices {
	
	/**
	 * Retorna un hashmap que contiene el resultado de una operacion determinada
	 * @param status Estado de la opreracion
	 * @param entity Entidad
	 * @param messageOperation Mensaje de la operacion
	 * @return hashmap con el estado y mensaje de la operacion
	 */
	public static HashMap<String, Object> resultOperation(boolean status, String entity, String messageOperation){
		HashMap<String, Object> map = new HashMap<>();
		map.put("status", status);
		map.put("message", entity +" " +messageOperation);
		return map;
	}

}
