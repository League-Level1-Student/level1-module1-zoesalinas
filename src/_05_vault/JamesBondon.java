package _05_vault;

public class JamesBondon {
int findCode(Vault vault) {
	for (int i = 0; i < 1000000; i++) {
		boolean codeFound = vault.tryCode(i);
		if(codeFound) {
			return i;
		}
	}
	return -1;
}
}

