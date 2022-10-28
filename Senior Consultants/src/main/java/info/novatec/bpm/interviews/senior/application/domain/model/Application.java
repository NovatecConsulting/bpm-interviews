package info.novatec.bpm.interviews.senior.application.domain.model;

public class Application {

	private String key;
	private String name;

	public Application() {

	}

	public Application(String key, String name) {
		this.key = key;
		this.name = name;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
