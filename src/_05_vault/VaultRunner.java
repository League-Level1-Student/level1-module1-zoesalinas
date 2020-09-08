package _05_vault;

public class VaultRunner {
public static void main(String[] args) {
	Vault vault = new Vault();
	JamesBondon james = new JamesBondon();
	int code = james.findCode(vault);
	System.out.println(code);
}
}
