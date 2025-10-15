package iuh.fit.opp;

public enum AccountStatus {
	ACTIVE("Dang hoat dong"),
	INACTIVE("khong hoat dong"),
	CLOSE("Da dong");
	
	private String value;

	private AccountStatus(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public String toString() {
		return value;
	}
	
}
