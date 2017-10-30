package mvc.form.bean;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class CountryFormBean {

	public CountryFormBean(){}

	@NotNull (message="{NotNull.countryFormBean.name}")
	@Size(min = 2, max = 20)
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Country [firstName=" + name + "]";
	}
}
