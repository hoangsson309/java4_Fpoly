package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "NSX")
public class NSX {
	@Id
	@GeneratedValue
	private UUID id;
	
	@Column(name = "Ma")
	private String ma;
	
	@Column(name = "Ten")
	private String ten;
}