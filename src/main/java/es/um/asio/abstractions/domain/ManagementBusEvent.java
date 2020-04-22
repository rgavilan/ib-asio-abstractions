package es.um.asio.abstractions.domain;

import es.um.asio.abstractions.domain.Operation;
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
public class ManagementBusEvent {

	private String idModel;
	
	private String model;
		
	private Operation operation;
}
