
-> Inserciones iniciales en la base de datos: 

INSERT INTO roles (role_id, name) VALUES 
(1, 'ADMIN'),
(2, 'CAJERO');
select * from roles;
INSERT INTO permissions (permission_id, name) VALUES 
(1, 'FULL_ACCESS'),
(2, 'INVENTORY'),
(3, 'BILLING');

INSERT INTO se_role_permission(rp_role_id, rp_permission_id) VALUES 
(1, 1);

INSERT INTO se_role_permission(rp_role_id, rp_permission_id) VALUES 
(2, 2),
(2, 3);