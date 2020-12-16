package es.um.asio.abstractions.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ManagementBusEvent implements Serializable{

	private static final long serialVersionUID = -1566782793224542923L;

	private String idModel;
	
	private String model;
	
	private Object linkedModel;
	
	private String className;
		
	private Operation operation;
}
