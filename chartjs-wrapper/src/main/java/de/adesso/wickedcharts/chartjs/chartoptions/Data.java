package de.adesso.wickedcharts.chartjs.chartoptions;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import de.adesso.wickedcharts.chartjs.chartoptions.label.Label;
import lombok.experimental.Accessors;
@JsonAutoDetect(
		  fieldVisibility = JsonAutoDetect.Visibility.ANY,
		  getterVisibility = JsonAutoDetect.Visibility.NONE,
		  setterVisibility = JsonAutoDetect.Visibility.NONE,
		  creatorVisibility = JsonAutoDetect.Visibility.NONE
		)
@Accessors(chain = true)
@lombok.Data
public class Data {
	
	@JsonProperty("labels")
	private List<? extends Label> labels;
	@JsonProperty("datasets")
	private List<Dataset> datasets;
	@JsonProperty("xLabels")
	private List<? extends Label> xLabels;
	@JsonProperty("yLabels")
	private List<? extends Label> yLabels;
}
