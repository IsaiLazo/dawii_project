package com.proyecto.demo.servicio;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.proyecto.demo.service.UsuarioService;
import com.proyecto.demo.entity.Usuario;

@Service
public class UserService implements UserDetailsService  {
	@Autowired
	private UsuarioService usuarioService;
	
	
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserDetails userDet=null;
		
		Usuario bean=usuarioService.iniciaSesion(username);
		
		Set<GrantedAuthority> rol=new HashSet<GrantedAuthority>();
		rol.add(new SimpleGrantedAuthority(bean.getRol().getDescripcion()));
		
		userDet=new User(username, bean.getPassword(),rol);
		
		return userDet;
	}

}
