package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	private Integer id;
	private String fullName;
	private String email;
	private String phoneNumber;
	private Integer status;
}
