package de.adesso.wickedcharts.chartjs.jackson.serializer;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import de.adesso.wickedcharts.chartjs.chartoptions.valueType.FloatValue;

public class FloatValueSerializer extends JsonSerializer<FloatValue> {

	@Override
	public void serialize(FloatValue value, JsonGenerator gen, SerializerProvider serializers)
			throws IOException, JsonProcessingException {
		gen.writeNumber(value.getValue());
	}

}
