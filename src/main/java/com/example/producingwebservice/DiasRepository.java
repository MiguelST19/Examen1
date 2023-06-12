package com.example.producingwebservice;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Dia;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class DiasRepository {
	private static final Map<String, Dia> dias = new HashMap<>();

	@PostConstruct
	public void initData() {
		Dia lunes = new Dia();
		lunes.setName("Lunes");
		lunes.setTraductor("Monday");

		dias.put(lunes.getName(), lunes);

		Dia martes = new Dia();
		martes.setName("Martes");
		martes.setTraductor("Tuesday");

		dias.put(martes.getName(), martes);

		Dia miercoles = new Dia();
		miercoles.setName("Miercoles");
		miercoles.setTraductor("Wednesday");

		dias.put(miercoles.getName(), miercoles);

		Dia jueves = new Dia();
		jueves.setName("Jueves");
		jueves.setTraductor("Thursday");

		dias.put(jueves.getName(), jueves);

		Dia viernes = new Dia();
		viernes.setName("Viernes");
		viernes.setTraductor("Friday");

		dias.put(viernes.getName(), viernes);

		Dia sabado = new Dia();
		sabado.setName("Sabado");
		sabado.setTraductor("Saturday");

		dias.put(sabado.getName(), sabado);

		Dia domingo = new Dia();
		domingo.setName("Domingo");
		domingo.setTraductor("Sunday");

		dias.put(domingo.getName(), domingo);
	}

	public Dia finDia(String name) {
		Assert.notNull(name, "The day's name must not be null");
		return dias.get(name);
	}
}