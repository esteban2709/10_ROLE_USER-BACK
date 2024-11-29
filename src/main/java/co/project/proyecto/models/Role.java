package co.project.proyecto.models;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "roles")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long id;
    private String name;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "se_role_permission", joinColumns = { @JoinColumn(name = "rp_role_id") }, inverseJoinColumns = {
			@JoinColumn(name = "rp_permission_id") }, 
            inverseForeignKey = @ForeignKey(name = "fk_role_permission_permission_id"), 
            foreignKey = @ForeignKey(name = "fk_role_permission_role_id"))
	private Set<Permission> permissions;
}
