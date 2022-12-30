package com.javelot.model.entities.projections;

import com.javelot.model.entities.CityInfo;
import org.springframework.data.rest.core.config.Projection;

@Projection(
        name = "projectDateAndTemperature",
        types = {CityInfo.class})
public interface ProjectDateAndTemperature {
    String getDate();
    String getTemperature();
}
